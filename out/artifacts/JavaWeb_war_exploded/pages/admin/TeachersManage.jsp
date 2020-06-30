<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>老师管理</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/CoursesManager.css">
    <script type="text/javascript">
        $(function () {
            $(".delete").click(function () {
                if(!confirm("该老师的相关数据都将被删除，是否删除这个老师？")){
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
            <div class="kj" style="width: 130px;">老师信息</div>
            <div class="more">
                <a href="pages/admin/AddTeacher.jsp">新建老师</a>
            </div>
        </div>
        <table class="classes">
            <thead>
            <tr>
                <th scope="col" style="width: 12%;">ID</th>
                <th scope="col" style="width: 12%;">老师账号</th>
                <th scope="col" style="width: 40%;">老师名称</th>
                <th scope="col" colspan="3" style="width: 36%">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.beanListAllTeachers}" var="item">
                <tr>
                    <td style="width: 12%;">${item.id}</td>
                    <td style="width: 12%;">${item.username}</td>
                    <td style="width: 40%;">${item.teaName}</td>
                    <td style="width: 12%;"><a href="AdminServlet?method=toTACC&id=${item.id}&username=${item.username}&teaName=${item.teaName}">添加关系</a></td>
                    <td style="width: 12%;"><a href="AdminServlet?method=toUpdateTea&id=${item.id}">修改</a></td>
                    <td style="width: 12%;"><a class="delete" href="AdminServlet?method=deleteTea&username=${item.username}">删除</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">TeachersManage</span>
</body>
</html>