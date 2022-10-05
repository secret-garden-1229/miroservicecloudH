package com.cn.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class myConfig {

    @Bean
    @LoadBalanced//开启RiBBon（负载均衡），
    public RestTemplate newRestTemplate(){
        return new RestTemplate();
    }

}
