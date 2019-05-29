package com.modules.order.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要往期视频的同学可以加木兰老师的QQ：2746251334
 * author：鲁班学院-商鞅老师
 */
@Component
public class RedisUtil {

    @Autowired
    RedisTemplate redisTemplate;



    public  Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }


    public  void set(String key,Object value){
         redisTemplate.opsForValue().set(key,value);
    }

}
