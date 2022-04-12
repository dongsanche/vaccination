package com.hospital.servlet;

import com.hospital.bean.adminBean;
import com.hospital.bean.userBean;
import com.hospital.dao.adminDao;
import com.hospital.dao.adminDaoImpl;
import com.hospital.service.hospitalService;
import com.hospital.service.hospitalServiceImpl;
import com.hospital.service.userService;
import com.hospital.service.userServiceImpl;
import com.hospital.util.DButil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;

public class admin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        String msg="重新登录";
        adminBean admin=new adminBean(username,password);
        adminDao adminImpl = new adminDaoImpl();
        DButil db=new DButil();
        Connection conn=db.getConnection();
        if (adminImpl.checkUsernameAndPassword(conn,admin)!=null) {
            msg = "成功";
        }
//        session.setAttribute("userlist",us.search(conn,""));
//        session.setAttribute("list",session.getAttribute("serlist"));
        req.setAttribute("msg", msg);
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
