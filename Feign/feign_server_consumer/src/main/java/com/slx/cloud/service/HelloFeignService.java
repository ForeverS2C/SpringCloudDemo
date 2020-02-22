package com.slx.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 利用Feign实现远程调用,需要顶一个接口类
 * 利用@FeignClient注解实现远程调用,该注解中的值是服务提供者的应用名称
 */
@FeignClient(value = "feign-server-provider")
public interface HelloFeignService {

    //注意:远程调用的接口中,@RequestMapping注解的信息,必须和对应的服务提供者里方法的注解一致!
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String callHello(@RequestParam(value = "msg") String msg);
}
