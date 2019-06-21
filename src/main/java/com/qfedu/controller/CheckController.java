package com.qfedu.controller;

import com.qfedu.pojo.Check;
import com.qfedu.pojo.User;
import com.qfedu.service.CheckService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/check")
public class CheckController {

    @Autowired
    private CheckService checkService;

    @RequestMapping("/processlist.do")
    public Map<String,Object> findAll(Integer page, Integer limit, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        String no = user.getNo();
        Map<String,Object> map = checkService.findAll(page,limit,no);
        return map;
    }

    @RequestMapping("/processadd.do")
    public JsonBean addProcess(Check check,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        String no = user.getNo();
        check.setStartno(no);
        String name = user.getName();
        check.setStartname(name);
        check.setPid("1231");
        check.setFlag(1);
        checkService.addProcess(check);
        return new JsonBean(1,null);
    }
    @RequestMapping("/processnolist.do")
    public Map<String,Object> findcheck(Integer page, Integer limit, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        String no = user.getNo();


        Map<String,Object> map = checkService.findcheck(page,limit,no);
        return map;
    }

    @RequestMapping("/processupdate.do")
    public JsonBean updatePro(Integer id,Integer flag){
        if(flag==2){
            checkService.okPro(id,flag);
        }else{
            checkService.noPro(id,flag);
        }
        return new JsonBean(1000,null);
    }

    @RequestMapping("/processdel.do")
    public JsonBean delete(Integer id){
        checkService.delete(id);
        return new JsonBean(1000,null);
    }

    @RequestMapping("/processecharts.do")
    public List<Check> charts(Integer id){
        List<Check> list = checkService.charts(id);
        return list;
    }

}