import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		//1.接收用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//2.调用mybatis完成查询
		//2.1:获取sqlsessionfactory对象
		SqlSessionFactory sqlSessionFactory = SqlsessionFactory.getSqlsessionfactory();//调用静态工具类中的静态方法
		//2.2获取sqlsession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//2.3获取mapper
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		//2.4调用方法
		demo1 select = mapper.select(username,password);
		//2.5释放资源
		sqlSession.close();
		//使用响应对象响应数据:获取字符输出流，并设置content type
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		//3.判断mapper是否为null
		if(select != null)
		{
			writer.write("登录成功");
		}
		else
		{
			writer.write("登录失败");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
