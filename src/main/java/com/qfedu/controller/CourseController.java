package com.qfedu.controller;

import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/courseall.do")
    public List<Course> findCourse(){
        List<Course> list = courseService.findCourse();
        return list;
    }

}