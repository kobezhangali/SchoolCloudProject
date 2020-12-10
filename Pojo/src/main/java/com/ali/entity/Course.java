package com.ali.entity;

import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2020-11-17 23:32:26
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 992652738907352968L;

    private Integer courseid;

    private Integer cpid;

    private Integer crid;

    private Integer eid;

    private Integer couid;

    private String coursedate;

    private Integer hour;

    private String starts;

    private String overs;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public Integer getCrid() {
        return crid;
    }

    public void setCrid(Integer crid) {
        this.crid = crid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public String getCoursedate() {
        return coursedate;
    }

    public void setCoursedate(String coursedate) {
        this.coursedate = coursedate;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public String getStarts() {
        return starts;
    }

    public void setStarts(String starts) {
        this.starts = starts;
    }

    public String getOvers() {
        return overs;
    }

    public void setOvers(String overs) {
        this.overs = overs;
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