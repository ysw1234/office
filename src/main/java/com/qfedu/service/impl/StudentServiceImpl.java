package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StudentDao;
import com.qfedu.pojo.Student;
import com.qfedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public Map<String, Object> findStuPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Student> list = studentDao.findStuPage();

        Map<String,Object> map = new HashMap<>();
        long total = ((Page) list).getTotal();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @Override
    public void addEmps(List<Student> studentList) {
        studentDao.addEmps(studentList);
    }

    @Override
    public void addStu(Student student) {
        if (student.getFlag()==null){
            student.setFlag(1);
        }
        studentDao.addStu(student);
    }

    @Override
    public void deletetu(String no) {
        studentDao.deleteStu(no);
    }
}