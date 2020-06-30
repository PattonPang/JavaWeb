<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评教</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/MyInfo.css">
</head>
<body>
<jsp:include page="../public/StuHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top">
            <div class="kj">开始评教</div>
        </div>
        <div class="main_part_nav">
            <ul>
                <form action="StudentServlet" method="post">
                    <c:forEach items="${requestScope.questionsBeanListAll}" var="item">
                        <li>
                            <a>${item.question}</a>
                            <br/>
                            <select class="form-control" name="q${item.id}mark" style="width: 50%;display: inline-block;">
                                <option value="20">${item.mark20}</option>
                                <option value="15">${item.mark15}</option>
                                <option value="10">${item.mark10}</option>
                                <option value="5">${item.mark5}</option>
                                <option value="0">${item.mark0}</option>
                            </select>
                        </li>
                    </c:forEach>
                    <input type="hidden" name="method" value="upSCCTQM">
                    <li>
                        <input name="stuId" type="hidden" value="${requestScope.scctqm.stuId}" readonly="readonly" >
                    </li>
                    <li>
                        <input name="classId" type="hidden" value="${requestScope.scctqm.classId}" readonly="readonly" >
                    </li>
                    <li>
                        <input name="courseId" type="hidden" value="${requestScope.scctqm.courseId}" readonly="readonly" >
                    </li>
                    <li>
                        <input name="teaId" type="hidden" value="${requestScope.scctqm.teaId}" readonly="readonly" >
                    </li>
                    <input style="margin: 0 auto;display: block;" type="submit" value="提交"/>
                </form>
            </ul>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">EvaTea</span>
</body>
</html>