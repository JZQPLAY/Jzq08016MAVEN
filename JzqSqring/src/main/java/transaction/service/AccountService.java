package transaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.io.IOException;

/**
 * @author Jzq
 * @date 2023/3/3 9:55
 * @description
 * 事务管理员：发起事务方,在spring中通常指业务层开启事务的方法
 * 事务协调员：加入事务方，在spring中通常指代数据层方法，也可以是业务层方法
 * readonly:设置只读事务
 * timeout:事务超时时间
 * rollbackfor:设置回滚（有的异常是不会自动回滚的，这时需要自己设置）
 * 事务传播：事务协调员对所携带事务的处理态度，在事务协调员上设置
 */
public interface AccountService
{
	/**
	 * 转帐操作
	 */
	@Transactional(timeout = -1,rollbackFor = {IOException.class})
	void transfer(String out,String in,Double password);
}
