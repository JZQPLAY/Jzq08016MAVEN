import dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

/**
 * @author Jzq
 * @date 2023/2/12 20:05
 * @description
 */
public class App2
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext qzj=new ClassPathXmlApplicationContext("applicationContext.xml");
		qzj.registerShutdownHook();
		BookService o = (BookService)qzj.getBean("jzqService");
		o.save();
		// qzj.close();
	}
}
