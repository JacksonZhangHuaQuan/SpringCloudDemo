package com.zhanghq.service_zuul.hystrix;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * create by: Zhanghq
 * create time: 2019/9/2 14:05
 * description:
 *
 * @params
 * @return
 */

@Component
public class ZuulFallBack implements FallbackProvider {
    @Override
    public String getRoute() {
        return "consumer-feign"; //服务id,可以用*或者null 代表所有服务的都过滤
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;//请求网关成功了,所以是ok
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.OK.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.OK.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            @ResponseBody
            public InputStream getBody() throws IOException {
                Map json=new HashMap();
                json.put("state","501");
                json.put("msg","后台接口错误");
                return new ByteArrayInputStream(json.toString().getBytes("UTF-8")); //返回前端的内容
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders=new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return httpHeaders;
            }
        };
    }
}
