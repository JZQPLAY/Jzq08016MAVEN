<%--
  Created by IntelliJ IDEA.
  User: Jzq
  Date: 2023/7/17
  Time: 17:29
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
	<title>修改博主</title>
</head>
<body>
<h4>请修改</h4>
<form action="/jzqtomcat_war/updateServlet" method="post">
	<!--使用隐藏域提交id-->
	<input type="hidden" name="id" value="${bozhu.id}">
	姓名：<input name="name" value="${bozhu.name}"><br>
	密码：<input name="password" value="${bozhu.password}"><br>
	性别：<input name="sex" value="${bozhu.sex}"><br>
	平台：<input name="region" value="${bozhu.region}"><br>
	<input type="submit" value="提交">
</form>
</body>
</html>
