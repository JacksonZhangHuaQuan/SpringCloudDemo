package com.zhanghq.producer.service;


import com.zhanghq.common.entity.Book;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/22 9:48
 * description: test book service
 *
 * @params
 * @return
 */

public interface BookService {

    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> selectAllBooks();
}
