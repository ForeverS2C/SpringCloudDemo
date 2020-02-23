package com.slx.cloud;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    //在Ribbon组件中没有提供专门熔断的注解.Feign组件提供了专门远程调用和熔断的注解@FeignClient(value,fallback)
    //可以利用Hystrix的注解来实现熔断!
    @HystrixCommand(fallbackMethod = "handleCallback")
    public String hello(String name){
        return restTemplate.getForObject("http://hystrix-server-provider/showPort?name="+name,String.class);
    }

    //注意:如果远程调用的方法带参数,这个异常回调方法也必须带同样的参数!
    //当熔断发生时,专门处理异常
    public String handleCallback(String name){
        return "网络异常,请检查你的网络!"+name;
    }
}
