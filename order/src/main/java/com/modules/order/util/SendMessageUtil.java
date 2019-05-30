package com.modules.order.util;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要视频资料的可以添加白浅老师的QQ：2207192173
 * author：鲁班学院-商鞅老师
 */
@Component
public class SendMessageUtil {

    @Autowired
    RabbitTemplate rabbitTemplate;



    public void placeOrderMessage(Object order){
        String s = JSON.toJSONString(order);
        send(s,"stock");
    }

    public void send(Object message,String rouingkey){
        rabbitTemplate.convertAndSend("direct.exchange",rouingkey,message);
    }


}
