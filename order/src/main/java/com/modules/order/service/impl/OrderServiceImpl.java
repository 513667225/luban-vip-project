package com.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.modules.order.entity.Order;
import com.modules.order.feginService.ProductServiceClient;
import com.modules.order.mapper.OrderMapper;
import com.modules.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.order.util.CacheConst;
import com.modules.order.util.R;
import com.modules.order.util.SendMessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
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
    SendMessageUtil sendMessageUtil;

    @Autowired
    ProductServiceClient productServiceClient;

    @Autowired
    private ValueOperations valueOperations;

    @Override
    public R placeOrder(Order order,int count,String productId) {
        Object redisObj = valueOperations.get(CacheConst.STOCK_CACHE_KEY+productId);
        if(Integer.valueOf(String.valueOf(redisObj))>= count){
            mapper.insert(order);
            //发送消息
            order.setId(Integer.parseInt(productId));
            sendMessageUtil.placeOrderMessage(order);
            return R.success("下单成功");
        }
        return R.error("库存不足");
    }

    @Override
    public R gerOrder(Map<String, Object> map,int page,int limit) {
        Page<Order> pageObj = new Page(page,limit);
        QueryWrapper queryWrapper = new QueryWrapper();
        map.remove("limit");
        map.remove("page");
        //name  null    where
        queryWrapper.allEq(map,false);
        queryWrapper.orderByDesc("id");
        IPage<Order> orderIPage = mapper.selectPage(pageObj,queryWrapper);
        return R.success("success",orderIPage.getRecords()).set("count",orderIPage.getTotal());
    }
}
