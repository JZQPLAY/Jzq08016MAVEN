package aop.data;

import aop.Aop;
import aop.aopspringconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Jzq
 * @date 2023/7/7 19:47
 * @description
 */
public class demo
{
	public static void main(String[] args)
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(aopspringconfig.class);
		datadao bean = ac.getBean(datadao.class);
		System.out.println(bean.pipei("root "));
	}
}
