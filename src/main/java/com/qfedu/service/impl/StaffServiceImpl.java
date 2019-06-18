package com.qfedu.service.impl;

import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao;


    @Override
    public List<Staff> findStaff() {
        return staffDao.findStaff();
    }
}