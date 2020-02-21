package com.slx.cloud.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@Service
public class UserService {

    //利用该对象实现服务的远程调用,不用跟dubbo那样还必须提供一个接口类!
    @Autowired
    private RestTemplate restTemplate;

    public String loadPortInfo(String name) {
        //通过url来实现远程接口的调用
        //http://ribbon-server-provider01/showPort
        //uri中主要是写明服务提供者的应用程序名
        return restTemplate.getForObject("http://ribbon-server-provider/showPort?name=" + name, String.class);
    }
}
