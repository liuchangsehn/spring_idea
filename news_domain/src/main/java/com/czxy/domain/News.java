package com.czxy.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 刘昌燊
 * @version v 1.0
 * @date 2019/7/5
 * CREATE TABLE `news` (
 *   `id` INT(200) NOT NULL AUTO_INCREMENT,
 *   `title` VARCHAR(50) DEFAULT NULL,
 *   `content` VARCHAR(100) DEFAULT NULL,
 *   `publishTime` DATE DEFAULT NULL,
 *   `author` VARCHAR(100) DEFAULT NULL,
 *   PRIMARY KEY (`id`)
 * )  ENGINE=INNODB DEFAULT CHARSET=utf8;news20190705news
 */
@Entity
@Table(name = "news")
public class News {
    @Id
    private Integer id;
    private String title;
    private String content;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishtime;
    private String author;

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishtime=" + publishtime +
                ", author='" + author + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public News(Integer id, String title, String content, Date publishtime, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publishtime = publishtime;
        this.author = author;
    }

    public News() {
    }
}
