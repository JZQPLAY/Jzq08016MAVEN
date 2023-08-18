import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;
import service.Impl.BookServiceImpl;

/**
 * @author Jzq
 * @date 2023/2/3 15:48
 * @description bean的生命周期：
 * 一：初始化容器
 * 1.创建对象
 * 2.执行构造方法
 * 3.执行属性注入
 * 4.执行bean初始化方法
 * 二：使用bean
 * 1.执行业务操作
 * 三：关闭/销毁容器
 * 1.执行bean销毁方法
 */
public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext qzj=new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao o = (BookDao)qzj.getBean("jzqdao");
		o.save();
		qzj.close();
	}
}