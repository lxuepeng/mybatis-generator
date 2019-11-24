package com.baidu.item.entity;

public class TUser {
    private Integer id;

    private String name;

    private String sex;

    private String loginName;

    private String loginPwd;

    public TUser(Integer id, String name, String sex, String loginName, String loginPwd) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
    }

    public TUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }
}