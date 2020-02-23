package com.slx.cloud;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class FeignHystrix implements FeignService{

    //当feign进行远程调用失败时才会执行该方法.
    @Override
    public String callShowPort(String name) {
        return "name,不好意思,网络异常,请检查你的网络...";
    }
}
