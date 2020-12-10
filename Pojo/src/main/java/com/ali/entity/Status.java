package com.ali.entity;

import java.io.Serializable;

/**
 * (Status)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:19:13
 */
public class Status implements Serializable {
    private static final long serialVersionUID = 323123337990908884L;

    private Integer statusid;

    private String statusname;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2;
    }

    public String getBak3() {
        return bak3;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3;
    }

}