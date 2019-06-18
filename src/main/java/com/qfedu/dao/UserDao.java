package com.qfedu.dao;

import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2019/6/13 0013.
 */
public interface UserDao {

    User findUser(User user);

    List<User> selectAll();


}
