package mybatis.dao;

import mybatis.demo1;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/2/15 11:30
 * @description
 */
public interface accountdao
{
	@Update("update xuesheng set age=35 where name=#{name}")
	void update2(String name);
	@Select("select * from demo1")
	List<demo1> select();
}
