package denglu.web;

import com.alibaba.fastjson.JSON;
import denglu.wanghuang;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Jzq
 * @date 2023/8/2 21:42
 * @description
 */
public class baseServlet extends HttpServlet
{
	//资源分发方法
	
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		String requestURI = req.getRequestURI();
		int index = requestURI.lastIndexOf("/");
		String methodname = requestURI.substring(index + 1);
		Class<? extends baseServlet> aClass = this.getClass();//this代表子类的方法:获取子类字节码对象
		try
		{
			Method method = aClass.getMethod(methodname,HttpServletRequest.class,HttpServletResponse.class);//获取方法对象
			method.invoke(this,req,resp);
		}
		catch(NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch(InvocationTargetException e)
		{
			e.printStackTrace();
		}
		catch(IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}
}
