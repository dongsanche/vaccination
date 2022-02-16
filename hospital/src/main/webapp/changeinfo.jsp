<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.hospital.bean.userBean" %><%--
  Created by IntelliJ IDEA.
  User: 13224
  Date: 2022/2/15
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center>
    <table border="2" style="width: 100%">
        <tr>
            <th>id</th>
            <th>医院名</th>
            <th>地址</th>
            <th>更改</th>
        </tr>
        <c:forEach items="${list}" var="usr" varStatus="idx">
            <tr>
                <td>${usr.id}</td>
                <td>${usr.name}</td>
                <td>${usr.addressDesc}</td>
                <%
                    userBean tmp = (userBean) session.getAttribute("currentUser");
                    request.setAttribute("currentUser", tmp);
                %>
                <td>
                    <form style="margin-bottom: 0px" method="post"
                          action="${pageContext.request.contextPath}/changehospital">
                        <input style="width: 100%" type="submit" value="删除">
                        <input type="hidden" name="method" value="delete">
                        <input type="hidden" name="hosname" value=${usr.name}>
                    </form>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td>
                <input type="text" name="id" form="form1">
            </td>
            <td>
                <input type="text" name="name" form="form1">
            </td>
            <td>
                <input type="text" name="addressDesc" form="form1">
            </td>
            <td>
                <form method="post" action="${pageContext.request.contextPath}/changehospital" style="margin-bottom: 0"
                      id="form1">
                    <input style="width: 100%" type="submit" value="添加">
                    <input type="hidden" name="method" value="insert">
                </form>
            </td>
        </tr>
    </table>

    <table border="2" style="width: 100%">
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>密码</th>
            <th>是否挂号</th>
            <th>挂号时间</th>
            <th>更改</th>
        </tr>
        <c:forEach items="${userlist}" var="user" varStatus="idx">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.getState()}</td>
                <td>${user.getTime()}</td>
                <%
                    userBean tmp = (userBean) session.getAttribute("currentUser");
                    request.setAttribute("currentUser", tmp);
                %>
                <td>
                    <form style="margin-bottom: 0px" method="post"
                          action="${pageContext.request.contextPath}/changehospital">
                        <input style="width: 100%" type="submit" value="删除">
                        <input type="hidden" name="method" value="delete">
                        <input type="hidden" name="hosname" value=${user.username}>
                    </form>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td>
                <input type="text" name="id" form="form2">
            </td>
            <td>
                <input type="text" name="name" form="form2">
            </td>
            <td>
                <input type="text" name="password" form="form2">
            </td>
            <td>
                <input type="number" name="inorder" form="form2">
            </td>
            <td>
                <input type="date" name="time" form="form2">
            </td>
            <td>
                <form method="post" action="${pageContext.request.contextPath}/changehospital" style="margin-bottom: 0"
                      id="form2">
                    <input style="width: 100%" type="submit" value="添加">
                    <input type="hidden" name="method1" value="insert">
                </form>
            </td>
        </tr>
    </table>
</center>
</body>
</html>
