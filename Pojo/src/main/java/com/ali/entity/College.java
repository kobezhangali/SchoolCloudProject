package com.ali.entity;

import java.io.Serializable;

/**
 * (College)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:19
 */
public class College implements Serializable {
    private static final long serialVersionUID = 629938406869648900L;

    private Integer collegeid;

    private String collegename;

    private String collegeinfo;

    private String bak02;

    private String bak03;


    public Integer getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getCollegeinfo() {
        return collegeinfo;
    }

    public void setCollegeinfo(String collegeinfo) {
        this.collegeinfo = collegeinfo;
    }

    public String getBak02() {
        return bak02;
    }

    public void setBak02(String bak02) {
        this.bak02 = bak02;
    }

    public String getBak03() {
        return bak03;
    }

    public void setBak03(String bak03) {
        this.bak03 = bak03;
    }

}