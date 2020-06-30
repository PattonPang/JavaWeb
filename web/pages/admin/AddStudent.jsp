<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新建学生</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/ChangeInfo.css">
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">学生信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="AdminServlet" method="post">
                    <input name="method" value="addStudent" type="hidden" readonly="readonly" >
                    <li>
                        <label>学号：</label><input type="text" name="username" placeholder="请输入用户名" value="">
                        <p style="color: red;">${msg}</p>
                    </li>
                    <li>
                        <label>密码：</label><input type="password" name="passWd" placeholder="请输入密码" value="">
                    </li>
                    <li>
                        <label>名字：</label><input type="text" name="stuName" placeholder="请输入名字" value="">
                    </li>
                    <li>
                        <label>班级：</label>
                        <select name="classId" id="classId" style="height: 24px;">
                            <c:forEach items="${requestScope.classesList}" var="item">
                                <option value="${item.classId}">${item.className}</option>
                            </c:forEach>
                        </select>
                    </li>
                    <input style="margin: 0 auto;display: block;" type="submit" value="提交"/>
                </form>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">StudentsManage</span>
</body>
</html>