package com.modules.product.service;

import com.modules.product.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.modules.product.util.R;

import java.util.List;
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

    R gerProduct(Map<String,Object> map);

    R updateStock(Map<String,Object> map) throws Exception;

    R getProductByid(String id);

   List<Map<String,Object>> getAllStocks();

    R getAdminProduct(Map<String, Object> map,int page,int limit);
}
