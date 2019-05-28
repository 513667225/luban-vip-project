package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 需要咨询java高级VIP课程的同学可以加白浅老师的QQ：2207192173
 * 需要视频资料的可以添加妮可老师的QQ：2860884084
 * author：鲁班学院-商鞅老师
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class AppAdmin {

    public static void main(String[] args) {
        SpringApplication.run(AppAdmin.class);
    }
}
