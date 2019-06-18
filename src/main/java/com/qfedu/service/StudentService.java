package com.qfedu.service;

import com.qfedu.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public interface StudentService {
    Map<String,Object> findStuPage(Integer page,Integer limit);

    void addEmps(List<Student> studentList);

    void addStu(Student student);

    void deletetu(String no);
}
