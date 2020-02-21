package com.slx.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    //注意:在服务的提供者这里,不能写简写的@GetMapping形式!
    //@GetMapping("/showPort")
    @RequestMapping(value = "/showPort", method = RequestMethod.GET)
    public String showPort(@RequestParam String name) {
        return "hello," + name + ",这是服务提供者01--->端口号:" + port;
    }
}
