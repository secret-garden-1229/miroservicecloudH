package com.cn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient//服务发现
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
public class DeptController_Consumer_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptController_Consumer_App.class,args);
    }

}
