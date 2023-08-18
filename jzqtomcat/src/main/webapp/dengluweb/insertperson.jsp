<%--
  Created by IntelliJ IDEA.
  User: Jzq
  Date: 2023/7/17
  Time: 16:25
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>添加博主</title>
</head>
<body>
<h4>请添加</h4>
<form action="/jzqtomcat_war/insertServlet" method="post">
	姓名：<input name="name"><br>
	密码：<input name="password"><br>
	性别：<input name="sex"><br>
	平台：<input name="region"><br>
	<input type="submit" value="提交">
</form>
</body>
</html>
