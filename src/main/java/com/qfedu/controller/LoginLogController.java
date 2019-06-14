package com.qfedu.controller;

import com.qfedu.dao.LoginLogDao;
import com.qfedu.pojo.LoginLog;
import com.qfedu.service.LoginLogService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginLogController {

    @Autowired
    private LoginLogService loginLogService;

    @RequestMapping("/loginloglist.do")
    public Map<String,Object> findLoginLog(Integer page, Integer size){

        Map<String,Object> map =  loginLogService.findLoginLog(page);
        System.out.println(map.size());
        return map;
    }

}