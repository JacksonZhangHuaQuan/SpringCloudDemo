package com.zhanghq.producer.service.impl;

import com.zhanghq.common.entity.Book;
import com.zhanghq.producer.mapper.BookMapper;
import com.zhanghq.producer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by: Zhanghq
 * create time: 2019/8/22 9:49
 * description: test book service impl
 *
 * @params
 * @return
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired(required = false)
    private BookMapper bookMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Book record) {
        return 0;
    }

    @Override
    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    @Override
    public Book selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return 0;
    }

    @Override
    public List<Book> selectAllBooks() {
        return bookMapper.selectAllBooks();
    }
}
