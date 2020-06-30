<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/Clean.css">
    <link rel="stylesheet" href="static/css/ChangeInfo.css">
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">修改信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="AdminServlet" method="post">
                    <li>
                        <label>ID：</label><input type="text" readonly="readonly" placeholder="ID" name="id" value=${sessionScope.admins.id}>
                    </li>
                    <li>
                        <label>用户名：</label><input type="text" readonly="readonly" placeholder="name" name="username" value=${sessionScope.admins.username}>
                    </li>
                    <li>
                        <label>密码：</label><input type="password" placeholder="password" name="password" value=${sessionScope.admins.passWd}>
                    </li>
                    <input type="hidden" name="method" value="changeAdmin">
                    <input style="display: block;margin: 0 auto;" type="submit" value="提交"/>
                </form>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">MyInfo</span>
</body>
</html>