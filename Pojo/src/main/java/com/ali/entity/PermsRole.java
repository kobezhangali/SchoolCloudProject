package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PermsRole implements Serializable {
    private int uid;
    private String name;
    private Integer rid;
    private String rname;
    private Integer pid;
    private String pname;
}
