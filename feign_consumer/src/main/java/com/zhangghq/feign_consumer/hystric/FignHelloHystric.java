package com.zhangghq.feign_consumer.hystric;

import com.zhangghq.feign_consumer.feign.FignHelloService;
import org.springframework.stereotype.Component;

/**
 * create by: Zhanghq
 * create time: 2019/8/27 11:23
 * description:
 *
 * @params
 * @return
 */
@Component
public class FignHelloHystric implements FignHelloService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
