package transaction.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Jzq
 * @date 2023/7/16 20:55
 * @description
 */
public interface logservice
{
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	void log(String out,String in,Double money);
}
