<%--
  Created by IntelliJ IDEA.
  User: Gp
  Date: 2023/1/22
  Time: 15:46
  JSP:java服务端页面，相当于java+html
  JSP中既可以写java代码，又可以写html标签，输出的数据都会分别输出在控制台和浏览器
  JSP本质是一个servlet
  jsp脚本：用于在jsp页面内定义java代码
  el表达式：用于简化jsp页面内的java代码
  jstl标签：1.ciif:完成逻辑判断，替换if else代码 2.foreach:代替for
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<h1>hello world</h1>
<!--第一种脚本：内容放在_jspService方法中-->
<%
	System.out.println("hello jsp1");
%>
<!--第二种脚本：放到out.print()中，作为其参数，输出在浏览器中-->
<%="hello jsp2"%>
<!--第三种脚本：内容放到——jspService方法之外，被类直接包含-->
<%!
	void show(){};
	String name="jzq";
%>
<!--el表达式：获取-->
${demo1}
<c:if test="true"><!--test后跟判断语句-->
	<h1>结果为true</h1>
</c:if>
<c:if test="${status ==1}">
	正确
</c:if>
<c:forEach items="${demo1}" var="demo2"><!--items后跟遍历的对象，var后跟获取遍历对象所要用的变量-->
<tr align="center">
	<td>${demo2.id}</td><!--获取对象变量的方法本质是调用对象类的get方法-->
	<td>${demo2.username}</td>
	<td>${demo2.password}</td>
</tr>
</c:forEach>
<c:forEach begin="0" end="10" step="1" var="i">
	${i}
</c:forEach>
<%
	System.out.println("hello jsp2");
%>
</body>
</html>
