package com.qfedu.controller;

import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("/gradeall.do")
    public List<Grade> findGrade(){
        List<Grade> list = gradeService.findGrade();
        return list;
    }
}