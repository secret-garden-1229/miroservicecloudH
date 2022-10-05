package com.cn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class microservicecloud_eureka_7002_App {
    public static void main(String[] args) {
        SpringApplication.run(microservicecloud_eureka_7002_App.class,args);
    }
}
