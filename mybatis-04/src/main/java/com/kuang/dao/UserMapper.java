package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserList();

    User getUserById(int i);

    //分页查询
    List<User> getUserByLimit(Map<String,Object> map);

    List<User> getUserByRowBounds( );

}
