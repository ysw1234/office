package com.qfedu.service;

import com.qfedu.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/13 0013.
 */
public interface UserService {
    User findUser(User user);


    Map<String,Object> selectAll(Integer page, Integer limit);


}
