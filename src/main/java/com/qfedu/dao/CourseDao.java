package com.qfedu.dao;

import com.qfedu.pojo.Course;

import java.util.List;

/**
 * Created by Administrator on 2019/6/19 0019.
 */
public interface CourseDao {
    List<Course> findCourse();
}
