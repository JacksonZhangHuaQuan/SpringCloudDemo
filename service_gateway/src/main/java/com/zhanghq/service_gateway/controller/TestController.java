package com.zhanghq.service_gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * create by: Zhanghq
 * create time: 2019/9/25 11:03
 * description:
 *
 * @params
 * @return
 */

@RestController
public class TestController {

    // tag::fallback[]
    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }
    // end::fallback[]
}
