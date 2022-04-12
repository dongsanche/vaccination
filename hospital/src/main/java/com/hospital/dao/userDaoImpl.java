package com.hospital.dao;

import com.hospital.bean.hospitalBean;
import com.hospital.bean.userBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @description:
 * @author: hospital
 * @date: 2018-10-23
 */

public class userDaoImpl implements userDao {

    @Override
    public int save(Connection conn, userBean user) {
        int saveResult = 0;
        try {
            String sql = "insert into user(id,inorder,name,password,orderTime) values(?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 0);
            pstmt.setInt(2, user.getState());
            pstmt.setString(3, user.getUsername());
            pstmt.setString(4, user.getPassword());
            pstmt.setDate(5, (Date) user.getTime());
            saveResult = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        return saveResult;

    }


    @Override
    public boolean checkUsername(Connection conn, String username) {
        ResultSet rs;
        boolean checkResult = false;
        try {
            String sql = "select * from user where name = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            checkResult = rs.next();
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkResult;
    }


    @Override
    public boolean checkPassword(Connection conn, String password) {
        ResultSet rs;
        boolean checkResult = false;
        try {
            String sql = "select * from user where password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, password);
            rs = pstmt.executeQuery();
            checkResult = rs.next();
            rs.close();
            pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkResult;
    }

    @Override
    public Integer delete(Connection conn, String name) {
        Integer saveResult = 0;
        try {
            String sql = "delete  from user where name=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            saveResult = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return saveResult;
    }

    @Override
    public userBean checkUsernameAndPassword(Connection conn, userBean user) {
        ResultSet rs;
        boolean checkResult = false;
        userBean res = new userBean();
        try {
            String sql = "select * from user" +
                    " where name = ? and password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            rs = pstmt.executeQuery();
            checkResult = rs.next();
            if (checkResult) {
                res.setId(rs.getInt("id"));
                res.setUsername(rs.getString("name"));
                res.setPassword(rs.getString("password"));
                res.setState(rs.getInt("inorder"));
                res.setTime(rs.getTime("ordertime"));
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!checkResult) {
            return null;
        } else {
            return res;
        }
    }

    @Override
    public List<userBean> search(Connection conn, String name) {
        int saveResult = 0;
        List<userBean> userlist=new ArrayList<>();
        try {
            String sql = "select *from user";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery(sql);
            Integer idx=0;
            while(rs.next())
            {

                userBean tmp=new userBean();
                tmp.setId(idx++);
                tmp.setUsername(rs.getString("name"));
                tmp.setPassword((rs.getString("password")));
                tmp.setState(rs.getInt("inorder"));
                tmp.setTime((java.util.Date) rs.getDate("ordertime"));
//                if(rs.getString("name").indexOf(name)!=-1)
                {
                    userlist.add(tmp);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        for(hospitalBean a:hoslist)
//        {
//            System.out.println(a.getName());
//        }

        return userlist;
    }
}
