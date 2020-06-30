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
<jsp:include page="../public/StuHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">修改信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="StudentServlet" method="post">
                    <input type="hidden" name="method" value="changeStu">
                    <li>
                        <label>ID：</label><input name="id" value="${sessionScope.students.id}" readonly="readonly">
                    </li>
                    <li>
                        <label>用户名：</label><input type="text" name="username" value="${sessionScope.students.username}"
                                                  readonly="readonly">
                    </li>
                    <li>
                        <label>姓名：</label><input type="text" name="stuName" value="${sessionScope.students.stuName}">
                    </li>
                    <li>
                        <label>密码：</label><input type="password" name="passWd" value="${sessionScope.students.passWd}">
                    </li>
                    <li>
                        <label>班级：</label><input name="id" value="${requestScope.beanByClassId.className}" readonly="readonly">
                    </li>
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