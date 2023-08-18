package service.Impl;

import dao.BookDao;
import dao.Impl.BookDaoImpl;
import factory.dao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import service.BookService;

/**
 * @author Jzq
 * @date 2023/2/3 15:40
 * @description
 * 依赖注入：
 * 自己开发的模块推荐使用setter注入
 * spring框架推荐使用构造器
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean
{
	private BookDao bd;
	private dao da;
	private BookDao password;
	//构造器注入
	public BookServiceImpl(BookDao password)
	{
		this.password = password;
	}
	@Override
	public void save()
	{
		System.out.println("耍");
		bd.save();
		da.save();
		password.save();
	}
	//提供对应set方法
	public void setbd(BookDao bd)
	{
		this.bd = bd;
	}
	//setter注入
	public void setda(dao da)
	{
		this.da = da;
	}
	@Override
	public void destroy() throws Exception
	{
		System.out.println("销毁");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception//当属性设置完后，才执行这个方法
	{
		System.out.println("初始化");
	}
}
