import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jzq
 * @date 2023/2/11 17:01
 * @description
 * 1.使用构造方法实例化bean:在实现类中创建构造方法
 */
public class AppBean1
{
	//getbean相当于创建构造方法的对象，默认调用无参构造方法,可以调用私有构造方法
	public static void main(String[] args)
	{
		ApplicationContext qzj=new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao jqz = (BookDao)qzj.getBean("jqz");
		System.out.println("----------");
		jqz.save();
	}
}
