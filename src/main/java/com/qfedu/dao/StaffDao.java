package com.qfedu.dao;


import com.qfedu.pojo.Staff;

import java.util.List;


public interface StaffDao {

    List<Staff> findStaff();

    List<Staff> staffPage();

    void addEmps(List<Staff> staffList);

    void updateStaff(Staff staff);

    void upStaff(Staff staff);

    void deleteStaff(String no);
}
