package Mapper;

import denglu.wanghuang;
import login.demo1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/1/21 15:53
 * @description
 */
public interface UserMapper1
{
	/**
	 * 根据用户名和密码查询数据以登录
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	@Select("select * from demo1 where username =#{username} and password=#{password}")
	demo1 select(@Param("username") String username,@Param("password") String password);
	
	/**
	 * 添加用户
	 *
	 * @param d
	 */
	@Insert("insert into demo1 (username,password)values(#{username},#{password})")
	void add(demo1 d);
	
	@Select("select * from wanghuang")
	List<wanghuang> selectAll();
}
