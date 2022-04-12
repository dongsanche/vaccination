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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class order extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userBean tmp=new userBean();
        tmp=(userBean) req.getSession().getAttribute("currentUser");
        String tmpstate=req.getParameter("submit");
        if(tmpstate.equals("挂号"))
        {
            tmp.setState(1);
            SimpleDateFormat tmpdate = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date utildate=tmpdate.parse(req.getParameter("date"));
                java.sql.Date date=new java.sql.Date(utildate.getTime());
                tmp.setTime(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            userService us=new userServiceImpl();
            HttpSession session = req.getSession();
            us.change(tmp,session);
            req.getRequestDispatcher("./payment.jsp").forward(req,resp);
        }
        else
        {
            tmp.setState(0);
            userService us=new userServiceImpl();
            HttpSession session = req.getSession();
            us.change(tmp,session);
            req.getRequestDispatcher("./order.jsp").forward(req,resp);
        }
    }
}
