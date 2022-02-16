<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: 13224
  Date: 2022/2/15
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="">
<%
    Random r=new Random();
    Integer tmp=r.nextInt(1000000);
    String code=tmp.toString();
    while(code.length()<6)
    {
        code+="0";
    }
    code=new StringBuilder(code).reverse().toString();
%>
<button type="button" onclick="alert('验证码：<%=code%>!')">缴费</button>

</body>
</html>
