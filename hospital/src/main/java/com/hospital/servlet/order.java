package com.hospital.servlet;

import com.hospital.bean.userBean;
import com.hospital.dao.userDao;
import com.hospital.dao.userDaoImpl;
import com.hospital.service.userService;
import com.hospital.service.userServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class order extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userBean tmp=new userBean();
        tmp=(userBean) req.getSession().getAttribute("currentUser");
        tmp.setState(1);
        userService us=new userServiceImpl();
        HttpSession session = req.getSession();
        us.change(tmp,session);
        req.getRequestDispatcher("./payment.jsp").forward(req,resp);
    }
}
