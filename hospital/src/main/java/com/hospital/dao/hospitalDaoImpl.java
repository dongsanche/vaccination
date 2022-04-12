package com.hospital.dao;

import com.hospital.bean.hospitalBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class hospitalDaoImpl implements hospitalDao{
    @Override
    public int save(Connection conn, hospitalBean hos) {
        int saveResult = 0;
        try {
            String sql = "insert into hospital(id,name,addressDesc) values(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 0);
            pstmt.setString(2, hos.getName());
            pstmt.setString(3, hos.getAddressDesc());
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
    public void delete(Connection conn, String name) {
        int saveResult = 0;
        try {
            String sql = "delete from hospital where name =?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            saveResult = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<hospitalBean> search(Connection conn, String name) {
        int saveResult = 0;
        List<hospitalBean> hoslist=new ArrayList<>();
        try {
            String sql = "select *from hospital";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery(sql);
            Integer idx=0;
            while(rs.next())
            {
                hospitalBean tmp=new hospitalBean();
                tmp.setId(idx++);
                tmp.setName(rs.getString("name"));
                tmp.setAddressDesc((rs.getString("addressDesc")));
                if(rs.getString("name").indexOf(name)!=-1)
                {
                    hoslist.add(tmp);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        for(hospitalBean a:hoslist)
//        {
//            System.out.println(a.getName());
//        }
        return hoslist;
    }
}
