package com.lee.cn.cd;

/**
 * Created with IntelliJ IDEA.
 * com.lee.cn.cd.User: wylipengming
 * Date: 14-3-11
 * Time: 下午2:06
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String userName;
    private String pwd;
    private String email;
    private String typeStr;
    private String roleStr;

    public User() {
    }

    public User(String userName, String pwd, String email, String typeStr, String roleStr) {
        this.userName = userName;
        this.pwd = pwd;
        this.email = email;
        this.typeStr = typeStr;
        this.roleStr = roleStr;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    public String getRoleStr() {
        return roleStr;
    }

    public void setRoleStr(String roleStr) {
        this.roleStr = roleStr;
    }
}
