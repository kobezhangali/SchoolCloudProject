package com.ali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScoreProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScoreProviderApplication.class,args);
    }
}
