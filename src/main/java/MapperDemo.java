import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/1/1 18:32
 * @description mapper代理开发
 * 1.定义与sql映射文件同名的Mapper接口，并且将其和sql映射文件放置在同一目录下
 * 2.设置sql映射文件的namespace属性为Mapper接口全名
 * 3.在Mapper中定义方法，方法名就是sql映射文件中sql语句的id，并保持参数类型和返回值类型一致(需要根据查询的结果来选择参数类型，如查询语句为查询多条，此时需将参数类型包装为集合）
 * 4.注意:在改了映射文件的路径后，需将配置文件里的映射文件地址修改
 * 5.通过sqlsession的getMapper方法获取Mapper接口的代理对象，然后调用对应方法完成sql的执行
 */
public class MapperDemo
{
	public static void main(String[] args) throws IOException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//使用代理开发的方式执行sql语句
		//1.获取mysqlMapper接口的代理对象
		mysqlMapper mapper = sqlSession.getMapper(mysqlMapper.class);
		List<mysql> mysqls = mapper.selectAll();
		System.out.println(mysqls);
		sqlSession.close();
	}
}
