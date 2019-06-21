package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao;


    @Override
    public List<Staff> findStaff() {
        return staffDao.findStaff();
    }

    @Override
    public Map<String, Object> staffPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Staff> list = staffDao.staffPage();

        Map<String,Object> map = new HashMap<>();
        long total = ((Page) list).getTotal();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @Override
    public void addEmps(List<Staff> staffList) {
        staffDao.addEmps(staffList);
    }

    @Override
    public void updateStaff(Staff staff) {
        if (staff.getFlag()==null){
            staff.setFlag(1);
        }
        staffDao.updateStaff(staff);
    }

    @Override
    public void upStaff(Staff staff) {
        staffDao.upStaff(staff);
    }

    @Override
    public void deleteStaff(String no) {
        staffDao.deleteStaff(no);
    }
}