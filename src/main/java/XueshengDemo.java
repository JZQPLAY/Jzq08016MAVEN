import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/1/2 17:35
 * @description 使用mybatis完成数据库操作：
 * 1.编写接口方法，方法的类型要和数据库中的一致
 * 2.编写sql语句
 * 3.使用Mapper接口代理对象执行方法，代理对象通过sqlsession调方法来获取
 * 查询所有
 */
public class XueshengDemo
{
	public static void main(String[] args) throws IOException
	{
		//1.加载核心配置文件
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//获取sqlsession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//3.获取Mapper接口代理对象
		Xuesheng mapper = sqlSession.getMapper(Xuesheng.class);
		//执行方法
		List<mysql> mysqls = mapper.selectAll();
		System.out.println(mysqls);
		//5.释放资源
		sqlSession.close();
	}
}
