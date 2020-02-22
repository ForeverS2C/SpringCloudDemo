package com.slx.cloud.web;

import com.slx.cloud.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class HelloController {

    @Autowired
    private HelloFeignService feignService;

    @GetMapping("/hello")
    public String callHello(@RequestParam String msg){
        return feignService.callHello(msg);
    }
}
