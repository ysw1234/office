package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GradeDao;
import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import com.qfedu.vo.VOgrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeDao gradeDao;

    @Override
    public List<Grade> findGrade() {
        return gradeDao.findGrade();
    }

    @Override
    public Map<String, Object> gradePage(Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        List<Grade>list = gradeDao.gradePage();

        Map<String, Object> map = new HashMap<>();
        //获取总记录数
        long total = ((Page) list).getTotal();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);

        return map;
    }

    @Override
    public void updateGrade(VOgrade vOgrade) {
        gradeDao.updateGrade(vOgrade);
    }

    @Override
    public void addGrade(VOgrade vOgrade) {
        if(vOgrade.getFlag()==null){
            vOgrade.setFlag(1);
        }
        gradeDao.addGrade(vOgrade);
    }

    @Override
    public void deleteGrade(Integer id) {
        gradeDao.deleteGrade(id);
    }


}