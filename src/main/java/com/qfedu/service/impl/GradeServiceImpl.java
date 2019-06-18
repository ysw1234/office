package com.qfedu.service.impl;

import com.qfedu.dao.GradeDao;
import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeDao gradeDao;

    @Override
    public List<Grade> findGrade() {
        return gradeDao.findGrade();
    }
}