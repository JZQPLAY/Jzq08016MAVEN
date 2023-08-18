<!--
@Author: Jzq
@Date: 2023/1/22 14:09
-->
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>欢迎注册</title>
</head>
<body>
<div class="form-div">
	<div class="reg-content">
		<span>已有账号？</span><a href="login1.jsp" method="get"></a>
	</div>
	<form id="reg_form" action="/jzqtomcat_war/registerservlet" method="get">
		<table>
			<tr>
				<td>用户名</td>
				<td class="inputs">
					<input name="username" type="text" id="username">
					<br>
					<span id="username_err" class="err_msg">${register}</span>
				</td>
			</tr>
			<tr>
				<td>密码</td>
				<td class="inputs">
					<input name="password" type="password" id="password">
					<br>
					<span id="password_err" class="err_msg" style="...">${register}</span>
				</td>
			</tr>
		</table>
		<div class="buttons">
			<input value="注册" type="submit" id="reg_btn">
		</div>
		<br class="clear">
	</form>
</div>
</body>
</html>