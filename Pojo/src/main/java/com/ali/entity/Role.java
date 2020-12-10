package com.ali.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:19:11
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -82926109318518405L;

    private Integer rid;

    private String rname;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
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