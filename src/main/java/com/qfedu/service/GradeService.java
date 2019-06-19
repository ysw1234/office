package com.qfedu.service;

import com.qfedu.pojo.Grade;
import com.qfedu.vo.VOgrade;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public interface GradeService {
    List<Grade> findGrade();

    Map<String,Object> gradePage(Integer page, Integer limit);

    void updateGrade(VOgrade vOgrade);

    void addGrade(VOgrade vOgrade);

    void deleteGrade(Integer id);
}
