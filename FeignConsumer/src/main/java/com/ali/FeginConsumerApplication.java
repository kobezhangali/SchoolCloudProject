package com.ali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient //用于启动服务发现功能
@EnableFeignClients //用于启动Fegin功能
@SpringBootApplication
@EnableCircuitBreaker
public class FeginConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeginConsumerApplication.class,args);
    }
}
