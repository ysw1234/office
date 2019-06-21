package com.qfedu.service.impl;

import com.alibaba.druid.filter.AutoLoad;
import com.qfedu.dao.DepartDao;
import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {

    @Autowired
    private DepartDao departDao;

    @Override
    public List<Depart> findDepart() {
        return departDao.findDepart();
    }
}