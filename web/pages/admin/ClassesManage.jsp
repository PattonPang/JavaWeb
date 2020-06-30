<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>班级管理</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/CoursesManager.css">
    <script type="text/javascript">
        $(function () {
            $(".delete").click(function () {
                if(!confirm("班级关联了非常多的相关数据，属于该班级的学生都将被删除，是否删除这个班级？")){
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
            <div class="kj" style="width: 130px;">班级</div>
            <div class="more">
                <a href="pages/admin/AddClass.jsp">新建班级</a>
            </div>
        </div>
        <table class="classes">
            <thead>
            <tr>
                <th scope="col" style="width: 12%;">ID</th>
                <th scope="col" style="width: 12%;">班级编号</th>
                <th scope="col" style="width: 52%;">班级名称</th>
                <th scope="col" colspan="2" style="width: 24%">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.beanListAllClasses}" var="item">
                <tr>
                    <td style="width: 12%;">${item.id}</td>
                    <td style="width: 12%;">${item.classId}</td>
                    <td style="width: 52%;">${item.className}</td>
                    <td style="width: 12%;"><a href="AdminServlet?method=toUpdateClass&id=${item.id}">修改</a></td>
                    <td style="width: 12%;"><a class="delete" href="AdminServlet?method=deleteClass&classId=${item.classId}">删除</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">ClassesManage</span>
</body>
</html>