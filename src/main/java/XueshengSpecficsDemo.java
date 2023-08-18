import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jzq
 * @date 2023/1/2 20:05
 * @description 条件查询
 */
public class XueshengSpecficsDemo
{
	public static void main(String[] args) throws IOException
	{
		// selectByID();
		selectByCondition();
		selectByConditionSingle();
	}
	//一个条件
	public static void selectByID() throws IOException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		XueshengSpecfics mapper = sqlSession.getMapper(XueshengSpecfics.class);
		int i=3;
		mysql mysql = mapper.selectByID(i);
		System.out.println(mysql);
	}
	//多个条件
	public static void selectByCondition() throws IOException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		XueshengSpecfics mapper = sqlSession.getMapper(XueshengSpecfics.class);
		String i="kf";
		String sex="女";
		int score=83;
		i="%"+i+"%";//like模糊操作要自行再处理一次
		//散装参数
		// List<mysql> m = mapper.selectByCondition(i,sex,score);
		//对象参数
		// mysql mysql= new mysql();//对象参数要保证sql中的参数名（占位符）和实体类属性名相同
		// mysql.setName(i);
		// mysql.setSex(sex);
		// mysql.setScore(score);
		// List<mysql> m = mapper.selectByCondition(mysql);
		//Map参数
		String name="kf";
		Map map = new HashMap();
		//键要和占位符的名称相同
		// map.put("name",name);
		map.put("sex",sex);
		// map.put("score",score);
		List<Map> m = mapper.selectByCondition(map);
		System.out.println(m);
	}
	//单条件动态查询
	public static void selectByConditionSingle() throws IOException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		XueshengSpecfics mapper = sqlSession.getMapper(XueshengSpecfics.class);
		String i="kf";
		String sex="女";
		int score=83;
		Map m=new HashMap<>();
		// m.put("sex",sex);
		List<Map> maps = mapper.selectByConditionSingle(m);
		System.out.println(maps);
		sqlSession.close();
	}
}
