<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>注册</title>
    <link href="./style/authority/login_css.css" rel="stylesheet" type="text/css" charset="utf-8"/>
</head>
<body>

<div id="login_form">
    <form id="submitForm" action="${pageContext.request.contextPath}/register" method="post">
        <div id="login_text">
            用户名：<input type="text" name="username" class="username" id="username">
        </div>
        <div>
            密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" class="pwd" id="pwd"
                                              onkeypress="EnterPress(event)" onkeydown="EnterPress()">
        </div>
        <div id="btn_area">
            <input type="submit" value="注册">
        </div>
    </form>
</div>

</div>
</body>
</html>