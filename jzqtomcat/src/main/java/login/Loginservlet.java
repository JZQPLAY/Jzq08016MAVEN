package login;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		//接收用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//获取复选框数据
		String remember = request.getParameter("remember");
		//创建LoginService的对象，调用其login方法以执行select方法查询
		LoginService ls=new LoginService();
		demo1 d1 = ls.login(username,password);
		if(d1!=null)
		{
			//登录成功，跳转到账户的页面，没有共享数据，可使用重定向
			//判断用户是否勾选记住密码
			if("1".equals(remember))
			{
				//勾选了，发送Cookie
				//1.创建对应cookie
				Cookie c=new Cookie("username",username);
				Cookie c1=new Cookie("password",password);
				//设置cookie存活时间
				c.setMaxAge(60*60*24*7);
				c1.setMaxAge(60*60*24*7);
				//2.发送
				response.addCookie(c);
				response.addCookie(c1);
				
			}
			//将登录成功后的demo1对象存到session
			HttpSession session = request.getSession();
			session.setAttribute("demo1",session);
			response.sendRedirect("https://www.msn.cn/zh-cn/play?ocid=cgtopsites&pc=U531&cvid=24c2412728354df3ac0ccdb8ff8aa80c");
		}
		else
		{
			//登录失败,跳转回登录页面
			//存储错误信息到request
			request.setAttribute("login","用户名或密码错误");
			//跳转到login1.jsp
			request.getRequestDispatcher("/login1.jsp").forward(request,response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
