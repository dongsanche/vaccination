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
<script crossorigin="anonymous"
        integrity="sha512-n/4gHW3atM3QqRcbCn6ewmpxcLAHGaDjpEBu4xZd47N0W2oQ+6q7oc3PXstrJYXcbNU1OHdQ1T7pAP+gi5Yu8g=="
        src="https://lib.baomitu.com/jquery/3.6.0/jquery.js"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
      integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css"
      integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
        integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
        crossorigin="anonymous"></script>
<body style="display: flex;align-items: center;align-content: center;justify-content: center">
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

<div class="row" style="display: flex;flex-direction: column;justify-content: center;align-items: center">
    <div class="col-lg-6">
        <div class="input-group">
            <div class="input-group-btn">
                <button style="width:93px " type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">选择银行 <span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="#">华夏银行</a></li>
                    <li><a href="#">中国银行</a></li>
                    <li><a href="#">建设银行</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="#">其他</a></li>
                </ul>
            </div><!-- /btn-group -->
            <input type="text" class="form-control" aria-label="...">
        </div><!-- /input-group -->
    </div><!-- /.col-lg-6 -->
    <div class="col-lg-6" style="margin-top: 10px">
        <div class="input-group">
            <div class="input-group-btn">
                <button style="width:93px " type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">输入密码</button>
            </div><!-- /btn-group -->
            <input type="text" class="form-control" aria-label="...">
        </div><!-- /input-group -->
    </div><!-- /.col-lg-6 -->
    <button style="height: 30px;width: 80px;margin-top: 10px" type="button" onclick="ds('验证码：<%=code%>!')" >缴费</button>
</div><!-- /.row -->



<script>
    function ds(a){
        alert(a);
        window.location.href="http://localhost:8080/search.jsp";

    }
</script>

</body>
</html>
