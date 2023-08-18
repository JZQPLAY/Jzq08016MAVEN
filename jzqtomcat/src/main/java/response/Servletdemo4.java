package response;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.io.IOUtils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/jzq2")
public class Servletdemo4 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("response jzq2");
		//响应字符数据:设置字符数据响应体
		//1.获取字符输出流
		PrintWriter writer = response.getWriter();
		writer.write("贾志强");
		//可以输入html数据，使用content-type来声明
		response.setHeader("content-type","text/html");
		writer.write("<h1>贾志强</h1>");
		writer.close();
		//响应字节数据
		FileInputStream fileInputStream = new FileInputStream("D:\\WorkSpace\\idea\\2021.3\\Jzq08016MAVEN\\jzqtomcat\\src\\main\\java\\response\\ydzy.png");
		ServletOutputStream fileOutputStream=response.getOutputStream();
		IOUtils.copy(fileInputStream,fileOutputStream);
		fileInputStream.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
