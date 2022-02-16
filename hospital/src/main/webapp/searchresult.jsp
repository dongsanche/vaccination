<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.hospital.bean.hospitalBean" %>
<%@ page import="com.hospital.bean.userBean" %><%--
  Created by IntelliJ IDEA.
  User: 13224
  Date: 2022/2/14
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center>
    <table border="2">
        <tr>
            <th>id</th>
            <th>医院名</th>
            <th>地址</th>
        </tr>
        <c:forEach items="${serlist}" var="usr" varStatus="idx">
            <tr>
                <td>${usr.id}</td>
                <td>${usr.name}</td>
                <td>${usr.addressDesc}</td>
                <%
                    userBean tmp = (userBean) session.getAttribute("currentUser");
                    request.setAttribute("currentUser", tmp);
                %>
            </tr>
        </c:forEach>
    </table>
</center>

</body>
</html>
