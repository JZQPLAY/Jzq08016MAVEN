package request;

import denglu.wanghuang;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/demo0")
public class autoServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		List<wanghuang> wanghuangs=new ArrayList<>();
		wanghuangs.add(new wanghuang(6,"rain","bow","nv","ll","666"));
		request.setAttribute("wanghuangs",wanghuangs);
		request.getRequestDispatcher("/select.jsp").forward(request,response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
