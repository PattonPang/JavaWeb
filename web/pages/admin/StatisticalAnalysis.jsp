<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>统计分析图</title>
    <jsp:include page="../public/base.jsp"/>
    <link rel="stylesheet" href="static/css/QuestionsManage.css">
    <script src="static/js/echarts-4.7.0.js"></script>
</head>
<body>
<jsp:include page="../public/AdminHeader.jsp"/>
<div class="main">
    <div class="main_part">
        <div class="main_part_top" style="padding: 0 80px;border: 1px solid #1687d9;border-bottom: none;">
            <div class="kj" style="margin-left: 0;text-align: center;width: 100%;">${requestScope.teacherMap.get(requestScope.beanByTea.teaId)}</div>
        </div>
        <div class="plan" style="border: 1px solid #1687d9;border-top: none;">
            <div id="tsa" style="width: 500px;height: 300px;margin: 20px auto 0;"></div>
        </div>
    </div>
</div>
<jsp:include page="../public/Footer.jsp"/>
<span id="Only" style="display: none;">StatisticalAnalysis</span>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('tsa'));

    // 指定图表的配置项和数据
    var option = {
        tooltip: {},
        legend: {
            data: ['分数']
        },
        xAxis: {
            data: ["第一题", "第二题", "第三题", "第四题", "第五题", "总分"]
        },
        yAxis: {},
        series: [{
            name: '分数',
            type: 'bar',
            data: [${requestScope.beanByTea.q1Mark},
                ${requestScope.beanByTea.q2Mark},
                ${requestScope.beanByTea.q3Mark},
                ${requestScope.beanByTea.q4Mark},
                ${requestScope.beanByTea.q5Mark},
                ${requestScope.beanByTea.allMark}],
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