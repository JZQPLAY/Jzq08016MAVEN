package Listener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebListener//监听器自动执行，所以不用加路径
public class ListenerDemo implements ServletContextListener
{
	public ListenerDemo()
	{
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		/* This method is called when the servlet context is initialized(when the Web application is deployed). */
        //加载资源
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		/* This method is called when the servlet Context is undeployed or Application Server shuts down. */
        //释放资源
	}
}
