package com.zhangghq.feign_consumer.hystric.book;

import com.zhangghq.feign_consumer.feign.book.FeignBookService;
import com.zhanghq.common.entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/27 11:22
 * description:
 *
 * @params
 * @return
 */

@Component
public class BookHystric implements FeignBookService {

    @Override
    public List<Book> getAllBooks() {
        return null;
    }
}
