<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>欢迎来到登录页面</title>
	<link rel="stylesheet" href="static/layui/css/layui.css"/>
	<script src="static/layui/layui.all.js"></script>
	<jsp:include page="pages/public/base.jsp"/>
	<style type="text/css">
		* {
			margin: 0;
			padding: 0;
		}
		
		.wrap {
			height: 100%;
			background-image: url(static/image/LoginBack.png);
			background-repeat: no-repeat;
			background-position: center center;
			position: relative;
			padding-top: 7%;
		}
		
		.logD.logDtip .p1 {
			display: inline-block;
			font-size: 28px;
			margin-top: 30px;
			width: 86%;
			font-weight: 100;
		}
		
		.logD.logDtip {
			width: 86%;
			border-bottom: 1px solid #e6e6e6;
			margin: 0 auto 30px;
		}
		
		.lgD {
			width: 86%;
			position: relative;
			margin: 30px auto;
		}
	
	</style>
</head>
<body>
<div class="wrap">
	<div style="margin:30px auto 0;width: 450px;border: 1px solid #c6c6c6;padding: 10px 0 0;background: white;">
		<div class="logD logDtip">
			<p class="p1">登录</p>
		</div>
		<form class="layui-form" action="LoginServlet" method="post" style="padding: 0 50px 30px 10px;">
			<div class="layui-form-item">
				<label class="layui-form-label">用户名</label>
				<div class="layui-input-block">
					<input type="text" name="username" value="${param.username}" lay-verify="required"
					       lay-reqtext="用户名是必填项，岂能为空？" placeholder="请输入用户名"
					       class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">密码</label>
				<div class="layui-input-block">
					<input type="password" name="passWd" lay-verify="pass" placeholder="请输入密码" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">身份</label>
				<div class="layui-input-block">
					<input style="width: 100%;" type="radio" name="user" value="admins" title="管理员" checked="">
					<input style="width: 100%;" type="radio" name="user" value="students" title="学生">
					<input style="width: 100%;" type="radio" name="user" value="teacher" title="老师">
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button type="submit" class="layui-btn" lay-submit="" lay-filter="demo2">立即提交</button>
					<a href="RegisterServlet?method=getAllClassesStu" style="margin: 0 13px;" class="layui-btn">注
						册
					</a>
				</div>
			</div>
		</form>
	</div>
</div>
<script type="text/javascript">
	layui.use(['form', 'layedit'], function () {
		var form = layui.form
				, layer = layui.layer
				, layedit = layui.layedit
				, laydate = layui.laydate;
		form.render();
		
		//自定义验证规则
		form.verify({
			pass: [
				/^[\S]{6,12}$/
				, '密码必须6到12位，且不能出现空格'
			]
		});
		
		//表单取值
		layui.$('#LAY-component-form-getval').on('click', function () {
			var data = form.val('example');
			alert(JSON.stringify(data));
		});
	});
</script>
</body>
</html>