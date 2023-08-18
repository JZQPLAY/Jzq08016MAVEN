package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/registerservlet")
public class registerServlet extends HttpServlet
{
	private LoginService service=new LoginService();
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		//1.获取对应用户名和密码数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		demo1 d=new demo1();
		d.setUsername(username);
		d.setPassword(password);
		//2.调用对应service注册
		boolean register = service.register(d);
		if(register)
		{
			//成功跳转到登录界面
			request.setAttribute("register","注册成功，请登录");
			request.getRequestDispatcher("/login1.jsp").forward(request,response);
		}else
		{
			//注册失败，跳转回注册页面
			request.setAttribute("register","用户名已存在");
			request.getRequestDispatcher("/registerLogin.jsp").forward(request,response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
