package com.cn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//自动注册服务
@EnableDiscoveryClient//发现服务
public class DeptProvider8002_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
