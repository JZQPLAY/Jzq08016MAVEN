package request;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author Jzq
 * @date 2023/1/16 21:44
 * @description
 */
@WebServlet(value = "/demo1",loadOnStartup = 1)
public class ServletDemo implements Servlet
{
	private ServletConfig config;
	@Override
	/**
	 * 初始化方法
	 * 1.调用时机：默认情况下servlet被第一次访问时调用
	 * loadOnStartup:默认为1，设置为正整数时，在开启服务器时即调用
	 * 2.调用次数：1次
	 */
	public void init(ServletConfig config) throws ServletException
	{
		this.config=config;
		System.out.println("调用");
	}
	
	@Override
	public ServletConfig getServletConfig()
	{
		return config;
	}
	
	/**
	 * 提供服务：
	 * 1.调用时机：每次servlet被访问时调用
	 * 2.调用次数：多次
	 * @param servletRequest
	 * @param servletResponse
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	public void service(ServletRequest servletRequest,ServletResponse servletResponse) throws ServletException, IOException
	{
		System.out.println("hello jzq");
	}
	
	@Override
	public String getServletInfo()
	{
		return null;
	}
	
	/**
	 * 销毁方法
	 * 1.调用时机：内存释放或者服务器关闭的时候，调用
	 * 2.调用次数：1次
	 */
	@Override
	public void destroy()
	{
		System.out.println("销毁");
	}
}
