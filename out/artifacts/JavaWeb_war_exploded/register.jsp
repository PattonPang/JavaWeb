<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎来到注册页面</title>
    <jsp:include page="pages/public/base.jsp"/>
    <script type="text/javascript">

    </script>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        #wrap {
            height: 100%;
            background-image: url(static/image/LoginBack.png);
            background-repeat: no-repeat;
            background-position: center center;
            position: relative;
            padding-top: 1%;
        }

        #wrap .logGet {
            height: 600px;
            width: 450px;
            background-color: #FFFFFF;
        }

        .logGet {
            margin: 0 auto;
        }

        .logC a button {
            width: 100%;
            height: 45px;
            background-color: #ee7700;
            border: none;
            color: white;
            font-size: 18px;
        }

        .logC .reg {
            display: block;
            width: 100%;
            height: 45px;
            background-color: #ee7700;
            border: none;
            color: white;
            font-size: 18px;
            text-align: center;
            text-decoration: none;
            margin-top: 30px;
            line-height: 45px;
        }

        .logGet .logD.logDtip .p1 {
            display: inline-block;
            font-size: 28px;
            margin-top: 30px;
            width: 86%;
        }

        #wrap .logGet .logD.logDtip {
            width: 86%;
            border-bottom: 1px solid #ee7700;
            margin: 60px auto 0;
        }

        .logGet .lgD img {
            top: 12px;
            left: 8px;
        }

        .logGet .lgD input {
            display: inline-block;
            width: 100%;
            height: 42px;
        }

        #wrap .logGet .lgD {
            width: 86%;
            position: relative;
            margin: 30px auto;
        }

        #wrap .logGet .logC {
            width: 86%;
            margin-top: 0px;
            margin-right: auto;
            margin-bottom: 0px;
            margin-left: auto;
        }
    </style>
</head>
<body>
<div class="wrap" id="wrap">
    <div class="logGet">
        <!-- 头部提示信息 -->
        <div class="logD logDtip">
            <p class="p1">注册</p>
        </div>
        <!-- 输入框 -->
        <form action="RegisterServlet" method="post">
            <input type="hidden" name="method" value="register">
            <span id="msg" style="color: #ff0000">${msg}</span>
            <div class="lgD">
                <label style="width: 70px;display: inline-block;margin-left: 20px;">学号：</label>
                <input type="number" class="form-control" id="username" name="username" value="${param.username}" placeholder="Username" style="width: 50%">
            </div>
            <div class="lgD">
                <label style="width: 70px;display: inline-block;margin-left: 20px;">密码：</label>
                <input type="password" class="form-control" id="passWd" name="passWd" placeholder="Password" style="width: 50%">
            </div>
            <div class="lgD">
                <label style="width: 70px;display: inline-block;margin-left: 20px;">确认密码：</label>
                <input type="password" class="form-control" id="rePassWd" name="passWd" placeholder="Password" style="width: 50%">
            </div>
            <div class="lgD">
                <label style="width: 70px;display: inline-block;margin-left: 20px;">姓名：</label>
                <input type="text" value="${param.studName}" class="form-control" id="stuName" name="stuName" placeholder="姓名" style="width: 50%">
            </div>
            <div class="lgD">
                <label style="width: 70px;display: inline-block;margin-left: 20px;">班级：</label>
                <select class="form-control" name="classId" id="classId" style="width: 50%;display: inline-block;">
                    <c:forEach items="${requestScope.classesList}" var="item">
                        <option value="${item.classId}">${item.className}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="logC">
                <a href="pages/student/Home.jsp" target="_self">
                    <button type="submit" id="registerBtn">注 册</button>
                </a>
                <a class="reg" href="index.jsp">返 回</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>