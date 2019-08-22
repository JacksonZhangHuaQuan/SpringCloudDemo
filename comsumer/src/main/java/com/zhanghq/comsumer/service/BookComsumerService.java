package com.zhanghq.comsumer.service;

import com.zhanghq.common.entity.Book;
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
public class BookComsumerService {

    @Autowired
    RestTemplate restTemplate;

    public List<Book> getAllBooks(){
        Book[] books = restTemplate.getForObject("http://producer/book/selectAllBooks", Book[].class);
        List<Book> bookList = Arrays.asList(books);
        return bookList;
    }
}
