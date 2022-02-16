package com.hospital.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.hospital.bean.hospitalBean;
import com.hospital.bean.userBean;

import java.sql.ResultSet;


public interface userDao {

    /**
     * 保存用户信息
     * @param user 用户信息
     * @return 数据库影响行数
     */
    int save(Connection conn,userBean user);


    /**
     * 检查用户名是否存在
     * @param username 用户名
     * @return 检查结果
     */
    boolean checkUsername(Connection conn, String username);


    /**
     * 检查用户密码是否存在
     * @param password 密码
     * @return 检查结果
     */
    boolean checkPassword(Connection conn,String password);

    /**
     * 检查用户是否存在
     * @param user 用户信息
     * @return 检查结果
     */
    userBean checkUsernameAndPassword(Connection conn,userBean user);


    /**
     * 删除用户
     * @param name 用户信息
     * @return 检查结果
     */
    Integer delete(Connection conn,String name);


    /**
     * 查找用户
     * @param name 用户信息
     * @return 检查结果
     */
    List<userBean> search(Connection conn, String name);
}

