package com.hospital.servlet;

import com.hospital.service.hospitalService;
import com.hospital.service.hospitalServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class searchresult extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        hospitalService hosser=new hospitalServiceImpl();
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        hosser.search(name,session);
        req.setAttribute("serlist",session.getAttribute("serlist"));
        req.getRequestDispatcher("/searchresult.jsp").forward(req, resp);
        return;
    }
}
