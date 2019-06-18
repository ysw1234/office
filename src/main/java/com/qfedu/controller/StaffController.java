package com.qfedu.controller;

import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @RequestMapping("/staffall.do")
    public List<Staff> findStaff(){
        List<Staff> list = staffService.findStaff();
        return list;
    }
}