package com.jzq.springbootjzq.dao;
import com.jzq.springbootjzq.domain.wanghuang;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/24 11:02
 * @description
 */
@Mapper
public interface wanghuangdao
{
	@Insert("insert into wanghuang values (null,#{name},#{password},#{sex},#{region})")
	int insert(wanghuang wanghuang);
	
	@Delete("delete from wanghuang where id=#{id}")
	int delete(int id);
	
	@Update("update wanghuang set name=#{name},password=#{password},sex=#{sex},region=#{region} where id=#{id}")
	int update(wanghuang wanghuang);
	
	@Select("select * from wanghuang")
	List<wanghuang> selectAll();
	
	@Select("select * from wanghuang where id=#{id}")
	wanghuang selectbyid(int id);
}
