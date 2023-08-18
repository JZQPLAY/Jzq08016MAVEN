package springMVC.ssm.controller;

/**
 * @author Jzq
 * @date 2023/7/24 19:32
 * @description 定义返回数据格式
 */
public class result
{
	private Object data;
	
	private Integer code;
	
	private String msg;
	
	public result(Integer code,Object data,String msg)
	{
		this.data = data;
		this.code = code;
		this.msg = msg;
	}
	
	public result(Integer code,Object data)
	{
		this.data = data;
		this.code = code;
	}
	
	public result()
	{
	}
	
	public Object getData()
	{
		return data;
	}
	
	public void setData(Object data)
	{
		this.data = data;
	}
	
	public Integer getCode()
	{
		return code;
	}
	
	public void setCode(Integer code)
	{
		this.code = code;
	}
	
	public String getMsg()
	{
		return msg;
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}
