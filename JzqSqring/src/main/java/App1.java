import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

/**
 * @author Jzq
 * @date 2023/2/3 15:55
 * @description
 * ioc:控制反转：使用对象时，由主动创建对象变为外部提供对象，spring提供ioc容器以充当”外部"，ioc容器负责对象的创建，初始化等一系列工作，被创建或管理的对象统称为bean
 * 创建spring：
 *         1.导入spring坐标
 *         2.配置实现类为bean(id为起别名，class表示给bean定义类型
 *         3.获取ioc容器
 *         4.获取bean
 */
public class App1
{
	public static void main(String[] args)
	{
		//获取ioc容器,并把配置文件名作为参数传进去
		ApplicationContext qzj=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("----------");
		//获取bean:将别名输入到括号里,并将类型强转为对应接口的类型
		//getbean相当于创建构造方法的对象，默认调用无参构造方法,可以调用私有构造方法
		BookDao jzqdao = (BookDao)qzj.getBean("jqz");//数据层
		System.out.println("-------");
		//创建bean时调的是无参构造方法,不会调有参的
		BookDao jzqdao1 = (BookDao)qzj.getBean("jqz");
		System.out.println("-------");
		jzqdao.save();
		System.out.println("------");
		jzqdao1.save();
		System.out.println("-------");
		BookService jzqService = (BookService)qzj.getBean("jzqService");//业务层
		jzqService.save();
		System.out.println("--------");
	}
}