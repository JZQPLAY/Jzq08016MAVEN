package aop;

import mybatis.service.accountserviceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Jzq
 * @date 2023/2/17 12:02
 * @description
 */
public class aopdemo
{
	public static void main(String[] args)
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(aopspringconfig.class);
		Aop bean = ac.getBean(Aop.class);//使用aop时，代理类为接口，而非实现类
		bean.save1(79);
		// int save = bean.save(77);
	}
}
