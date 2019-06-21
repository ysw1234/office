package com.qfedu.controller;

import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/depart")
public class DepartController {

    @Autowired
    private DepartService  departService;

    @RequestMapping("/departall.do")
    public List<Depart> findDepart(){
        List<Depart> list = departService.findDepart();
        return list;
    }
}