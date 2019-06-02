package com.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
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
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost",5672);
        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("admin");
        connectionFactory.setVirtualHost("testhost");
        //是否开启消息确认机制
        connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }

    public class MyReturnCallback implements RabbitTemplate.ReturnCallback {

        @Override
        public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
            System.out.println(message);
            System.out.println(replyCode);
            System.out.println(replyText);
            System.out.println(exchange);
            System.out.println(routingKey);
        }
    }

    public class MyConfirmCallback implements RabbitTemplate.ConfirmCallback{

        @Override
        public void confirm(CorrelationData correlationData, boolean ack, String cause) {
            System.out.println(correlationData);
            System.out.println(ack);
            System.out.println(cause);
        }
    }


    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setReturnCallback(new MyReturnCallback());
        template.setConfirmCallback(new MyConfirmCallback());
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
