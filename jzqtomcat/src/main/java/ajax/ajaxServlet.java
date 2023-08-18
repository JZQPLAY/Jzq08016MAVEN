package ajax;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
//ajax:替代jsp的工具
@WebServlet("/ajaxServlet")
public class ajaxServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
        //响应数据
        // response.getWriter().write("hello ajax");
		//axios:
		//1.接收请求参数：
		String username = request.getParameter("username");
		System.out.println(username);
		//2.响应数据
		response.getWriter().write("hello axios");
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}