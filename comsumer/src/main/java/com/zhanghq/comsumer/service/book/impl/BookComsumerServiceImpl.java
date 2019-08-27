package com.zhanghq.comsumer.service.book.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhanghq.common.entity.Book;
import com.zhanghq.comsumer.service.book.BookComsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/22 16:21
 * description: test book service
 *
 * @params
 * @return
 */

@Service
public class BookComsumerServiceImpl implements BookComsumerService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "getAllBooksError") //服务挂掉后 进入的方法名
    public List<Book> getAllBooks(){
        Book[] books = restTemplate.getForObject("http://producer/book/selectAllBooks", Book[].class);
        List<Book> bookList = Arrays.asList(books);
        return bookList;
    }

    public List<Book> getAllBooksError(){
        return null;
    }
}
