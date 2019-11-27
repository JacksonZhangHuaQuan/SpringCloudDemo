package com.zhanghq.producer.service.book.impl;

import com.zhanghq.cacheclient.util.RedisUtil;
import com.zhanghq.common.entity.Book;
import com.zhanghq.producer.mapper.BookMapper;
import com.zhanghq.producer.service.book.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired(required = false)
    private BookMapper bookMapper;

    @Resource
    private RedisUtil redisUtil;

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
        String key = "book_" + id;

        // 判断缓存是否存在数据
        boolean hasKey = redisUtil.hasKey(key);
        if(hasKey){
            Book bookCache = (Book)redisUtil.get(key);
            LOGGER.info("从缓存里寻找数据" + bookCache.toString());
            return bookCache;
        }
        Book book = bookMapper.selectByPrimaryKey(id);
        if(null!=book){
            String keyCache = "book_" + book.getId();
            LOGGER.info("从DB里获取数据" + book.toString());
            redisUtil.set(keyCache, book);
            LOGGER.info("把数据插入缓存中。。。");
            return book;
        }
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
