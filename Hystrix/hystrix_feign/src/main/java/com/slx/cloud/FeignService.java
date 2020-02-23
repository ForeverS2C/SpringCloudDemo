package com.slx.cloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@FeignClient(value = "hystrix-server-provider", fallback = FeignHystrix.class)
public interface FeignService {

    //queryMapExcetion....
    //@RequestParam:一般情况下是取get/post请求里面url后面拼接的参数.
    //request内部把这些参数取出来之后,会封装到一个map中.Map<String, String[]> parameterMap = request.getParameterMap();
    //会把这些键值对参数封装进行那个map中.
    //所以:在利用Feign进行远程调用接口的时候,如果要传参,必须指明参数的名称!
    @RequestMapping(value = "/showPort", method = RequestMethod.GET)
    String callShowPort(@RequestParam("name") String name);
}
