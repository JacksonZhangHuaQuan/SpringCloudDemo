package com.zhangghq.feign_consumer.feign.book;

import com.zhanghq.common.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/24 11:13
 * description: 获取所有book
 *
 * @params
 * @return
 */

@FeignClient(value = "producer")
public interface FeignBookService {

    @GetMapping("/book/selectAllBooks")
    List<Book> getAllBooks();

}
