package com.czxy.controller;

import com.czxy.domain.News;
import com.czxy.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author 刘昌燊
 * @version v 1.0
 * @date 2019/7/5
 */
@RestController
@RequestMapping("news")
public class newsController {

    @Autowired
    private NewsService newsService;

    /**
     * 展示所有
     * @return
     */
    @GetMapping
    public ResponseEntity<List<News>> findAll() {
        try {
            List<News> all = newsService.findAll();
            return new ResponseEntity<>(all, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 新增新闻
     * @param news
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> addNews(News news) {
        System.out.println(news);
        try {
            newsService.insert(news);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 修改回显
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<News> editUI(@PathVariable("id") Integer id) {

        try {
            News news = newsService.findByPrimaryKey(id);
            return new ResponseEntity<>(news, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 修改新闻
     * @param news
     * @return
     */
    @PutMapping
    public ResponseEntity<Void> edit(News news) {
        try {
            newsService.edit(news);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 删除新闻
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        try {
            newsService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
