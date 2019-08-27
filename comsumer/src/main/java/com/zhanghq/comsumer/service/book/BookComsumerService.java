package com.zhanghq.comsumer.service.book;

import com.zhanghq.common.entity.Book;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/24 10:55
 * description: 获取所有的book
 *
 * @params
 * @return
 */
public interface BookComsumerService {

    List<Book> getAllBooks();

}
