package login;

import Mapper.UserMapper1;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author Jzq
 * @date 2023/1/26 10:05
 * @description
 */
public class LoginService
{
	SqlSessionFactory sqlSessionFactory = SqlsessionFactory.getSqlsessionfactory();
	
	/**
	 * 登录方法
	 * @param username
	 * @param password
	 * @return
	 */
	public demo1 login(String username,String password)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
		demo1 d = mapper.select(username,password);
		sqlSession.close();
		return d;
	}
	
	/**
	 * 注册方法
	 * @param d
	 * @return
	 */
	public boolean register(demo1 d)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
		//判断用户名是否存在
		demo1 select = mapper.select(d.getUsername(),d.getPassword());
		if(select==null)
		{
			//用户名不存在，注册
			mapper.add(d);
			//注意:要提交事务
			sqlSession.commit();
		}
		sqlSession.close();
		return select==null;
	}
}
