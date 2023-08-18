package ZhuJie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.sql.DataSource;

/**
 * @author Jzq
 * @date 2023/2/14 20:06
 * @description
 */
public class disanfangdemo
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		DataSource datasource = ctx.getBean(DataSource.class);
		System.out.println(datasource);
	}
}
