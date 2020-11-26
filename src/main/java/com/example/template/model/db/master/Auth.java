package com.example.template.model.db.master;

import com.example.template.model.db.RefObject;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="auth")
public class Auth extends RefObject {
    private String code;
    private String name;
    private String password;

    public Auth(String code, String name, String password) {
        this.code = code;
        this.name = name;
        this.password = password;
    }

    public Auth() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
