import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import java.util.List;
import java.util.Map;

/**
 * @author Jzq
 * @date 2023/1/2 20:01
 * @description
 */
public interface XueshengSpecfics
{
	//一个条件的查询
	mysql selectByID(int id);
	//多个条件的查询
	
	/**
	 * 1.使用散装参数形式：当方法中有多个参数，需要使用@params("sql参数占位符名称")注解来表示将参数传给指定的占位符
	 * 2.使用对象参数：对象的属性名称要和参数占位符名称一致
	 * @param name
	 * @param sex
	 * @param score
	 * @return
	 */
	// List<mysql> selectByCondition(@Param("name") String name,@Param("sex") String sex,@Param("score")int score);
	// List<mysql> selectByCondition(mysql sql);
	List<Map> selectByCondition(Map c);
	//单条件动态查询
	List<Map> selectByConditionSingle(Map c);
	//添加
	void add(mysql mysql);
	//修改
	void update(mysql mysql);
	//单个删除
	void delete(int id);
	//批量删除
	void delete1(int[] ids);
	//使用注解
	@Update("update xuesheng set age=35 where name=#{name}")
	void update2(String name);
}
