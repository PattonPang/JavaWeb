<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新课程</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/ChangeInfo.css">
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">关系信息</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="AdminServlet" method="post">
                    <input name="method" value="addTACC2" type="hidden" readonly="readonly">
                    <li>
                        <label>教师名：</label>
                        <select name="teaId" style="height: 24px;">
                            <c:forEach items="${requestScope.teachersList}" var="item">
                                <option value="${item.username}">${item.teaName}</option>
                            </c:forEach>
                        </select>
                    </li>
                    <li>
                        <label>课程：</label>
                        <select name="courseId" style="height: 24px;">
                            <c:forEach items="${requestScope.coursesList}" var="item">
                                <option value="${item.courseId}">${item.courseName}</option>
                            </c:forEach>
                        </select>
                    </li>
                    <li>
                        <label>班级：</label>
                        <select name="classId" style="height: 24px;">
                            <c:forEach items="${requestScope.classesList}" var="item">
                                <option value="${item.classId}">${item.className}</option>
                            </c:forEach>
                        </select>
                    </li>
                    <p style="color: red;text-align: center">${msg}</p>
                    <input style="margin: 0 auto;display: block;" type="submit" value="提交"/>
                </form>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">StatisticalAnalysis</span>
</body>
</html>