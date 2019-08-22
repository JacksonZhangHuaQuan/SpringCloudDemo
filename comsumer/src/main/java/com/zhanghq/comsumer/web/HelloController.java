package com.zhanghq.comsumer.web;

import com.zhanghq.comsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by: Zhanghq
 * create time: 2019/8/21 16:47
 * description: my test controller
 *
 * @params
 * @return
 */

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hiController(@RequestParam String name){
        return helloService.hiService(name);
    }
}
