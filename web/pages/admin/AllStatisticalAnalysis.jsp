<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>统计分析图</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/CoursesManager.css">
    <script src="static/js/echarts-4.7.0.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".delete").click(function () {
                if(!confirm("关系删除后老师的这个课程将会被删除，是否删除这个关系？")){
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
            <div class="kj" style="width: 130px;">统计图</div>
            <div class="more">
                <a href="AdminServlet?method=toTACC2">新建关系</a>
            </div>
        </div>
        <table class="classes">
            <thead>
            <tr>
                <th scope="col" style="width: 25%;">老师姓名</th>
                <th scope="col" style="width: 25%;">班级名</th>
                <th scope="col" style="width: 25%;">课程名</th>
                <th scope="col" colspan="2" style="width: 25%">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.teaMarkList}" var="item">
                <tr>
                    <td style="width: 25%;">${requestScope.teacherMap.get(item.teaId)}</td>
                    <td style="width: 25%;">${requestScope.classesMap.get(item.classId)}</td>
                    <td style="width: 25%;">${requestScope.coursesMap.get(item.courseId)}</td>
                    <td style="width: 12.5%;"><a href="AdminServlet?method=toTSA&teaId=${item.teaId}&classId=${item.classId}&courseId=${item.courseId}">查看</a></td>
                    <td style="width: 12.5%;"><a class="delete" href="AdminServlet?method=delTCC&teaId=${item.teaId}&classId=${item.classId}&courseId=${item.courseId}">删除</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div id="tsa" style="width: 100%;height: 400px;margin: 20px auto 0;"></div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">StatisticalAnalysis</span>

<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('tsa'));

    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '总览'
        },
        tooltip: {},
        legend: {
            data: ['分数']
        },
        xAxis: {
            data: [
                <c:forEach items="${requestScope.teaMarkList}" var="item">
                '${requestScope.teacherMap.get(item.teaId)}',
                </c:forEach>
            ]
        },
        yAxis: {},
        series: [{
            name: '分数',
            type: 'bar',
            data: [
                <c:forEach items="${requestScope.teaMarkList}" var="item">
                ${item.allMark},
                </c:forEach>
            ],
            itemStyle: {
                normal: {
                    color: '#87cefa'
                }
            },
        }]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</body>
</html>