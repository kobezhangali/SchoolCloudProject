package com.ali.entity;

import java.io.Serializable;

/**
 * (Clazz)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:18
 */
public class Clazz implements Serializable {
    private static final long serialVersionUID = 761893287348898570L;

    private Integer cid;

    private Integer gid;

    private Integer pid;

    private String cname;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
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