package com.qfedu.controller;

import com.qfedu.pojo.Authority;

import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authority")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @RequestMapping("/usermenu.do")
    public List<Authority> usermenu(Integer id){
        List<Authority> list = authorityService.findmenu(id);
        return list;
    }
}