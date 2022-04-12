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
<%--        <input type="text" value="输入" name="name">--%>
<%--        <input type="submit" value="提交">--%>
    <div class="search">
        <form action="<%=application.getAttribute("url")%>/search" method="post">
            <input placeholder="请输入..." name="name" type="text">
            <button type="submit"></button>
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
            padding-left: 13px;
            border: 2px solid #044599;
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

</center>
</body>
</html>














