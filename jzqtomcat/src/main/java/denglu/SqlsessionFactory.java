package denglu;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jzq
 * @date 2023/1/22 15:15
 * @description SqlSessionFactory工具类抽取
 */
public class SqlsessionFactory
{
	private static SqlSessionFactory sqlsessionFactory;
	//创建一个静态代码块
	static {
		//静态代码块会随着类的加载而自动执行，且只执行一次
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try
		{
			inputStream = Resources.getResourceAsStream(resource);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		 sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	public static SqlSessionFactory getSqlsessionfactory()
	{
	     return sqlsessionFactory;
	}
}
