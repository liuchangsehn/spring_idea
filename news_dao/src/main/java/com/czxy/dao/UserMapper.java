package com.czxy.dao;

import com.czxy.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 刘昌燊
 * @version v 1.0
 * @date 2019/7/5
 */

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    @Select("select * from `user` where username=#{username} and password =#{password}")
    public User login(User user);
}
