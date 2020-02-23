package com.slx.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/showPort")
    public String showPort(@RequestParam String name) {
        return ribbonService.hello(name);
    }
}
