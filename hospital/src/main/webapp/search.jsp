<%--
  Created by IntelliJ IDEA.
  User: 13224
  Date: 2022/2/14
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="display: flex;flex-direction: row;justify-content: center;align-items: center;width: 100%;height: 100%">
<center>
    <form action="<%=application.getAttribute("url")%>/search" method="post">
        <input type="text" value="输入" name="name">
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
