package com.jzq.springbootjzq.expection;

/**
 * @author Jzq
 * @date 2023/7/24 21:42
 * @description
 */
public class BusinessExpection extends RuntimeException
{
	private Integer code;//状态码
	
	public Integer getCode()
	{
		return code;
	}
	
	public void setCode(Integer code)
	{
		this.code = code;
	}
	
	public BusinessExpection(Integer code,String message,Throwable cause)
	{
		super(message,cause);
		this.code = code;
	}
	
	public BusinessExpection(Integer code,String message)
	{
		super(message);
		this.code = code;
	}
}
