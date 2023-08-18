package denglu.service.impl;

import Mapper.UserMapper2;
import denglu.Pagebean;
import denglu.SqlsessionFactory;
import denglu.service.wanghuangservice;
import denglu.wanghuang;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.nio.file.WatchService;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/17 15:15
 * @description
 */
public class wanghuangServiceimpl implements wanghuangservice
{
	SqlSessionFactory sqlsessionfactory = SqlsessionFactory.getSqlsessionfactory();
	
	@Override
	public List<wanghuang> selectAll()
	{
		SqlSession sqlSession = sqlsessionfactory.openSession();
		UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
		List<wanghuang> wanghuangs = mapper.selectAll();
		sqlSession.close();
		return wanghuangs;
	}
	
	@Override
	public void add(wanghuang wanghuang)
	{
		SqlSession sqlSession = sqlsessionfactory.openSession();
		UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
		mapper.insert(wanghuang);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Override
	public wanghuang selectById(int id)
	{
		SqlSession sqlSession = sqlsessionfactory.openSession();
		UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
		wanghuang wanghuang = mapper.selectByid(id);
		sqlSession.commit();
		sqlSession.close();
		return wanghuang;
	}
	
	@Override
	public void update(wanghuang wanghuang)
	{
		SqlSession sqlSession = sqlsessionfactory.openSession();
		UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
		mapper.update(wanghuang);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Override
	public void deleteByids(int[] ids)
	{
		SqlSession sqlSession = sqlsessionfactory.openSession();
		UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
		mapper.deleteByids(ids);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Override
	public Pagebean<wanghuang> selectbypage(int begin,int size)
	{
		SqlSession sqlSession = sqlsessionfactory.openSession();
		UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
		//计算开始索引
		int beginpage = (begin - 1) * size;
		int sizepage = size;
		List<wanghuang> selectbypage = mapper.selectbypage(beginpage,sizepage);
		int selecttotalcount = mapper.selecttotalcount();
		Pagebean<wanghuang> objectPagebean = new Pagebean<>();
		objectPagebean.setRows(selectbypage);
		objectPagebean.setTotalcount(selecttotalcount);
		sqlSession.close();
		return objectPagebean;
	}
	
	@Override
	public Pagebean<wanghuang> selectbypageandcondition(int begin,int size,wanghuang wanghuang)
	{
		SqlSession sqlSession = sqlsessionfactory.openSession();
		UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
		//计算开始索引
		int beginpage = (begin - 1) * size;
		int sizepage = size;
		//处理模糊表达式
		String name = wanghuang.getName();
		if(name != null && name.length() > 0)
		{
			wanghuang.setName("%" + name + "%");
		}
		String password = wanghuang.getPassword();
		if(password != null && password.length() > 0)
		{
			wanghuang.setPassword("%" + password + "%");
		}
		List<denglu.wanghuang> selectbypageandcondition = mapper.selectbypageandcondition(beginpage,sizepage,wanghuang);
		int selecttotalcountbycondition = mapper.selecttotalcountbycondition(wanghuang);
		Pagebean<wanghuang> pagebean = new Pagebean<>();
		pagebean.setRows(selectbypageandcondition);
		pagebean.setTotalcount(selecttotalcountbycondition);
		sqlSession.close();
		return pagebean;
	}
}