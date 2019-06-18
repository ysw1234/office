package com.qfedu.dao;

import com.qfedu.pojo.Authority;


import java.util.List;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public interface AuthorityDao {

    List<Authority> findmenu(Integer id);
}
