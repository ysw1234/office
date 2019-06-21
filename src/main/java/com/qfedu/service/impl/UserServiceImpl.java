package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(User user) {
        User user1 = userDao.findUser(user);

        return user1;
    }

    @Override
    public Map<String, Object> selectAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<User> list = userDao.selectAll();

        Map<String, Object> map = new HashMap<>();
        //获取总记录数
        long total = ((Page) list).getTotal();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }


}