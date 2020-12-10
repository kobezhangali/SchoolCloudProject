package com.ali.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class Roles implements Serializable {

    private int rid;
    private String rname;
    private String rdesc;
    private Set<Permissions> permissions;
}
