package transaction.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Jzq
 * @date 2023/3/3 9:58
 * @description
 */
public interface AccountDao
{
	@Update("update demo1 set password=password+#{password} where username=#{username}")
	void inpassword(@Param("username") String username,@Param("password") Double password);
	
	@Update("update demo1 set password=password-#{password} where username=#{username}")
	void outpassword(@Param("username") String username,@Param("password") Double password);
}
