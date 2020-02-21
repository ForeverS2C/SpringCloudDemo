package com.slx.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 对Ribbon进行必要的配置
 */
@Configuration
public class RibbonConfig {

    //@LoadBalanced:开启ribbon的负载均衡功能
    //RestTemplate:利用url,来实现接口的远程调用
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
