package com.modules.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.ReturnType;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCommands;

import java.util.UUID;

@Component
public class RedisLock{

    @Autowired
    RedisTemplate redisTemplate;

    private static final String KEYPREFIX="lock";


    public static final String UNLOCK_LUA;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("if redis.call(\"get\",KEYS[1]) == ARGV[1] ");
        sb.append("then ");
        sb.append("    return redis.call(\"del\",KEYS[1]) ");
        sb.append("else ");
        sb.append("    return 0 ");
        sb.append("end ");
        UNLOCK_LUA = sb.toString();
    }

    //ThreadLocal用于保存某个线程共享变量：对于同一个static ThreadLocal，不同线程只能从中get，set，remove自己的变量，而不会影响其他线程的变量
    private static ThreadLocal<String> threadLocal=new ThreadLocal<>();


    public void lock(String key) {
        boolean b = tryLock(key);
        if(b){
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock(key);
    }



    public boolean tryLock(String key) {
        String uuid = UUID.randomUUID().toString();
        RedisCallback<String> callback = (connection) -> {
            JedisCommands commands = (JedisCommands) connection.getNativeConnection();
            return commands.set(KEYPREFIX+key, uuid, "NX", "PX", 60000);
        };
        Object execute = redisTemplate.execute(callback);
        if(execute!=null){
            threadLocal.set(uuid);
            return true;
        }
        return false;
    }


    public void unlock(String key) {
        RedisCallback redisScript=new RedisCallback() {
            @Nullable
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                Object eval = redisConnection.eval(UNLOCK_LUA.getBytes(), ReturnType.fromJavaType(Long.class), 1, (KEYPREFIX + key).getBytes(), threadLocal.get().getBytes());
                return eval;
            }
        };
        redisTemplate.execute(redisScript);
    }

}
