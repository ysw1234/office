package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CheckDao;
import com.qfedu.pojo.Check;
import com.qfedu.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CheckServiceImpl implements CheckService {

    @Autowired
    private CheckDao checkDao;

    @Override
    public Map<String, Object> findAll(Integer page, Integer limit,String no) {
        PageHelper.startPage(page,limit);
        List<Check> list = checkDao.findAll(no);


        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @Override
    public void addProcess(Check check) {

        checkDao.addProcess(check);
    }

    @Override
    public Map<String, Object> findcheck(Integer page, Integer limit, String no) {
        PageHelper.startPage(page,limit);
        List<Check> list = checkDao.findcheck(no);


        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;

    }

    @Override
    public void okPro(Integer id,Integer flag) {
        checkDao.okPro(id,flag);
    }

    @Override
    public void noPro(Integer id,Integer flag) {
        checkDao.noPro(id,flag);
    }

    @Override
    public void delete(Integer id) {
        checkDao.delete(id);
    }

    @Override
    public List<Check> charts(Integer id) {
        List<Check> list = checkDao.charts(id);
        return list;
    }
}