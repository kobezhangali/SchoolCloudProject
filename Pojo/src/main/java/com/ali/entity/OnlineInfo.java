package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OnlineInfo implements Serializable {
    private Integer uid;

    private String username;

    private String password;

    private String tel;

    private String name;

    private String sex;

    private Integer age;

    private String pname;

    private String collegename;

    private String gname;

    private String idcard;
}
