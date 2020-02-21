package com.slx.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceConsumerApp02 {
    public static void main(String[] args){
        SpringApplication.run(ServiceConsumerApp02.class,args);
    }
}
