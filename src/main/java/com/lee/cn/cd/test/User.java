package com.lee.cn.cd.test;

/**
 * Created with IntelliJ IDEA.
 * User: wylipengming
 * Date: 14-3-21
 * Time: 下午2:01
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String name;
    private Integer age;
    private String pwd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != null ? !age.equals(user.age) : user.age != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (pwd != null ? !pwd.equals(user.pwd) : user.pwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
