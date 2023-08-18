import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.sql.DataSource;

/**
 * @author Jzq
 * @date 2023/2/13 20:25
 * @description
 * 管理druiddatasource对象
 */
public class AppPractice
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource d= (DataSource)ctx.getBean("datasource");
		System.out.println(d);
		DataSource bean = (DataSource)ctx.getBean("cps");
		System.out.println(bean);
	}
}