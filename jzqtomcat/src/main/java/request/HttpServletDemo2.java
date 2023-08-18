package request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Jzq
 * @date 2023/1/18 18:21
 * @description 通用方式获取请求参数
 */
@WebServlet("/demo4")
public class HttpServletDemo2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("demo4操作");
		//1.获取所有参数的map集合
		Map<String,String[]> parameterMap = req.getParameterMap();
		for(String key : parameterMap.keySet())
		{
			System.out.print(key + ":");
			//2.获取值
			String[] strings = parameterMap.get(key);
			for(String value : strings)
			{
				System.out.print(value + " ");
			}
			System.out.println();
		}
		//2.根据key获取参数值，数组
		String[] hobbies = req.getParameterValues("hobby");
		for(String hobby:hobbies)
		{
			System.out.println(hobby);
		}
		//3.获取单个参数值
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		// 请求转发：特点：1.浏览器地址栏路径不发生变化2.只能转发到当前服务器的内部资源3.一次请求，可以在转发的资源间使用request共享数据
		// ------------------------------------------------
		req.setAttribute("username",username);//可以用键值的方式对req对象存入值，在转发的类中可以获取值
		req.getRequestDispatcher("/demo5").forward(req,resp);//当执行完本类的操作，会跳转到demo5所在的类进行操作,可以使用remove来删除键值对
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("post");
		doGet(req,resp);//因为post和get的请求参数代码一样，可以直接调用方法来使用
	}
}