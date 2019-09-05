package com.zhanghq.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by: Zhanghq
 * create time: 2019/9/5 18:40
 * description:
 *
 * @params
 * @return
 */

@RestController
public class TestController {

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
