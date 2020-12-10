package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ScoreInfo implements Serializable {

    private Object coursesscore;

    private Object normalscore;

    private Object total;

    private String term;

    private Integer couid;

    private String couname;

    private String bak1;
}
