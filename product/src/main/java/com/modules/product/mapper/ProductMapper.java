package com.modules.product.mapper;

import com.modules.product.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
public interface ProductMapper extends BaseMapper<Product> {
    public int updateStock(Map<String,Object> map);

    public List<Map<String,Object>> selectStockAll();
}
