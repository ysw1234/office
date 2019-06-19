package com.qfedu.service.impl;


import com.qfedu.dao.CourseDao;
import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;


    @Override
    public List<Course> findCourse() {
        return courseDao.findCourse();
    }
}