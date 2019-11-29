package com.zhangghq.feign_consumer.controller;

import com.zhangghq.feign_consumer.feign.FignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by: Zhanghq
 * create time: 2019/8/24 11:37
 * description:
 *
 * @params
 * @return
 */
@RestController
public class FeignHelloController {

    @Autowired
    FignHelloService fignHelloService;

    @RequestMapping("/hi")
    public String sayHiFromClientOne(@RequestParam String name) {
        return fignHelloService.sayHiFromClientOne(name);
    }
}
