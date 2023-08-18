import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;
//cookie:客户端会话技术，将数据保存到客户端，以后每次请求都携带cookie数据进行访问，cookie不安全，最大3k，可以长期存储
//cookie存活时间：默认情况：当浏览器关闭时，cookie被销毁，
// 可以使用setMaxAge以控制其存活时间：1.正数：将cookie写入浏览器所在电脑的硬盘，到时间自动删除2.负数：为默认情况3.零：删除对应cookie
//存储中文:tomcat10以上可以
@WebServlet("/ServletCookie")
public class ServletCookie extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		//发送cookie:
		//基本使用:1.创建cookie对象
		Cookie cookie = new Cookie("movie","THEWARRIORS");
		//2.使用response发送到客户端
		response.addCookie(cookie);
		//获取cookie:1.使用request获取cookie数组
		Cookie[] cookies = request.getCookies();
		//2.遍历数组
		for(Cookie c : cookies)
		{
			//3.获取数据
			String name = c.getName();//获取键
			String value = c.getValue();//获取值
			//获取时会把所有cookie获取出来，可以加判断以获取对应cookie
			if("movie".equals(name))
			{
				System.out.println(name + ":" + value);
			}
		}
		//存储中文：
		String name="贾志强";
		//url编码：
		String encode = URLEncoder.encode(name,"utf-8");
		System.out.println(encode);
		Cookie c1=new Cookie("chinese",name);
		response.addCookie(c1);
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}