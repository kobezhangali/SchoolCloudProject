package com.ali.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-11-16 15:37:12
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -43908611818975599L;

    private Integer uid;

    private String username;

    private String password;

    private String tel;

    private String name;

    private Set<Roles> roles;




    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}