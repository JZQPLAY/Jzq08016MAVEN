package response;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/jzq1")
public class Servletdemo3 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
        System.out.println("response jzq1");
		//重定向：将数据操作转给另一个类
		//特点：浏览器地址栏位置发生变化，
		// 可以重定向到任意位置的资源（服务器内部，外部均可），
		//两次请求，不能在多个资源间共享数据
		//设置响应状态码
		// response.setStatus(302);
		// 设置响应头:为键值形式，前为名称，后为重定向的资源虚拟目录，目录只需将WebServlet中的路径去掉杠后加入即可
		// response.setHeader("Location","jzq2");
		//简化操作
		//动态获取虚拟目录：
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath+"/jzq2");//虚拟目录：浏览器使用需要加，服务端使用不需要加
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
