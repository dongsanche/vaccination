package com.hospital.service;

import com.hospital.bean.hospitalBean;
import com.hospital.bean.userBean;
import com.hospital.dao.hospitalDao;
import com.hospital.dao.hospitalDaoImpl;
import com.hospital.util.DButil;

import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.util.List;

public class hospitalServiceImpl implements hospitalService{
    public void search(String name, HttpSession session)
    {
        String msg;
        DButil db=new DButil();
        hospitalDao hos=new hospitalDaoImpl();
        Connection conn=db.getConnection();
        List<hospitalBean> list=null;
        list=hos.search(conn,name);
        session.setAttribute("serlist",list);
    }
}
