package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Permissions implements Serializable {

    private int pid;
    private String pname;
    private String pdesc;
}
