package denglu.web;

import com.alibaba.fastjson.JSON;
import denglu.Pagebean;
import denglu.service.impl.wanghuangServiceimpl;
import denglu.wanghuang;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/8/2 21:48
 * @description
 */
@WebServlet("/wanghuang/*")
public class wanghuangServlet extends baseServlet
{
	wanghuangServiceimpl wanghuangService = new wanghuangServiceimpl();
	
	public void selectAll(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		List<wanghuang> wanghuangs = wanghuangService.selectAll();
		String s = JSON.toJSONString(wanghuangs);
		resp.setContentType("text/json;charset=utf-8");
		resp.getWriter().write(s);
	}
	
	public void add(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		BufferedReader reader = req.getReader();
		String s = reader.readLine();
		wanghuang wanghuang = JSON.parseObject(s,wanghuang.class);
		wanghuangService.add(wanghuang);
		resp.getWriter().write("success");
	}
	
	public void deletebyids(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		BufferedReader reader = req.getReader();
		String s = reader.readLine();
		int[] ints = JSON.parseObject(s,int[].class);//将json数据转化为int数组
		wanghuangService.deleteByids(ints);
		resp.getWriter().write("success");
	}
	
	public void selectbypage(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		String currentPage = req.getParameter("currentPage");
		String pagesize = req.getParameter("PageSize");
		int i = Integer.parseInt(currentPage);
		int i1 = Integer.parseInt(pagesize);
		Pagebean<wanghuang> selectbypage = wanghuangService.selectbypage(i,i1);
		String s = JSON.toJSONString(selectbypage);
		resp.setContentType("text/json;charset=utf-8");
		resp.getWriter().write(s);
	}
	
	public void selectbypageandcondition(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		BufferedReader reader = req.getReader();
		String s = reader.readLine();
		wanghuang wanghuang = JSON.parseObject(s,wanghuang.class);
		String currentPage = req.getParameter("currentPage");
		String pagesize = req.getParameter("PageSize");
		int i = Integer.parseInt(currentPage);
		int i1 = Integer.parseInt(pagesize);
		Pagebean<wanghuang> selectbypage = wanghuangService.selectbypageandcondition(i,i1,wanghuang);
		String s1 = JSON.toJSONString(selectbypage);
		resp.setContentType("text/json;charset=utf-8");
		resp.getWriter().write(s1);
	}
}