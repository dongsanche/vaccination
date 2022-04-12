package com.hospital.bean;

public class adminBean {
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    public adminBean(String username,String password){
        this.username = username;
        this.password = password;

    }

    /**
     * 用户密码
     */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
