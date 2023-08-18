package transaction.dao;

import org.apache.ibatis.annotations.Insert;

/**
 * @author Jzq
 * @date 2023/7/16 20:51
 * @description
 */
public interface logdao
{
	@Insert("insert into log (info,createDate) values (#{log},now())")
	void log(String log);
}
