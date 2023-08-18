package denglu.service;

import Mapper.UserMapper2;
import denglu.Pagebean;
import denglu.wanghuang;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/26 21:26
 * @description
 */
public interface wanghuangservice
{
	public List<wanghuang> selectAll();
	
	public void add(wanghuang wanghuang);
	
	public wanghuang selectById(int id);
	
	public void update(wanghuang wanghuang);
	
	void deleteByids(int[] ids);
	
	Pagebean<wanghuang> selectbypage(int begin,int size);
	
	Pagebean<wanghuang> selectbypageandcondition(int begin,int size,wanghuang wanghuang);
}