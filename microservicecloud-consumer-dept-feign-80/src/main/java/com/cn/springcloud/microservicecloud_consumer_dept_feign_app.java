package com.cn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages={"com.cn.springcloud"})
@EnableEurekaClient
//@ComponentScan(basePackages = {"com.cn.springcloud.controller"})
public class microservicecloud_consumer_dept_feign_app {
    public static void main(String[] args) {
        SpringApplication.run(microservicecloud_consumer_dept_feign_app.class,args);
    }
}
