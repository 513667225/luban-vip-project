package com.modules.order.service;

import com.modules.order.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.modules.order.util.R;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
public interface IOrderService extends IService<Order> {

    public R placeOrder(Order order,int count,String productId);


    public R gerOrder(Map<String,Object> map,int limit,int page);
}
