package com.ali.entity;

import java.io.Serializable;

/**
 * (Cou)实体类
 *
 * @author makejava
 * @since 2020-11-18 11:09:56
 */
public class Cou implements Serializable {
    private static final long serialVersionUID = -48503770633760960L;

    private Integer couid;

    private String couname;

    private String bak1;


    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public String getCouname() {
        return couname;
    }

    public void setCouname(String couname) {
        this.couname = couname;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

}