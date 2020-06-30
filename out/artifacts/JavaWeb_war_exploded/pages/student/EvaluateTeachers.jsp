<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的信息</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/MyInfo.css">
</head>
<body>
<jsp:include page="../public/StuHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">评教</div>
        </div>
        <div class="main_part_nav">
            <p style="text-align: center;">默认评教分数为100分</p>
            <ul id="questions">
                <c:forEach items="${requestScope.stuBeanIsListAll}" var="item">
                    <li>
                        <a href="StudentServlet?method=toQuestion&stuId=${item.stuId}&classId=${item.classId}&courseId=${item.courseId}&teaId=${item.teaId}">${requestScope.teacherMap.get(item.teaId)}</a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">EvaTea</span>
<script>
    $(function(){
        if($("#questions").children("li").length == 0){
            $("#questions").text("你现在不需要进行评教");
        }
    });
</script>
</body>
</html>