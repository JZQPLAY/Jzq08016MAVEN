package springMVC.ssm.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jzq
 * @date 2023/7/28 11:38
 * @description
 */
@Component
public class projectintercpetor implements HandlerInterceptor
{
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception
	{
		String header = request.getHeader("Content-Type");
		HandlerMethod handler1 = (HandlerMethod)handler;//handler封装了要拦截的方法
		System.out.println(handler1);
		System.out.println(header);
		return true;//使用true和fasle来控制方法是否放行
	}
	
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView) throws Exception
	{
		HandlerInterceptor.super.postHandle(request,response,handler,modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception
	{
		HandlerInterceptor.super.afterCompletion(request,response,handler,ex);
	}
}