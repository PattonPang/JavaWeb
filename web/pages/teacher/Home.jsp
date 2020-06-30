<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>老师主页</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/Home.css">
</head>
<body>
<jsp:include page="../public/TeaHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">个人信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <li>
                    <a>ID：${sessionScope.teachers.id}</a>
                </li>
                <li>
                    <a>用户名：${sessionScope.teachers.username}</a>
                </li>
                <li>
                    <a>姓名：${sessionScope.teachers.teaName}</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="but" style="margin: 0 9% 20px;">
        <a href="TeacherServlet?method=toSeeEva">
            <div class="aaa">
                <p class="tz">查看评教</p>
            </div>
        </a>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">Home</span>
</body>
</html>

