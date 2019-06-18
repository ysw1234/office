package com.qfedu.controller;



import com.qfedu.pojo.Student;
import com.qfedu.service.StudentService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/studentpage.do")
    public Map<String,Object> stuPage(Integer page,Integer limit){
        Map<String,Object> map = studentService.findStuPage(page,limit);
        return map;
    }

    @RequestMapping("/studentadd.do")
    public JsonBean addStu(Student student){
        System.out.println(student);
        studentService.addStu(student);
        return new JsonBean(1,null);
    }

    @RequestMapping("/studentdelete.do")
    public JsonBean deleteStu(String no){
        studentService.deletetu(no);
        return new JsonBean(1000,null);
    }
}