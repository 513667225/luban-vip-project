package com.template;

import com.modules.product.service.RedisLock;
import com.modules.product.util.R;
import com.systemConst.CacheConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class CacheTemplate<T> {




    @Autowired
    private ValueOperations<String,Object> valueOperations;

    @Autowired
    private RedisLock redisLock;


    public R findCache(String key, long expire, TimeUnit unit, CacheLoadble<T> cacheLoadble){
        //查询商品缓存缓存
        Object redisObj = valueOperations.get(CacheConst.PRODUCT_CACHE_KEY+String.valueOf(key));
        if(redisObj!=null){
            return R.success("success",redisObj);
        }
        try {
            redisLock.lock(key);
            redisObj = valueOperations.get(String.valueOf(key));
            if(redisObj!=null){
                return R.success("success",redisObj);
            }
            T load = cacheLoadble.load();
            valueOperations.set(CacheConst.PRODUCT_CACHE_KEY+String.valueOf(key), load,expire, unit);  //加入缓存
            return R.success("success",load);
        }finally {
            redisLock.unlock(key);
        }
    }





}
