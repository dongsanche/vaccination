<%@ page import="java.util.Timer" %>
<%@ page import="java.util.TimerTask" %>
<%@ page import="java.io.IOException" %>
<?xml version="1.0" encoding="UTF-8"?>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String url;
    String msg=(String) request.getAttribute("msg");

    if (msg=="登录成功"||msg=="注册成功")
    {
        url="index";
    }
    else if(msg=="该用户名已存在"||msg=="注册失败，请检查相关信息")
    {
        url="register.jsp";
    }
    else if(msg=="登录失败，用户不存在"||msg=="登录失败，密码错误")
    {
        url="login.jsp";
    }
    else if(msg=="重新登录")
    {
        url="admin.jsp";
    }
    else
    {
        url="changeinfo.jsp";
    }
    pageContext.setAttribute("url",url);
//    request.getRequestDispatcher("/"+url);
%>
<html>
<head>
    <meta http-equiv="Refresh" content="3;url=${pageContext.request.contextPath}/${url}" />
</head>
<body style="height:100%;width:100%;display: flex;justify-content: center;align-items: center">
<h2>
   ${msg}，即将跳转...
</h2>
<%

//    url+="/";
//    Timer timer=new Timer();
//    String finalUrl = url;
//    timer.schedule(new TimerTask() {
//        @Override
//        public void run() {
//            System.out.println("dddd");
//            try {
//                request.getRequestDispatcher("./login.jsp").forward(request,response);
//            } catch (ServletException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    },500);
//    System.out.println("dddd1");
%>
</body>
</html>
