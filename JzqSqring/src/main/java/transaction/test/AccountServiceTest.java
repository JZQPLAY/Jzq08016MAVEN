package transaction.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import transaction.service.AccountService;
import transaction.springconfig;

/**
 * @author Jzq
 * @date 2023/3/3 10:08
 * @description 转账测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = springconfig.class)
public class AccountServiceTest
{
	@Autowired
	private AccountService accountService;
	@Test
	public void testTransfer()
	{
		accountService.transfer("lbb","fbb",10d);
	}
}
