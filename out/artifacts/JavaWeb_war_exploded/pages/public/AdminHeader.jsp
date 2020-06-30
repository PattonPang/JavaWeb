<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../public/base.jsp"/>
<script src="static/js/HeaderChose.js"></script>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul id="headnav" class="nav navbar-nav" style="margin: 0 auto;width: 55%;float: none;">
                <li id="myInfo" class=""><a href="pages/admin/MyInfo.jsp">${sessionScope.admins.username}</a></li>
                <li id="home" class=""><a href="pages/admin/Home.jsp">主页</a></li>
                <li id="coursesManage" class=""><a href="AdminServlet?method=getAllCourse">课程管理</a></li>
                <li id="classesManage" class=""><a href="AdminServlet?method=getAllClass">班级管理</a></li>
                <li id="questionsManage" class=""><a href="AdminServlet?method=getAllQ">评教规则管理</a></li>
                <li id="teachersManage" class=""><a href="AdminServlet?method=getAllTeacher">教师管理</a></li>
                <li id="studentsManage" class=""><a href="AdminServlet?method=getAllStudent">学生管理</a></li>
                <li id="statisticalAnalysis" class=""><a href="AdminServlet?method=toSA">统计分析图</a></li>
                <li><a href="OutServlet?method=outLogin">登出</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
