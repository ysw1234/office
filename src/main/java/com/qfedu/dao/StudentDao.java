package com.qfedu.dao;

import com.qfedu.pojo.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public interface StudentDao {
    List<Student> findStuPage();

    void addEmps(List<Student> studentList);

    void addStu(Student student);

    void deleteStu(String no);
}
