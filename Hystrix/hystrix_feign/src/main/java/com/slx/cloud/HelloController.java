package com.slx.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 *
 */
@RestController
public class HelloController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hello")
    public String callHello(@RequestParam String name){
        return feignService.callShowPort(name);
    }
}
