package com.qfedu.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.pojo.Staff;
import com.qfedu.pojo.Student;
import com.qfedu.service.StaffService;
import com.qfedu.vo.JsonBean;

import com.qfedu.service.StudentService;
import com.qfedu.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Controller
public class ImportExcelController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StaffService staffService;
    @RequestMapping(value = "/studentbatch.do",method = RequestMethod.POST)
    @ResponseBody
    public JsonBean importExcel(@RequestParam("mFile") MultipartFile excelFile){

        // 获取上传文件的文件名
        String fileName = excelFile.getOriginalFilename();
        // 获取上传文件的输入流
        try {
            InputStream inputStream = excelFile.getInputStream();
            // 读取excel内容
            List<Map<String, Object>> maps = ExcelUtils.readExcel(fileName, inputStream);
            // 通过jackson进行操作
            ObjectMapper objectMapper = new ObjectMapper();
            // 将对象转为json格式字符串
            String jsonStr = objectMapper.writeValueAsString(maps);
            // 将json字符串转为指定类型的对象
            List<Student> studentList = objectMapper.readValue(jsonStr, new TypeReference<List<Student>>() {});

            // 批量插入
            studentService.addEmps(studentList);

        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0, e.getMessage());
        }

        return new JsonBean(1, null);
    }
    @RequestMapping(value = "/staffbatch.do",method = RequestMethod.POST)
    @ResponseBody
    public JsonBean importExcel2(@RequestParam("mFile") MultipartFile excelFile){

        // 获取上传文件的文件名
        String fileName = excelFile.getOriginalFilename();
        // 获取上传文件的输入流
        try {
            InputStream inputStream = excelFile.getInputStream();
            // 读取excel内容
            List<Map<String, Object>> maps = ExcelUtils.readExcel(fileName, inputStream);
            // 通过jackson进行操作
            ObjectMapper objectMapper = new ObjectMapper();
            // 将对象转为json格式字符串
            String jsonStr = objectMapper.writeValueAsString(maps);
            // 将json字符串转为指定类型的对象
            List<Staff> staffList = objectMapper.readValue(jsonStr, new TypeReference<List<Staff>>() {});

            // 批量插入
            staffService.addEmps(staffList);

        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0, e.getMessage());
        }

        return new JsonBean(1, null);
    }

}
