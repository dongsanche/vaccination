package com.hospital.servlet;

import com.hospital.service.userService;
import com.hospital.service.userServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class registerresult extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        userService userService = new userServiceImpl();
        String msg = userService.doRegister(username, password, session);
        req.setAttribute("msg", msg);
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}
