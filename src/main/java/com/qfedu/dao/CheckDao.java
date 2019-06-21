package com.qfedu.dao;

import com.qfedu.pojo.Check;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
public interface CheckDao {

    List<Check> findAll(String no);

    void addProcess(Check check);

    List<Check> findcheck(String no);

    void okPro(@Param("id") Integer id, @Param("flag") Integer flag);

    void noPro(@Param("id") Integer id, @Param("flag") Integer flag);

    void delete(Integer id);

    List<Check> charts(Integer id);
}
