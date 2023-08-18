<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="login.SqlsessionFactory" %>
<%@ page import="request.autoServlet" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="Mapper.UserMapper1" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Jzq
  Date: 2023/7/16
  Time: 9:39
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<html>
<head>
	<meta charset="UTF-8">
	<title>网黄</title>
</head>
<body>
<input type="button" value="新增" id="insert"><br>
<hr>
<table border="1" cellpadding="0" width="800">
	<tr>
		<td>序号</td>
		<td>姓名</td>
		<td>英文名</td>
		<td>性别</td>
		<td>平台</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${wanghuang}" var="wanghuangs" varStatus="status">
		<tr align="center">
			<td>${status.count}</td>
			<td>${wanghuangs.name}</td>
			<td>${wanghuangs.password}</td>
			<td>${wanghuangs.sex}</td>
			<td>${wanghuangs.region}</td>
			<c:if test="${status.count%2==0}">
				<td>启用</td>
			</c:if>
			<c:if test="${status.count%2!=0}">
				<td>禁用</td>
			</c:if>
			<td><a href="/jzqtomcat_war/selectByIdServlet?id=${wanghuangs.id}">修改</a> <a href="#">删除</a></td>
		</tr>
	</c:forEach>
</table>
<script>
	document.getElementById("insert").onclick = function()
	{
		location.href = "/jzqtomcat_war/dengluweb/insertperson.jsp";
	}
</script>
</body>
</html>
