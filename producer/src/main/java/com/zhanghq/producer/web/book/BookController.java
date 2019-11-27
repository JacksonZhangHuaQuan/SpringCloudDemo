package com.zhanghq.producer.web.book;

import com.zhanghq.common.entity.Book;
import com.zhanghq.producer.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/22 10:35
 * description: test book controller
 *
 * @params
 * @return
 */

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public void insertBook(Book book){
        bookService.insertSelective(book);
    }

    @ResponseBody
    @RequestMapping(value = "/selectAllBooks", method = RequestMethod.GET)
    private List<Book> sllectAllBooks(){
        return bookService.selectAllBooks();
    }

    @ResponseBody
    @RequestMapping(value = "/getBook", method = RequestMethod.GET)
    private Book getBook(@RequestParam String id){
        return bookService.selectByPrimaryKey(new Integer(id));
    }

    @RequestMapping(value = "/insertAllBooks", method = RequestMethod.GET)
    public void insertBooks(){
        String bookName = "book";
        String author = "jackson";
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setName(bookName + i);
            book.setAuthor(author + i);
            book.setPay(5.5*i);
            insertBook(book);
        }
    }

}
