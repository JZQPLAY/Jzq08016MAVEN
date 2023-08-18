import factory.OrderDaostaticFactory;
import factory.OrderFactory;
import factory.dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jzq
 * @date 2023/2/11 17:17
 * @description 实例化bean
 */
public class AppBean2
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		dao jzq = (dao)ctx.getBean("jzqbean");//这里强转的类型是接口，而不是工厂类
		jzq.save();
	}
}