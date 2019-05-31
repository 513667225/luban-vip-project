package com.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.modules.product.entity.Product;
import com.modules.product.mapper.ProductMapper;
import com.modules.product.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.product.util.R;
import com.netflix.discovery.converters.Auto;
import com.template.CacheLoadble;
import com.template.CacheTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
   private ProductMapper mapper;

    @Autowired
    private ValueOperations valueOperations;

    @Autowired
    private CacheTemplate<Product> cacheTemplate;

    @Override
    public R gerProduct(Map<String, Object> map) {
        Object products1 = valueOperations.get("products");
        if(null==products1){
            List<Product> products = mapper.selectByMap(map);
            if(products!=null){
                valueOperations.set("products",products, 5,TimeUnit.MINUTES);
            }
            return R.success("success",products);
        }
        return R.success("success",products1);
    }

    @Override
    public R updateStock(Map<String, Object> map) throws Exception {
        int i = mapper.updateStock(map);
        if (i==0){
            throw new Exception("库存不足");
        }
        return R.success("success");
    }

    @Override
    public R getProductByid(String id) {
        return cacheTemplate.findCache(id, 5, TimeUnit.MINUTES, new CacheLoadble<Product>() {
            @Override
            public Product load() {
                return  mapper.selectById(id);
            }
        });
    }

    @Override
    public List<Map<String, Object>> getAllStocks() {
        return mapper.getStockAll();
    }

    @Override
    public R getAdminProduct(Map<String, Object> map, int page, int limit) {
        Page<Product> page1 = new Page<>(page, limit);
        mapper.selectPage(page1,null);
       return R.success("success",page1.getRecords()).set("count",page1.getTotal());
    }


    @PostConstruct
    public void init(){
        List<Map<String, Object>> allStocks = getAllStocks();
        for (Map<String, Object> allStock : allStocks) {
            valueOperations.set("id"+allStock.get("id"),allStock.get("stock"));
        }
    }

}
