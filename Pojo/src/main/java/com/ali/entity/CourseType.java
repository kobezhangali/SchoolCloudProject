package com.ali.entity;

import java.io.Serializable;

/**
 * (CourseType)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:40
 */
public class CourseType implements Serializable {
    private static final long serialVersionUID = 887448130210600756L;

    private Integer ctid;

    private String ctname;

    private String ctdesc;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public String getCtname() {
        return ctname;
    }

    public void setCtname(String ctname) {
        this.ctname = ctname;
    }

    public String getCtdesc() {
        return ctdesc;
    }

    public void setCtdesc(String ctdesc) {
        this.ctdesc = ctdesc;
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