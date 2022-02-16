package com.hospital.servlet;

import com.hospital.bean.hospitalBean;
import com.hospital.bean.userBean;
import com.hospital.dao.hospitalDao;
import com.hospital.dao.hospitalDaoImpl;
import com.hospital.dao.userDao;
import com.hospital.dao.userDaoImpl;
import com.hospital.service.hospitalService;
import com.hospital.service.hospitalServiceImpl;
import com.hospital.util.DButil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class changehospital extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        hospitalDao hos = new hospitalDaoImpl();
        HttpSession session = req.getSession();
        DButil db = new DButil();
        Connection conn = db.getConnection();
        System.out.println("ddddddddddd+:  " + req.getParameter("time"));
        String op = req.getParameter("method");
        if (op != null) {
            if (op.equals("insert")) {
                hospitalBean tmp = new hospitalBean(0, req.getParameter("name"), req.getParameter("addressDesc"));
                hos.save(conn, tmp);
            } else {
                hos.delete(conn, (String) req.getParameter("hosname"));
            }
        }


        String op1 = req.getParameter("method1");
        userDao us = new userDaoImpl();
        if (op1 != null) {
            if (op1.equals("insert")) {
                System.out.println("ddddddddddd1+:  ");
                System.out.println("ddddddddddd1+:  " + req.getParameter("name"));
                userBean tmp = new userBean();
                tmp.setId(0);
                SimpleDateFormat tmpdate = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date utildate=tmpdate.parse(req.getParameter("time"));
                    java.sql.Date date=new java.sql.Date(utildate.getTime());
                    tmp.setTime(date);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                tmp.setState(Integer.valueOf(req.getParameter("inorder")));
                tmp.setPassword(req.getParameter("password"));
                tmp.setUsername(req.getParameter("name"));
                us.save(conn, tmp);
            } else {
                us.delete(conn, (String) req.getParameter("name"));
            }
        }


        hospitalService hosser = new hospitalServiceImpl();
        hosser.search("医院", session);
        session.setAttribute("userlist", us.search(conn, ""));
        session.setAttribute("list", session.getAttribute("serlist"));
        req.getRequestDispatcher("./changeinfo.jsp").forward(req, resp);
    }
}
