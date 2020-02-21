package com.slx.cloud.web;

import com.slx.cloud.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务的消费者
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return userService.loadPortInfo(name);
    }

    //负载均衡客户端
    //LoadBalancerClient是实现负载均衡的核心类.
    //这个核心类中的核心方法是choose()方法,该方法可以获取服务提供者的信息;
    //当我们调用choose()方法的时候,负载均衡器会根据内置一个负载均衡策略实现负载均衡.
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/testLoad")
    public String testLoadBalance() {
        //得到了对应的服务提供者的实例信息
        ServiceInstance instance = loadBalancerClient.choose("ribbon-server-provider");

        return "InstanceId:" + instance.getServiceId()
                + ",Host:" + instance.getHost()
                + ",Port:" + instance.getPort()
                + ",URI:" + instance.getUri();
    }
}
