package com.qfedu.service.impl;

import com.qfedu.dao.RoleDao;
import com.qfedu.pojo.Role;
import com.qfedu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;


    @Override
    public List<Role> findRole() {

        return roleDao.findRole();
    }
}