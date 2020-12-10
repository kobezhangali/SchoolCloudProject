package com.ali.entity;

import java.io.Serializable;

/**
 * (Education)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:40
 */
public class Education implements Serializable {
    private static final long serialVersionUID = 463052279895489423L;

    private Integer educationid;

    private String educationname;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getEducationid() {
        return educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public String getEducationname() {
        return educationname;
    }

    public void setEducationname(String educationname) {
        this.educationname = educationname;
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