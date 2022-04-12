package com.hospital.dao;

import com.hospital.bean.adminBean;
import com.hospital.bean.userBean;

import java.sql.Connection;

public interface adminDao {
    userBean checkUsernameAndPassword(Connection conn, adminBean admin);
}
