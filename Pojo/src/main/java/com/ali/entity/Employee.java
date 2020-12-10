package com.ali.entity;

import java.io.Serializable;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:41
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -25866911140765773L;

    private Integer eid;

    private Integer uid;

    private Integer educationid;

    private String sex;

    private Integer age;

    private String addr;

    private String specialty;

    private String teacherbron;

    private String idcard;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getEducationid() {
        return educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getTeacherbron() {
        return teacherbron;
    }

    public void setTeacherbron(String teacherbron) {
        this.teacherbron = teacherbron;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
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