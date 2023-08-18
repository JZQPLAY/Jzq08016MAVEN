package mybatis;

import mybatis.service.accountserviceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/2/15 11:20
 * @description
 */
public class demo
{
	public static void main(String[] args)
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(springconfig.class);
		accountserviceimpl bean = ac.getBean(accountserviceimpl.class);
		List<demo1> select = bean.select();
		System.out.println(select);
	}
}
