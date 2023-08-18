import com.sun.tools.javac.Main;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jzq
 * @date 2023/1/7 16:35
 * @description
 */
public class PracticeZhuJie
{
	public static void main(String[] args) throws IOException
	{
		//使用注解完成增删改查:注解完成简单功能，xml完成复杂功能
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		XueshengSpecfics mapper = sqlSession.getMapper(XueshengSpecfics.class);
		mapper.update2("cs");
		sqlSession.close();
	}
}
