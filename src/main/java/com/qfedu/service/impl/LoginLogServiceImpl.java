package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.LoginLogDao;
import com.qfedu.pojo.LoginLog;
import com.qfedu.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired(required = false)
    private LoginLogDao loginLogDao;


    @Override
    public Map<String, Object> findLoginLog(Integer page) {
        System.out.println(page);
        PageHelper.startPage(page,10);
        List<LoginLog> list = loginLogDao.findAll();
        //获取总记录数
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;

    }
}