package com.ali.entity;

import java.io.Serializable;

/**
 * (Score)实体类
 *
 * @author makejava
 * @since 2020-11-12 21:19:12
 */
public class Score implements Serializable {
    private static final long serialVersionUID = 649504877187414190L;

    private Integer sid;

    private Integer couid;

    private Integer scoreid;

    private Object coursesscore;

    private Object normalscore;

    private Object total;

    private String term;

    private String scoredesc;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public Object getCoursesscore() {
        return coursesscore;
    }

    public void setCoursesscore(Object coursesscore) {
        this.coursesscore = coursesscore;
    }

    public Object getNormalscore() {
        return normalscore;
    }

    public void setNormalscore(Object normalscore) {
        this.normalscore = normalscore;
    }

    public Object getTotal() {
        return total;
    }

    public void setTotal(Object total) {
        this.total = total;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getScoredesc() {
        return scoredesc;
    }

    public void setScoredesc(String scoredesc) {
        this.scoredesc = scoredesc;
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