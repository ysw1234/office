package com.qfedu.service.impl;

import com.qfedu.dao.AuthorityDao;
import com.qfedu.pojo.Authority;

import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityDao authorityDao;

    @Override
    public List<Authority> findmenu(Integer id) {
        return authorityDao.findmenu(id);
    }
}