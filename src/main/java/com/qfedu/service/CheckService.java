package com.qfedu.service;

import com.qfedu.pojo.Check;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
public interface CheckService {
    Map<String,Object> findAll(Integer page, Integer limit,String no );

    void addProcess(Check check);

    Map<String,Object> findcheck(Integer page, Integer limit, String no);

    void okPro(Integer id,Integer flag);

    void noPro(Integer id,Integer flag);

    void delete(Integer id);


    List<Check> charts(Integer id);
}
