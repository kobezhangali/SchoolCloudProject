package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClassInfo implements Serializable {

    private String username;

    private String cname;

    private String name;

    private String gname;

    private String ginfo;

    private String pname;

    private String collegename;

    private String collegeinfo;
}
