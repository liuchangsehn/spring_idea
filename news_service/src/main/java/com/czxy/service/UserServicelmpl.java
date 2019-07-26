package com.czxy.service;

import com.czxy.dao.UserMapper;

import com.czxy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘昌燊
 * @version v 1.0
 * @date 2019/7/5
 */
@Service
@Transactional
public class UserServicelmpl implements UserServcice {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(User user) {
        User login = userMapper.login(user);
        if (login!=null){
            return login;
        }else {
            return null;
        }
    }
}
