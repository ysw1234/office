package com.qfedu.controller;

import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import com.qfedu.vo.JsonBean;
import com.qfedu.vo.VOgrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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

    @RequestMapping("/gradepage.do")
    public Map<String,Object> gradePage(Integer page,Integer limit){
        Map<String,Object> map = gradeService.gradePage(page,limit);
        return map;
    }

    @RequestMapping("/gradeupdate.do")
    public JsonBean updateGrade(VOgrade vOgrade){
        gradeService.updateGrade(vOgrade);
        return new JsonBean(1,null);
    }

    @RequestMapping("/gradeadd.do")
    public JsonBean addGrade(VOgrade vOgrade){
        gradeService.addGrade(vOgrade);
        return new JsonBean(1,null);
    }

    @RequestMapping("/gradedelete.do")
    public JsonBean deleteGrade(Integer id){
        gradeService.deleteGrade(id);
        return new JsonBean(1000,null);
    }
}