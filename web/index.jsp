<%--
  Created by IntelliJ IDEA.
  User: 11322
  Date: 2020/9/7
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>index</title>
	<link rel="stylesheet" href="static/layui/css/layui.css"/>
	<script src="static/layui/layui.all.js"></script>
	<style>
		
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
	</style>
</head>
<body>
<div class="wrap">
	<div style="margin:30px auto 0;width: 450px;border: 1px solid #c6c6c6;padding: 10px 0 0;background: white;">
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
			<legend>登陆</legend>
		</fieldset>
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
				<label class="layui-form-label">选择身份</label>
				<div class="layui-input-block">
					<input style="width: 100%;" type="radio" name="user" value="admins" title="管理员" checked="">
					<input style="width: 100%;" type="radio" name="user" value="students" title="学生">
					<input style="width: 100%;" type="radio" name="user" value="teacher" title="老师">
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button type="submit" class="layui-btn" lay-submit="">立即提交</button>
					<a class="layui-btn" href="RegisterServlet?method=getAllClassesStu">注 册</a>
				</div>
			</div>
		</form>
	</div>
</div>
<script>
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
	});
</script>
</body>
</html>
