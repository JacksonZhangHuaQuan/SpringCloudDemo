package com.zhanghq.comsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * create by: Zhanghq
 * create time: 2019/8/21 16:43
 * description: my test service
 *
 * @params
 * @return
 */

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://producer/hi?name=" + name, String.class);
    }
}
