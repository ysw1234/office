package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public JsonBean login(User user, HttpSession session){
        //session.setAttribute();
        User user1 = userService.findUser(user);

        return new JsonBean(1,user1);
    }

    @RequestMapping("/userall.do")
    public Map<String,Object> selectAll(Integer page,Integer limit){
        Map<String, Object> map = userService.selectAll(page,limit);

        return map;
    }



}