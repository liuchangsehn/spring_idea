package com.czxy.controller;

import com.czxy.domain.User;
import com.czxy.service.UserServcice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘昌燊
 * @version v 1.0
 * @date 2019/7/5
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServcice userServcice;

    //用户登录
    @GetMapping
    public ResponseEntity<String> login(User user){
        User lgoin = userServcice.login(user);
        System.out.println(lgoin);
        if (lgoin!=null){
            return new ResponseEntity<>("登录成功",HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
