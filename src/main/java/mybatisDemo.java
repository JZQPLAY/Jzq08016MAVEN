import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/1/1 17:44
 * @description
 * mybatis快速入门
 */
public class mybatisDemo
{
	public static void main(String[] args) throws IOException
	{
		//加载mybatis核心配置文件，获取SqlSessionFactory对象，代码从官网上复制即可，将xml文件名换成自己的
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//获取sqlsession对象，用它来执行sql语句
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//3.执行sql语句（每种SQL语句都有其独特的方法来执行），括号内为sql语句的唯一标识
		List<mysql> m = sqlSession.selectList("mysqlMapper.selectAll");//selectList:查询所有
		System.out.println(m);
		//4.释放资源
		sqlSession.close();
	}
}
