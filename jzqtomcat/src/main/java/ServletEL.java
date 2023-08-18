import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ServletEL")
public class ServletEL extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
        List<demo1> demo1=new ArrayList<>();
        demo1.add(new demo1(1,"2","3"));
		demo1.add(new demo1(2,"3","4"));
		demo1.add(new demo1(3,"4","5"));
		//将数据存储到request域中
		request.setAttribute("demo1",demo1);
		request.setAttribute("status",1);
		//转发到jsp文件中
		request.getRequestDispatcher("JSP.jsp").forward(request,response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
