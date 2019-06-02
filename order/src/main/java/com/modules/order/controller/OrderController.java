package com.modules.order.controller;


import com.modules.order.entity.Order;
import com.modules.order.feginService.ProductServiceClient;
import com.modules.order.service.IOrderService;
import com.modules.order.util.R;
import com.modules.order.util.RedisUtil;
import com.modules.order.util.SendMessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
@RestController
public class OrderController {

    @Autowired
    IOrderService service;

    @Autowired
    ProductServiceClient productServiceClient;

    @Autowired
    SendMessageUtil sendMessageUtil;

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/placeOrder")
    public R placeOrder( String productId,  int count, HttpServletRequest request){
        String login_key = request.getHeader("login_key");
        if (StringUtils.isEmpty(login_key)){
            return  R.error("用户未登录");
        }
        Map<String,Object> user = (Map<String, Object>)redisUtil.get(login_key);
        if (user==null){
            return R.error("用户未登录");
        }

        R result = productServiceClient.getProduct(productId);
        Map<String,Object> map = (Map<String, Object>) result.get(R.DATA_KEY);
        Order order = new Order();
        double nowPrice = (double) map.get("nowPrice");
        order.setAmount(nowPrice*count);
        order.setFee(5D);
        order.setQuantity(count+"");
        order.setCreatedate(new Date());
        order.setAccount((String) user.get("username"));
        return   service.placeOrder(order,count,productId);
    }


    @RequestMapping("/getOrder")
    public R getOrder(@RequestParam Map<String,Object> map,int limit,int page){

        return service.gerOrder(map,page,limit);
    }


    @RequestMapping("/test")
    public R testSend(){
        sendMessageUtil.send("test","stock");
        return R.success("success");
    }
}
