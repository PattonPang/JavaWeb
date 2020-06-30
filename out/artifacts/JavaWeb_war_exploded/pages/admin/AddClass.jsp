<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新建班级</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/ChangeInfo.css">
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">班级信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="AdminServlet" method="post">
                    <input name="method" value="addClass" type="hidden" readonly="readonly" >
                    <li>
                        <label>班级编号：</label><input type="number" name="classId" placeholder="请输入班级编号">
                        <p style="color: red;">${msg}</p>
                    </li>
                    <li>
                        <label>班级名称：</label><input type="text" name="className" placeholder="请输入班级名">
                    </li>
                    <input style="margin: 0 auto;display: block;" type="submit" value="提交"/>
                </form>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">ClassesManage</span>
</body>
</html>