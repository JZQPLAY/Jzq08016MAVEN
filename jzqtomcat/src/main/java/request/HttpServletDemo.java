package request;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author Jzq
 * @date 2023/1/17 17:32
 * @description
 */
//urlpattern:一个servlet可以配置多个访问路径
@WebServlet(urlPatterns = {"/demo3","/demo2"})
public class HttpServletDemo extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException
	{
		//使用request对象，获取请求数据
		//1.获取请求方式
		String method = request.getMethod();
		System.out.println(method);
		//2.获取虚拟目录（访问路径）
		String c = request.getContextPath();
		System.out.println(c);
		//3.获取url
		StringBuffer s = request.getRequestURL();
		System.out.println(s);
		//4.获取uri
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		//5.获取请求参数
		String queryString = request.getQueryString();
		System.out.println(queryString);
		//6.获取请求头:user-agent:获取浏览器版本信息
		String header = request.getHeader("user-agent");
		System.out.println(header);
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		//解决中文乱码
		request.setCharacterEncoding("UTF-8");
		//7.获取请求体:get没有请求体,在post中演示
		//采用字符流读取数据
		doGet(request,response);
	}
}