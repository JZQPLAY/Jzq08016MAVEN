<%--
  Created by IntelliJ IDEA.
  User: Gp
  Date: 2023/1/26
  Time: 10:23
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>登录</title>
</head>
<body>
<form action="/jzqtomcat_war/Loginservlet" method="post" id="form">
	<h1 id="login_msg">LOGIN IN</h1>
	<h1>${login_msg}</h1>
	<div id="errormsg">${login}${register}</div>
	<p>username:<input id="username" name="username" value="${cookie.username.value}" type="text"></p>
	<p>password:<input id="password" name="password" value="${cookie.password.value}" type="password"></p>
	<p>remember:<<input id="remember" name="remember" value="1" type="checkbox"></p>
	<div id="subDiv">
		<input type="submit" class="button" value="login up">
		<input type="reset" class="button" value="reset">
		<a href="registerLogin.jsp">没有账号？点击注册</a>
	</div>
</form>
</body>
</html>