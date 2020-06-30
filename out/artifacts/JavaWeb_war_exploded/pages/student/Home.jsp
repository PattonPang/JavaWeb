<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生主页</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/Home.css">
</head>
<body>
<jsp:include page="../public/StuHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">个人信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <li>
                    <a>ID：${sessionScope.students.id}</a>
                </li>
                <li>
                    <a>学号：${sessionScope.students.username}</a>
                </li>
                <li>
                    <a>姓名：${sessionScope.students.stuName}</a>
                </li>
                <li>
                    <a>班级：${requestScope.beanByclassId.className}</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="but" style="margin: 0 9% 20px;">
        <a href="StudentServlet?method=toEvaTea">
            <div class="aaa">
                <p class="tz">评教</p>
            </div>
        </a>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">Home</span>
</body>
</html>
