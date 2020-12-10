package com.ali.entity;

import java.io.Serializable;

/**
 * (Perms)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:43
 */
public class Perms implements Serializable {
    private static final long serialVersionUID = -35204193159033341L;

    private Integer pid;

    private String pname;

    private String pinfo;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPinfo() {
        return pinfo;
    }

    public void setPinfo(String pinfo) {
        this.pinfo = pinfo;
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