package com.zhanghq.eurekasever.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by: Zhanghq
 * create time: 2019/8/21 11:21
 * description: my test demo
 *
 * @params
 * @return
 */

@RestController
public class DemoController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name)
    {
        return "hi " + name + ",i am from port:" + port;
    }

}
