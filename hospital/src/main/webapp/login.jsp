<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>登录</title>
    <link href="./style/authority/login_css.css" rel="stylesheet" type="text/css" charset="utf-8"/>
</head>
<body>

<div id="login_form">
    <form id="submitForm" action="${pageContext.request.contextPath}/login" method="post">
        <div id="login_text">
            用户名：<input type="text" name="username" class="username" id="username">
        </div>
        <div>
            密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" class="pwd" id="pwd"
                                              onkeypress="EnterPress(event)" onkeydown="EnterPress()">
        </div>
        <div id="btn_area">
            <input type="submit" class="login_btn" id="login_sub" value="登  录">
            <input type="reset" class="login_btn" value="重  置">
            <a class="login_btn" href="/register.jsp">注册</a>
        </div>
        <%
            application.setAttribute("url","http://localhost:8080/");
            System.out.println(application.getAttribute("url"));
        %>
    </form>
</div>

<%--<div style="display:none">--%>
<%--    <script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script>--%>
</div>
</body>
</html>