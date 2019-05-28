package com.modules.order.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.modules.order.entity.Order;
import com.modules.order.feginService.ProductServiceClient;
import com.modules.order.mapper.OrderMapper;
import com.modules.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.order.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Transactional
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {


    @Autowired
    OrderMapper mapper;

    @Autowired
    ProductServiceClient productServiceClient;

    @Override
    public R placeOrder(Order order,int count,String productId) {
         mapper.insert(order);
        productServiceClient.updateInventory(productId,count);
        return R.success("success");
    }

    @Override
    public R gerOrder(Map<String, Object> map) {
        Page<Order> page = new Page(Integer.parseInt((String)map.get("page")),Integer.parseInt((String)map.get("limit")));
        IPage<Order> orderIPage = mapper.selectPage(page,null);
        return R.success("success",orderIPage.getRecords()).set("count",orderIPage.getTotal());
    }
}
