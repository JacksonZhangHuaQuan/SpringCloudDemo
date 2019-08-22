package com.zhanghq.comsumer.web;

import com.zhanghq.common.entity.Book;
import com.zhanghq.comsumer.service.BookComsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/22 16:26
 * description:
 *
 * @params
 * @return
 */

@RestController
public class BookController {

    @Autowired
    BookComsumerService bookComsumerService;

    @GetMapping("/getAllBooks")
    private List<Book> getAllBooks(){
        return bookComsumerService.getAllBooks();
    }
}
