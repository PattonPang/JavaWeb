<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改班级信息</title>
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
                    <input name="method" value="updateClass" type="hidden" readonly="readonly" >
                    <li>
                        <label>ID：</label><input name="id" value="${requestScope.classesBeanById.id}" readonly="readonly" >
                    </li>
                    <li>
                        <label>班级编号：</label><input type="text" name="classId" value="${requestScope.classesBeanById.classId}">
                    </li>
                    <li>
                        <label>班级名称：</label><input type="text" name="className" value="${requestScope.classesBeanById.className}">
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