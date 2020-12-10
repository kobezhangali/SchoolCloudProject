package com.ali.entity;

import java.io.Serializable;

/**
 * (CourseProfession)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:39
 */
public class CourseProfession implements Serializable {
    private static final long serialVersionUID = 266842155280029329L;

    private Integer cpid;

    private Integer ctid;

    private String cpname;

    private String cpdesc;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public String getCpname() {
        return cpname;
    }

    public void setCpname(String cpname) {
        this.cpname = cpname;
    }

    public String getCpdesc() {
        return cpdesc;
    }

    public void setCpdesc(String cpdesc) {
        this.cpdesc = cpdesc;
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