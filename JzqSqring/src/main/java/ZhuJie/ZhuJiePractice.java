package ZhuJie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jzq
 * @date 2023/2/14 11:52
 * @description
 */
public class ZhuJiePractice
{
	public static void main(String[] args)
	{
		ApplicationContext qzj=new ClassPathXmlApplicationContext("applicationContext.xml");
		zhuJie zhujie = (zhuJie)qzj.getBean("zhujie");
		zhujie.save();
	}
}
