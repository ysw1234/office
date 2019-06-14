package com.qfedu.service;

import com.qfedu.pojo.LoginLog;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public interface LoginLogService {


    Map<String,Object> findLoginLog(Integer page);
}
