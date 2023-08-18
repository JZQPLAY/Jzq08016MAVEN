package com.jzq.springbootjzq.controller;

import com.jzq.springbootjzq.expection.BusinessExpection;
import com.jzq.springbootjzq.expection.SystemExpection;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/**
 * @author Jzq
 * @date 2023/7/24 20:45
 * @description
 */
@RestControllerAdvice
public class ProjectExpectionAdvice
{
	//系统层异常
	@ExceptionHandler(SystemExpection.class)//括号内写要拦截异常的种类
	public result doSystemExpection(SystemExpection e)
	{
		//记录日志，发送消息给运维，发送邮件给开发人员
		return new result(e.getCode(),null,e.getMessage());
	}
	
	//业务层异常
	@ExceptionHandler(BusinessExpection.class)//括号内写要拦截异常的种类
	public result doExpection(BusinessExpection e)
	{
		//记录日志，发送消息给运维，发送邮件给开发人员
		return new result(e.getCode(),null,e.getMessage());
	}
	
	//其他异常
	@ExceptionHandler(Exception.class)//括号内写要拦截异常的种类
	public result doExpection(Exception e)
	{
		//记录日志，发送消息给运维，发送邮件给开发人员
		return new result(code.SYSTEM_UNKNOWN_ERR,null,"系统繁忙，请稍后再试");
	}
}