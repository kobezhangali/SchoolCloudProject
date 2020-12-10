package com.ali.entity;

import java.io.Serializable;

/**
 * (Classroom)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:18
 */
public class Classroom implements Serializable {
    private static final long serialVersionUID = -58407672087915997L;

    private Integer crid;

    private Integer statusid;

    private String craddr;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getCrid() {
        return crid;
    }

    public void setCrid(Integer crid) {
        this.crid = crid;
    }

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public String getCraddr() {
        return craddr;
    }

    public void setCraddr(String craddr) {
        this.craddr = craddr;
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