package com.qfedu.controller;

import com.qfedu.pojo.Role;
import com.qfedu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/roleall.do")
    public List<Role> selectRole(){
        List<Role> list  = roleService.findRole();
        return list;
    }
}