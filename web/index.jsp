<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎来到登录页面</title>
    <jsp:include page="pages/public/base.jsp"/>
    <script type="text/javascript">
        $(function () {
            $("#login").click(function () {
                const username = $("#inputEmail3").val();
                const passWd = $("#inputPassword3").val();
                $("#msg").text("");
                const msg = $("#msg");
                if (username ===''){
                    msg.text('账号不能为空');
                    return false;
                }
                if (passWd ===''){
                    msg.text('密码不能为空');
                    return false;
                }
            })
        })
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
            padding-top: 7%;
        }

        #wrap .logGet {
            height: 500px;
            width: 368px;
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
            margin-bottom: 60px;
            margin-top: 0px;
            margin-right: auto;
            margin-left: auto;
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
            <p class="p1">登录</p>
        </div>
        <!-- 输入框 -->
        <form action="LoginServlet" method="post">
            <div class="lgD">
                <label style="width: 60px;display: inline-block;margin-left: 20px;">用户名：</label>
                <input type="text" class="form-control" id="inputEmail3" name="username" value="${param.username}" placeholder="Username" style="width: 50%">
            </div>
            <div class="lgD">
                <label style="width: 60px;display: inline-block;margin-left: 20px;">身份：</label>
                <select name="user" class="btn btn-default dropdown-toggle">
                    <option value="admins">管理员</option>
                    <option value="students">学生</option>
                    <option value="teacher">老师</option>
                </select>
                <br/>
            </div>
            <div class="lgD">
                <label style="width: 60px;display: inline-block;margin-left: 20px;">密码：</label>
                <input type="password" class="form-control" id="inputPassword3" name="passWd" placeholder="Password" style="width: 50%">
            </div>
            <span id="msg" style="color: #ff0000;display: block;text-align: center;">${msg}</span>
            <div class="logC">
                <a href="pages/student/Home.jsp" target="_self">
                    <button type="submit" id="login">登 录</button>
                </a>
                <a class="reg" href="RegisterServlet?method=getAllClassesStu">注 册</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>