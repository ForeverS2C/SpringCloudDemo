package com.slx.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/showPort")
    public String showPort(@RequestParam(value = "msg") String msg){
        return "hello," + msg + ",这是Eureka的客户端,本服务端口号为:" + port;
    }

}
