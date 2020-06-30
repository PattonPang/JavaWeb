<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的信息</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/CoursesManager.css">
</head>
<body>
<jsp:include page="../public/TeaHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">评教信息：${sessionScope.teachers.teaName}</div>
        </div>
        <table class="classes">
            <thead>
            <tr>
                <th scope="col" style="width: 23%;">课程名</th>
                <th scope="col" style="width: 23%;">班级名</th>
                <th scope="col" style="width: 9%;">第一题</th>
                <th scope="col" style="width: 9%;">第二题</th>
                <th scope="col" style="width: 9%;">第三题</th>
                <th scope="col" style="width: 9%;">第四题</th>
                <th scope="col" style="width: 9%;">第五题</th>
                <th scope="col" style="width: 9%;">总分</th>
            </tr>
            </thead>
            <c:forEach items="${requestScope.beanListByTea}" var="item">
                <tbody>
                <tr>
                    <td style="width: 23%;">${requestScope.classesMap.get(item.classId)}</td>
                    <td style="width: 23%;">${requestScope.coursesMap.get(item.courseId)}</td>
                    <td style="width: 9%;">${item.q1Mark}</td>
                    <td style="width: 9%;">${item.q2Mark}</td>
                    <td style="width: 9%;">${item.q3Mark}</td>
                    <td style="width: 9%;">${item.q4Mark}</td>
                    <td style="width: 9%;">${item.q5Mark}</td>
                    <td style="width: 9%;">${item.allMark}</td>
                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">SeeEva</span>
</body>
</html>