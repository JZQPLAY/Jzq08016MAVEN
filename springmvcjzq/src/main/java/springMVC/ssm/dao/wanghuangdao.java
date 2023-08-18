package springMVC.ssm.dao;

import domain.wanghuang;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/24 11:02
 * @description
 */
public interface wanghuangdao
{
	@Insert("insert into wanghuang values (null,#{name},#{password},#{sex},#{region})")
	void insert(wanghuang wanghuang);
	
	@Delete("delete from wanghuang where id=#{id}")
	void delete(int id);
	
	@Update("update wanghuang set name=#{name},password=#{password},sex=#{sex},region=#{region} where id=#{id}")
	void update(wanghuang wanghuang);
	
	@Select("select * from wanghuang ")
	List<wanghuang> selectAll();
	
	@Select("select * from wanghuang where id=#{id}")
	wanghuang selectbyid(int id);
}
