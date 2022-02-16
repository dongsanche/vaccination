package com.hospital.bean;

import com.mysql.cj.Session;

import java.util.Date;

public class userBean {

    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;


    /**
     * 用户密码
     */
    private String password;

    /**
     * 是否已挂号：0表示，1表示已
     */
    private Integer inorder;

    /**
     * 预约时间
     */
    private Date ordertime;

    public userBean(){

    }

    public userBean(String username,String password){
        this.username = username;
        this.password = password;
        this.inorder=0;
        this.ordertime=null;
    }




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

    public Integer getState() {
        return inorder;
    }

    public void setState(Integer state) {
        this.inorder = state;
    }

    public Date getTime() {
        return ordertime;
    }

    public void setTime(Date time) {
        this.ordertime = time;
    }
}
