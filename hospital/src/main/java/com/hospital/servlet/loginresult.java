package com.hospital.servlet;

import com.hospital.dao.userDao;
import com.hospital.dao.userDaoImpl;
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

public class loginresult extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        userService userService = new userServiceImpl();
        System.out.println(username);
        System.out.println(password);
        System.out.println(session.getAttribute("currentUser"));
        String msg = userService.doLogin(username, password,session);
        req.setAttribute("msg", msg);
        req.setAttribute("name",username);
        session.setAttribute("name",username);
        hospitalService hosser=new hospitalServiceImpl();
        hosser.search("医院",session);
        DButil db=new DButil();
        Connection conn=db.getConnection();
        userDao us=new userDaoImpl();
        session.setAttribute("userlist",us.search(conn,""));
        session.setAttribute("list",session.getAttribute("serlist"));
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
