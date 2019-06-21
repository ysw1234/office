package com.qfedu.service;


import com.qfedu.pojo.Staff;

import java.util.List;
import java.util.Map;


public interface StaffService {

    List<Staff> findStaff();

    Map<String,Object> staffPage(Integer page, Integer limit);

    void addEmps(List<Staff> staffList);

    void updateStaff(Staff staff);

    void upStaff(Staff staff);

    void deleteStaff(String no);
}
