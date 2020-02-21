package com.slx.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/loadServer")
    public String getServer(){
        ServiceInstance instance = loadBalancerClient.choose("customServer");
        return "InstanceID:"+instance.getServiceId()+",Host:"+instance.getHost()+",Port:"+instance.getPort();
    }
}
