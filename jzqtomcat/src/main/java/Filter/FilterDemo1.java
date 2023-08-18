package Filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录验证过滤器
 */
@WebFilter("/HTMLPractice.html")
public class FilterDemo1 implements Filter
{
	@Override
	public void init(FilterConfig config) throws ServletException
	{
	}
	
	@Override
	public void destroy()
	{
	}
	
	@Override
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws ServletException, IOException
	{
		//判断session中有没有user对象,需先把形参强转为http类型
		HttpServletRequest request1 = (HttpServletRequest)request;
		//获取session
		HttpSession session = request1.getSession();
		Object demo1 = session.getAttribute("demo1");
		//判断user是否为null
		String[] url = {"/Loginservlet","/login1.jsp","/registerLogin.jsp","/registerservlet"};
		String s1 = request1.getRequestURL().toString();
		for(String s :url)
		{
			if(s1.contains(s))
			{
				//是登录信息，放行
				chain.doFilter(request,response);
				return;
			}
		}
		{
			if(demo1 != null)
			{
				//登录过了，放行
				chain.doFilter(request,response);
			}
			else
			{
				//没有登录,跳转到登录页面
				request1.setAttribute("login_msg","您尚未登录!");
				request1.getRequestDispatcher("/login1.jsp").forward(request1,response);
			}
		}
	}
}
