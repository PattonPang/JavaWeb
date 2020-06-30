<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评教规则管理</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/QuestionsManage.css">
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top" style="padding: 0 80px;border: 1px solid #1687d9;border-bottom: none;">
            <div class="kj" style="width: 130px;">评教问题</div>
        </div>

        <div class="plan">
            <div class="plan_title">
                <p>签到信息</p>
            </div>
            <div class="plan_nav1">
                <ul>
                    <li>
                        <div class="plan_nav1_part"><p>开始评教</p></div>
                    </li>
                    <li>
                        <div class="plan_nav1_part"><p>结束评教</p></div>
                    </li>
                </ul>
            </div>
            <div class="plan_main">
                <div class="main_part" style="padding: 0 15%;">
                    <form action="AdminServlet" method="post">
                        <input name="method" value="trueSIsTrue" type="hidden" readonly="readonly">
                        <label style="width: 7%;display: inline-block;margin-left: 15%;">班级：</label>
                        <select class="form-control" name="classId"
                                style="width: 50%;display: inline-block;margin-bottom: 15px;">
                            <c:forEach items="${requestScope.classesList}" var="item">
                                <option value="${item.classId}">${item.className}</option>
                            </c:forEach>
                        </select>
                        <br/>
                        <label style="width: 7%;display: inline-block;margin-left: 15%;">课程：</label>
                        <select class="form-control" name="courseId"
                                style="width: 50%;display: inline-block;margin-bottom: 15px;">
                            <c:forEach items="${requestScope.coursesList}" var="item">
                                <option value="${item.courseId}">${item.courseName}</option>
                            </c:forEach>
                        </select>
                        <input style="margin: 0 auto;display: block;" type="submit" value="开始评教">
                        <p style="text-align: center;">默认评教分数为100分</p>
                    </form>
                </div>
            </div>
            <div class="plan_main">
                <div class="main_part" style="padding: 0 15%;">
                    <form action="AdminServlet" method="post">
                        <input name="method" value="falseSIsTrue" type="hidden" readonly="readonly">
                        <label style="width: 7%;display: inline-block;margin-left: 15%;">班级：</label>
                        <select class="form-control" name="classId"
                                style="width: 50%;display: inline-block;margin-bottom: 15px;">
                            <c:forEach items="${requestScope.classesList}" var="item">
                                <option value="${item.classId}">${item.className}</option>
                            </c:forEach>
                        </select>
                        <br/>
                        <label style="width: 7%;display: inline-block;margin-left: 15%;">课程：</label>
                        <select class="form-control" name="courseId"
                                style="width: 50%;display: inline-block;margin-bottom: 15px;">
                            <c:forEach items="${requestScope.coursesList}" var="item">
                                <option value="${item.courseId}">${item.courseName}</option>
                            </c:forEach>
                        </select>
                        <input style="margin: 0 auto;display: block;" type="submit" value="结束评教">
                        <p style="text-align: center;">默认评教分数为100分</p>
                    </form>
                </div>
            </div>
        </div>
        <table class="classes">
            <thead>
            <tr>
                <th scope="col" style="width: 88%;">评教问题</th>
                <th scope="col" colspan="2" style="width: 12%">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.beanListAllQ}" var="item">
                <tr>
                    <td style="width: 52%;text-align: left;padding-left: 30px;">${item.question}</td>
                    <td style="width: 12%;"><a href="AdminServlet?method=toUpdateQ&id=${item.id}">修改</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">QuestionsManage</span>
<script>
    $(function () {
        if ($("td").text() == "") {
            this.remove();
        }
    })
    $('div.plan_nav1_part').mousemove(function () {
        var n = $("div.plan_nav1_part").index(this)
        console.log(n);
        $('div').parent().removeClass('dianji1');
        $('div').removeClass('dianji2');
        $('div.plan_main').css('display', 'none');
        $(this).parent().addClass('dianji1');
        $(this).addClass('dianji2');
        console.log($('.plan_main').eq(n).length);
        $('.plan_main').eq(n).css('display', 'block');
    })
</script>
</body>
</html>