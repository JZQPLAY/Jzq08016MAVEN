import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "registerServlet", value = "/registerServlet")
public class registerServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		//1.接收用户数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//封装用户对象
		demo1 d = new demo1();
		d.setUsername(username);
		d.setPassword(password);
		//2.调用mapper,根据用户名添加用户对象
		SqlSessionFactory sqlSessionFactory = SqlsessionFactory.getSqlsessionfactory();//调用静态工具类中的静态方法
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		//调用方法
		mapper.add(d);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
