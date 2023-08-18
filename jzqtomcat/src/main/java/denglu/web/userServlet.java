package denglu.web;

import com.alibaba.fastjson.JSON;
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
 * @date 2023/8/2 22:05
 * @description
 */
@WebServlet("/user/*")
public class userServlet extends baseServlet
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
}
