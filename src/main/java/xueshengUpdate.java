import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Jzq
 * @date 2023/1/5 20:04
 * @description 添加，更新和删除
 */
public class xueshengUpdate
{
	public static void main(String[] args) throws IOException, ParseException
	{
		// add();//添加
		Update();//修改
		delete();
	}
	
	public static void add() throws IOException, ParseException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		XueshengSpecfics mapper = sqlSession.getMapper(XueshengSpecfics.class);
		int id = 16;
		String name = "zjc";
		int age = 37;
		String sex = "女";
		String hobby = "wk";
		int idcard = 16;
		int score = 93;
		mysql m = new mysql();
		// m.setId(id);
		m.setName(name);
		m.setSex(sex);
		m.setHobby(hobby);
		m.setAge(age);
		m.setIdcard(idcard);
		m.setScore(score);
		mapper.add(m);
		sqlSession.commit();//在执行完sql后需提交才能将数据添加到库中，可以在获取连接对象的时候就设置自动提交，这是因为获取sqlsession对象时默认开启事务
		sqlSession.close();
		// 主键返回:在代理xml文件中可以设置
		int id1 = m.getId();
		System.out.println(id1);
	}
	
	public static void Update() throws IOException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		XueshengSpecfics mapper = sqlSession.getMapper(XueshengSpecfics.class);
		int id = 13;
		String name = "zjc";
		int age = 37;
		String sex = "女";
		String hobby = "wk";
		int idcard = 16;
		int score = 93;
		mysql m = new mysql();
		m.setId(id);
		m.setName(name);
		m.setSex(sex);
		m.setHobby(hobby);
		m.setAge(age);
		m.setIdcard(idcard);
		m.setScore(score);
		mapper.update(m);
		sqlSession.close();
	}
	public static void delete() throws IOException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		XueshengSpecfics mapper = sqlSession.getMapper(XueshengSpecfics.class);
		// mapper.delete(22);//单个删除
		int [] i={16,17,14};
		mapper.delete1(i);
		sqlSession.close();
	}
}
