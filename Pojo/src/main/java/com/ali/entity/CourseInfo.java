package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseInfo implements Serializable {
    private Integer couid;
    private String couname;
    private String bak1;

    private String ctname;

    private String ctdesc;

    private String cpname;

    private String cpdesc;

    private String coursedate;

    private Integer hour;

    private String starts;

    private String overs;

    private String craddr;

    private String statusname;
}
