package Mapper;

import denglu.wanghuang;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/17 15:09
 * @description
 */
public interface UserMapper2
{
	@Select("select *from wanghuang")
	List<wanghuang> selectAll();
	
	@Insert("insert into wanghuang values (null,#{name},#{password},#{sex},#{region},#{status})")
	void insert(wanghuang wanghuang);
	
	@Select("select * from wanghuang where id=#{id}")
	wanghuang selectByid(int id);
	
	@Update("update wanghuang set name=#{name},password=#{password},sex=#{sex},region=#{region},status=#{status} where id=#{id}")
	void update(wanghuang wanghuang);
	
	void deleteByids(@Param(("ids")) int[] ids);
	
	@Select("select * from wanghuang limit #{begin},#{size}")
	List<wanghuang> selectbypage(@Param("begin") int begin,@Param("size") int size);
	
	@Select("select count(*) from wanghuang")
	int selecttotalcount();
	
	List<wanghuang> selectbypageandcondition(@Param("begin") int begin,@Param("size") int size,@Param("wanghuang") wanghuang wanghuang);
	
	int selecttotalcountbycondition(wanghuang w);
}