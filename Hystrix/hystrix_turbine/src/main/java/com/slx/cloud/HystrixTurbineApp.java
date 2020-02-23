package com.slx.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * EnableTurbine开启融合面板功能;
 * EnableHystrixDashboard:开启监控仪表盘功能
 */
@SpringBootApplication
@EnableTurbine
//@EnableHystrix
@EnableHystrixDashboard
public class HystrixTurbineApp {
    public static void main(String[] args){
        SpringApplication.run(HystrixTurbineApp.class,args);
    }
}
