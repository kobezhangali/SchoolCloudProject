package com.ali.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2020-11-17 23:32:28
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -93239699737585388L;

    private Integer sid;

    private Integer uid;

    private Integer cid;

    private String sex;

    private Integer age;

    private String addr;

    private String sdborn;

    private String idcard;

    private String hobby;

    private String highschool;

    private String plitical;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    public String getSdborn() {
        return sdborn;
    }

    public void setSdborn(String sdborn) {
        this.sdborn = sdborn;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHighschool() {
        return highschool;
    }

    public void setHighschool(String highschool) {
        this.highschool = highschool;
    }

    public String getPlitical() {
        return plitical;
    }

    public void setPlitical(String plitical) {
        this.plitical = plitical;
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