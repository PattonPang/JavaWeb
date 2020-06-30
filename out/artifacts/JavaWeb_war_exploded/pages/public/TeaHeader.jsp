<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../public/base.jsp"/>
<script src="static/js/HeaderChose.js"></script>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul id="headnav" class="nav navbar-nav" style="margin: 0 auto;width: 35%;float: none;">
                <li id="myInfo" class=""><a href="pages/teacher/MyInfo.jsp">${sessionScope.teachers.teaName}</a></li>
                <li id="home" class=""><a href="pages/teacher/Home.jsp">主页</a></li>
                <li id="seeEva" class=""><a href="TeacherServlet?method=toSeeEva">查看评教</a></li>
                <li><a href="OutServlet?method=outLogin">登出</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>