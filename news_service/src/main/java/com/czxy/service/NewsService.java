package com.czxy.service;

import com.czxy.domain.News;

import java.util.List;

/**
 * @author 刘昌燊
 * @version v 1.0
 * @date 2019/7/5
 */
public interface NewsService {

    public List<News>findAll();

    public void insert(News news);

    public News findByPrimaryKey(Integer id);

    public void edit(News news);

    public void delete(Integer id);
}
