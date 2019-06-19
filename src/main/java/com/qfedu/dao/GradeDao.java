package com.qfedu.dao;

import com.qfedu.pojo.Grade;
import com.qfedu.vo.VOgrade;

import java.util.List;


public interface GradeDao {
    List<Grade> findGrade();

    List<Grade> gradePage();

    void updateGrade(VOgrade vOgrade);

    void addGrade(VOgrade vOgrade);

    void deleteGrade(Integer id);
}
