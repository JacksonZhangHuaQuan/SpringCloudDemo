package com.zhangghq.feign_consumer.controller.book;

import com.zhangghq.feign_consumer.feign.book.FeignBookService;
import com.zhanghq.common.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/24 11:22
 * description: book controller
 *
 * @params
 * @return
 */

@RestController
public class FeignBookController {

    @Autowired
    FeignBookService feignBookService;

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){

        return feignBookService.getAllBooks();
    }

}
