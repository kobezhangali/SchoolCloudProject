package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseAll implements Serializable {
    private Integer couid;

    private String bak1;

    private String couname;

    private String coursedate;

    private Integer hour;

    private String starts;

    private String overs;

    private String ctname;

    private String ctdesc;

    private String cpname;

    private String cpdesc;

    private String craddr;
}
