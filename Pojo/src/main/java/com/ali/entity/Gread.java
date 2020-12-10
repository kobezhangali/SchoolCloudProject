package com.ali.entity;

import java.io.Serializable;

/**
 * (Gread)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:18:42
 */
public class Gread implements Serializable {
    private static final long serialVersionUID = -31634395454278008L;

    private Integer gid;

    private String gname;

    private String ginfo;


    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGinfo() {
        return ginfo;
    }

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo;
    }

}