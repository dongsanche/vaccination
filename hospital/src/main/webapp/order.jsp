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
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
<body style="height: 100%;display: flex;justify-content: center;align-items: center">
<center>
<%--    <form method="post" action="${pageContext.request.contextPath}/order">--%>
<%--        <select style="width: 300px;" name="selected">--%>
<%--            <c:forEach items="${list}" var="usr" varStatus="idx">--%>
<%--                <option style="width: 200px"> ${usr.name}</option>--%>
<%--            </c:forEach>--%>
<%--        </select>--%>
<%--        <input type="submit" name="submit" value="挂号">--%>
<%--        <input type="date" name="date">--%>
<%--    </form>--%>
<%--    <form method="post" action="${pageContext.request.contextPath}/order">--%>
<%--        <input type="submit" name="submit" value="取消挂号">--%>
<%--    </form>--%>

    <div class="search">
        <form method="post" action="${pageContext.request.contextPath}/order">
                 <select style="width: 300px;height: 50px;margin-bottom: 10px;border-radius: 19px;" name="selected">
                     <c:forEach items="${list}" var="usr" varStatus="idx">
                           <option style="width: 200px"> ${usr.name}</option>
                     </c:forEach>
                   </select>
                <input type="submit" name="submit" value="挂号">
                <input type="date" name="date">
            </form>
         <form method="post" action="${pageContext.request.contextPath}/order">
                <input type="submit" name="submit" value="取消挂号" onclick="ds()">
        </form>
    </div>

    <style>
        * {
            box-sizing: border-box;
        }

        div.search {
            padding: 10px 0;
        }

        form {
            position: relative;
            width: 300px;
            margin: 0 auto;
        }

        input,button {
            border: none;
            outline: none;
        }

        .search input {
            width: 100%;
            height: 42px;
            padding-left: 100px;
            padding-right: 100px;
            border: 2px solid #044599;
            margin-top: 10px;
            border-radius: 19px;
            background: transparent;
        }

        .search button {
            height: 42px;
            width: 42px;
            cursor: pointer;
            position: absolute;
            background: #044599;
            border-radius: 0 19px 19px 0;
            width: 60px;
            right: 0;
        }
        .search button:hover {
            background-color: #044599;
        }


        .search button:before {
            content: "搜索";
            font-size: 13px;
            color: #F9F0DA;
        }
    </style>
    <script>
        function ds(){
            alert("取消成功");
            window.location.href="http://localhost:8080/order.jsp";

        }
    </script>
</center>

</body>
</html>
