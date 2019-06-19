package com.qfedu.vo;

import com.qfedu.pojo.Grade;


public class VOgrade extends Grade {

    private Integer count;
    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}