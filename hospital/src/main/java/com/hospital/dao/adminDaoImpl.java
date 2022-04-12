package com.hospital.dao;

import com.hospital.bean.adminBean;
import com.hospital.bean.userBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adminDaoImpl implements adminDao{
    public userBean checkUsernameAndPassword(Connection conn, adminBean admin) {
        ResultSet rs;
        boolean checkResult = false;
        userBean res = new userBean();
        try {
            String sql = "select * from admin" +
                    " where name = ? and password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, admin.getUsername());
            pstmt.setString(2, admin.getPassword());
            rs = pstmt.executeQuery();
            checkResult = rs.next();
            if (checkResult) {
                res.setId(rs.getInt("id"));
                res.setUsername(rs.getString("name"));
                res.setPassword(rs.getString("password"));
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
}
