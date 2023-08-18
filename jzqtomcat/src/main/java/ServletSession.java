import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 服务端会话跟踪技术：将数据保存到服务端，session安全，session无大小限制，默认存储时长30分钟
 * 钝化：服务器正常关闭后，tomcat会自动将session写入硬盘的文件中
 * 活化：再次启动服务器后，从文件中加载数据到session中
 */
@WebServlet("/ServletSession")
public class ServletSession extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		//获取到session对象
		HttpSession session = request.getSession();
		//存储数据
		session.setAttribute("username","jzq");
		//获取数据
		HttpSession session1 = request.getSession();
		Object at = session1.getAttribute("username");//根据键获取值
		System.out.println(at);
		session1.removeAttribute("username");//根据键，删除此键值对
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}