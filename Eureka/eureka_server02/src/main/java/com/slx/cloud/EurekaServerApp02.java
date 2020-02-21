package com.slx.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 该注解@EnableEurekaServer使得当前程序称为eureka注册中心的服务端
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp02 {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerApp02.class,args);
    }
}
