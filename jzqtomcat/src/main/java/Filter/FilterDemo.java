package Filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @author Jzq
 * @date 2023/1/29 16:55
 * @description Filter:过滤器
 * 1.定义类，实现接口
 * 2.配置拦截路径
 * 3.配置放行
 * 放行后访问资源，访问完成后会回到filter中，并执行放行后的逻辑
 * 一般在放行前对request数据进行处理，放行后对response数据进行处理
 */
@WebFilter("/HTMLPractice.html")
public class FilterDemo implements Filter
{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		Filter.super.init(filterConfig);
	}
	
	@Override
	public void doFilter(ServletRequest servletRequest,ServletResponse servletResponse,FilterChain filterChain) throws IOException, ServletException
	{
		System.out.println("Filter被执行");
		//放行
		filterChain.doFilter(servletRequest,servletResponse);
		System.out.println("Filter被放行");
	}
	
	@Override
	public void destroy()
	{
		Filter.super.destroy();
	}
}
