<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13224
  Date: 2022/2/15
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="height: 100%;display: flex;justify-content: center;align-items: center">
<center>
    <form method="post" action="${pageContext.request.contextPath}/order">
        <select style="width: 300px;" name="selected">
            <c:forEach items="${list}" var="usr" varStatus="idx">
                <option style="width: 200px"> ${usr.name}</option>
            </c:forEach>
        </select>
        <input type="submit" value="挂号">
    </form>

</center>

</body>
</html>
