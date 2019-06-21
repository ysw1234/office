package com.qfedu.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Depart {

    private Integer id;
    private String dname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Createtime;
    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getCreatetime() {
        return Createtime;
    }

    public void setCreatetime(Date createtime) {
        Createtime = createtime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}