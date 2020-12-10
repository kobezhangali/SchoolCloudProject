package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {

    private Integer eid;

    private String educationname;

    private String username;

    private String name;

    private String sex;

    private Integer age;

    private String addr;

    private String specialty;

    private String teacherbron;
}
