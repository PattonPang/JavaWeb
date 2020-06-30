<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/CoursesManager.css">
    <script type="text/javascript">
        $(function () {
            $(".delete").click(function () {
                if(!confirm("学生做过的评教也将被删除，是否删除这个学生？")){
                    return false;
                }
            })
        })
    </script>
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top" style="padding: 0 80px;border: 1px solid #1687d9;border-bottom: none;">
            <div class="kj" style="width: 130px;">学生</div>
            <div class="more">
                <a href="AdminServlet?method=toAddStudent">新建学生</a>
            </div>
        </div>
        <table class="classes">
            <thead>
            <tr>
                <th scope="col" style="width: 12%;">ID</th>
                <th scope="col" style="width: 12%;">学号</th>
                <th scope="col" style="width: 26%;">学生姓名</th>
                <th scope="col" style="width: 26%;">学生班级ID</th>
                <th scope="col" colspan="2" style="width: 24%;">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.beanListAllStudents}" var="item">
                <tr>
                    <td style="width: 12%;">${item.id}</td>
                    <td style="width: 12%;">${item.username}</td>
                    <td style="width: 26%;">${item.stuName}</td>
                    <td style="width: 26%;">${item.classId}</td>
                    <td style="width: 12%;"><a href="AdminServlet?method=toUpdateStu&id=${item.id}">修改</a></td>
                    <td style="width: 12%;"><a class="delete" href="AdminServlet?method=deleteStu&username=${item.username}">删除</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">StudentsManage</span>
</body>
</html>