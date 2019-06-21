package com.qfedu.controller;

import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;

import com.qfedu.utils.UploadUtils;
import com.qfedu.vo.JsonBean;
import com.qiniu.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @RequestMapping("/staffall.do")
    public List<Staff> findStaff(){
        List<Staff> list = staffService.findStaff();
        return list;
    }

    @RequestMapping("/staffpage.do")
    public Map<String,Object> staffPage(Integer page,Integer limit){
        Map<String,Object> map = staffService.staffPage(page,limit);
        return map;
    }

    @RequestMapping("/photoupload.do")
    public JsonBean uploadPhoto(MultipartFile file ){

        UploadUtils upload = new UploadUtils();
        String path = upload.getPath();
        String s = upload.upload(file);
        String msg = path+"/"+s;
        return new JsonBean(1000,msg);
    }

    @RequestMapping("/staffadd.do")
    public JsonBean updateStaff(Staff staff){
        System.out.println(staff);
        staffService.updateStaff(staff);
        return new JsonBean(1,null);
    }

    @RequestMapping("/staffupdate.do")
    public JsonBean upStaff(Staff staff){
        staffService.upStaff(staff);
        return new JsonBean(1,null);
    }

    @RequestMapping("/staffdelete.do")
    public JsonBean deleteStaff(String no){
        staffService.deleteStaff(no);
        return new JsonBean(1000,null);
    }
}