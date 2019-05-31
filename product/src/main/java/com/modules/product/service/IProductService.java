package com.modules.product.service;

import com.modules.product.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.modules.product.util.R;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
public interface IProductService extends IService<Product> {

    public R gerProduct(Map<String,Object> map);

    public R updateStock(Map<String,Object> map) throws Exception;
}
