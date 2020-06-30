<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员主页</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/Home.css">
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part" style="padding-left: 30px;padding-right: 30px;width: 100%;">
        <div class="main_part_top">
            <div class="kj">管理信息</div>
        </div>
        <div class="but">
            <a href="AdminServlet?method=getAllCourse">
                <div class="aaa">
                    <p class="tz">课程管理</p>
                </div>
            </a>
        </div>
        <div class="but">
            <a href="AdminServlet?method=getAllClass">
                <div class="aaa">
                    <p class="tz">班级管理</p>
                </div>
            </a>
        </div>
        <div class="but">
            <a href="AdminServlet?method=getAllQ">
                <div class="aaa">
                    <p class="tz">评教规则管理</p>
                </div>
            </a>
        </div>
        <div class="but">
            <a href="AdminServlet?method=getAllTeacher">
                <div class="aaa">
                    <p class="tz">教师管理</p>
                </div>
            </a>
        </div>
        <div class="but">
            <a href="AdminServlet?method=getAllStudent">
                <div class="aaa">
                    <p class="tz">学生管理</p>
                </div>
            </a>
        </div>
        <div class="but">
            <a href="AdminServlet?method=toSA">
                <div class="aaa">
                    <p class="tz">统计分析图</p>
                </div>
            </a>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">Home</span>
</body>
</html>
