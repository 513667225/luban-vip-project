package com;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要视频资料的可以添加白浅老师的QQ：2207192173
 * author：鲁班学院-商鞅老师
 */
public class Test {


    public static final String QUEUE_NAME  = "testQueue";

    public static  final  String EXCHANGE_NAME = "exchange";



    public static Connection getConnection() throws Exception{
        //创建一个连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置rabbitmq 服务端所在地址 我这里在本地就是本地
        connectionFactory.setHost("192.168.0.121");
        //设置端口号，连接用户名，虚拟地址等
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("admin");
        connectionFactory.setVirtualHost("testhost");
        return connectionFactory.newConnection();
    }



        public static void main(String[] args) throws Exception {
            String message ="message";
            Connection connection = getConnection();
            Channel channel = connection.createChannel();
//            //声明队列
//            channel.queueDeclare(QUEUE_NAME,true,false,false,null);
//            // 声明exchange
//            channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
            //交换机和队列绑定
//            channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "");
            channel.basicPublish("direct.exchange", "stock", null, message.getBytes());
            System.out.println("发送的信息为:" + message);
            channel.close();
            connection.close();
        }




}
