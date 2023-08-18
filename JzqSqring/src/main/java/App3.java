import factory.dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import javax.sql.DataSource;

/**
 * @author Jzq
 * @date 2023/2/14 11:09
 * @description
 * 容器
 */
public class App3
{
	public static void main(String[] args)
	{
		//1.加载类路径下的配置文件
		ApplicationContext ctx0=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从文件系统下加载配置文件
		ApplicationContext ctx=new FileSystemXmlApplicationContext("D:\\WorkSpace\\idea\\2021.3\\Jzq08016MAVEN\\JzqSqring\\src\\main\\resources\\applicationContext.xml");
		//获取bean的三种方式：
		//1.强转
		DataSource ds = (DataSource)ctx.getBean("datasource");
		//声明接口的字节码
		dao jzqbean = ctx.getBean("jzqbean",dao.class);
		//3.直接按类型
		DataSource bean = ctx.getBean(DataSource.class);
	}
}
