package com.zhanghq.producer.web;

import com.zhanghq.common.entity.Book;
import com.zhanghq.producer.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/21 16:18
 * description: my test Controller
 *
 * @params
 * @return
 */

@RestController
public class TestController {
    @Value("${server.port}")
    String port;

    @Autowired
    BookService bookService;

    @RequestMapping("/hi")
    public String home(@RequestParam String name)
    {
        return "hi " + name + ",i am from port:" + port;
    }

    @RequestMapping("/getBook")
    public Book getBook(@RequestParam String id){
        return bookService.selectByPrimaryKey(new Integer(id));
    }

    @RequestMapping("/getAllBook")
    public List<Book> getAllBook(){
        return bookService.selectAllBooks();
    }

}
