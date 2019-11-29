package com.zhangghq.feign_consumer.feign;

import com.zhangghq.feign_consumer.hystric.FignHelloHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by: Zhanghq
 * create time: 2019/8/24 11:38
 * description:
 *
 * @params
 * @return
 */
@FeignClient(value = "producer", fallback = FignHelloHystric.class)
public interface FignHelloService {

    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam String name);
}
