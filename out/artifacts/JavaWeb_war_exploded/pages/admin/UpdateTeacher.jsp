<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改老师信息</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/ChangeInfo.css">
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">课程信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="AdminServlet" method="post">
                    <input name="method" value="updateTeacher" type="hidden" readonly="readonly" >
                    <li>
                        <label>ID：</label><input name="id" value="${requestScope.teachersBeanById.id}" readonly="readonly" >
                    </li>
                    <li>
                        <label>用户名：</label><input type="text" name="username" value="${requestScope.teachersBeanById.username}" readonly="readonly" >
                    </li>
                    <li>
                        <label>教师名：</label><input type="text" name="teaName" value="${requestScope.teachersBeanById.teaName}">
                    </li>
                    <li>
                        <label>密码：</label><input type="password" name="passWd" value="${requestScope.teachersBeanById.passWd}">
                    </li>
                    <input style="margin: 0 auto;display: block;" type="submit" value="提交"/>
                </form>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">TeachersManage</span>
</body>
</html>