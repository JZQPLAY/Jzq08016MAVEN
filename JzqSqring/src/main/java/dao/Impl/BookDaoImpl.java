package dao.Impl;

import dao.BookDao;
import service.BookService;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/2/3 15:39
 * @description
 */
public class BookDaoImpl implements BookDao
{
	private List<String> list;
	private String name;
	private int age;
	private int password;
	
	public BookDaoImpl(int password)
	{
		this.password = password;
	}
	
	public void setList(List<String> list)
	{
		this.list = list;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public void save()
	{
		System.out.println("玩"+name+age+","+password);
		System.out.println(list);
	}
	public void init()//表示bean初始化对应的操作
	{
		System.out.println("init");
	}
	public void destory()//表示bean销毁对应的操作
	{
		System.out.println("destory");
	}
}
