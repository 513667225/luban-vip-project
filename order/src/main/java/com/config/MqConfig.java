package com.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要视频资料的可以添加白浅老师的QQ：2207192173
 * author：鲁班学院-商鞅老师
 */
@Configuration
public class MqConfig {


    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("192.168.0.121",5672);
        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("admin");
        connectionFactory.setVirtualHost("testhost");
        //是否开启消息确认机制
        //connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        return template;
    }



    @Bean
    public DirectExchange directExchange(){

        return  new DirectExchange("direct.exchange");
    }

    @Bean
    public Queue queue(){
        return new Queue("stock_queue");
    }


    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(directExchange()).with("stock");
    }


}
