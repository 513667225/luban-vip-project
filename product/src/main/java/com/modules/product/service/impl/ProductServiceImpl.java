package com.modules.product.service.impl;

import com.modules.product.entity.Product;
import com.modules.product.mapper.ProductMapper;
import com.modules.product.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.product.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

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

    @Override
    public R gerProduct(Map<String, Object> map) {
        return R.success("success",mapper.selectByMap(map));
    }

    @Override
    public R updateStock(Map<String, Object> map) {
        Product product = new Product();
        product.setId((Integer) map.get("productId"));
        product.setStock((Integer) map.get("stock"));
        mapper.updateById(product);
        return R.success("success");
    }
}
