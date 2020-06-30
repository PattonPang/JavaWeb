<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改问题</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/ChangeInfo.css">
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">问题</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="AdminServlet" method="post">
                    <input name="method" value="updateQ" type="hidden" readonly="readonly" >
                    <li style="padding: 0 110px;">
                        <label style="width: 130px;">ID：</label><input name="id" value="${requestScope.questionsBeanById.id}" readonly="readonly" >
                    </li>
                    <li style="padding: 0 110px;">
                        <label style="width: 130px;">问题：</label><input type="text" name="question" value="${requestScope.questionsBeanById.question}">
                    </li>
                    <li style="padding: 0 110px;">
                        <label style="width: 130px;">问题选项（20分）：</label><input type="text" name="mark20" value="${requestScope.questionsBeanById.mark20}">
                    </li>
                    <li style="padding: 0 110px;">
                        <label style="width: 130px;">问题选项（15分）：</label><input type="text" name="mark15" value="${requestScope.questionsBeanById.mark15}">
                    </li>
                    <li style="padding: 0 110px;">
                        <label style="width: 130px;">问题选项（10分）：</label><input type="text" name="mark10" value="${requestScope.questionsBeanById.mark10}">
                    </li>
                    <li style="padding: 0 110px;">
                        <label style="width: 130px;">问题选项（5分）：</label><input type="text" name="mark5" value="${requestScope.questionsBeanById.mark5}">
                    </li>
                    <li style="padding: 0 110px;">
                        <label style="width: 130px;">问题选项（0分）：</label><input type="text" name="mark0" value="${requestScope.questionsBeanById.mark0}">
                    </li>
                    <input style="margin: 0 auto;display: block;" type="submit" value="提交"/>
                </form>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">QuestionsManage</span>
</body>
</html>