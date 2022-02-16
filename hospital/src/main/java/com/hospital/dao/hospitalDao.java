package com.hospital.dao;

import com.hospital.bean.hospitalBean;

import java.sql.Connection;
import java.util.List;

public interface hospitalDao {
    int save(Connection conn, hospitalBean hos);

    List<hospitalBean> search(Connection conn,String name);

    void delete(Connection conn, String name);
}
