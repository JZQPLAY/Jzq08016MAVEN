package ZhuJie;

import factory.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Jzq
 * @date 2023/2/14 11:44
 * @description
 * 注解开发
 * 1.Component:相当于配置一个bean
 * 2.在xml中使用context找注解
 */
@Component("zhujie")
@Scope
public class ZhuJieDemo implements zhuJie
{
	//引用类型自动装配
	@Autowired//使用注解实现自动装配,无需添加set方法
	@Qualifier("zhujiedao")
	private zhujiedao zd;
	//简单类型自动装配
	@Override
	public void save()
	{
		System.out.println("观");
		zd.save();
	}
	@PostConstruct//使用注解定义初始方法
	public void chushihua()
	{
		System.out.println("开");
	}
	@PreDestroy//使用注解定义销毁方法
	public void xiaohui()
	{
		System.out.println("关");
	}
}
