package com.slx.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 该注解@EnableFeignClients,用来开启feign的客户端功能
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignServerConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignServerConsumerApp.class, args);
    }
}
