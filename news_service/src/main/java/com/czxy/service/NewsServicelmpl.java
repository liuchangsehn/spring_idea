package com.czxy.service;

import com.czxy.dao.NewsMapper;
import com.czxy.domain.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 刘昌燊
 * @version v 1.0
 * @date 2019/7/5
 */
@Service
@Transactional
public class NewsServicelmpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> findAll() {
        return newsMapper.selectAll();
    }

    @Override
    public void insert(News news) {
        newsMapper.insert(news);
    }

    @Override
    public News findByPrimaryKey(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void edit(News news) {
        newsMapper.updateByPrimaryKey(news);
    }

    @Override
    public void delete(Integer id) {
        newsMapper.deleteByPrimaryKey(id);
    }
}
