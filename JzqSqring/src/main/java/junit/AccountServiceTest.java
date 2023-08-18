package junit;

import ZhuJie.SpringConfig;
import mybatis.service.accountservice;
import mybatis.springconfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Jzq
 * @date 2023/2/16 11:40
 * @description
 * spring整合junit(测试)
 */
@RunWith(SpringJUnit4ClassRunner.class)//设定类运行器
@ContextConfiguration(classes = springconfig.class)//引入spring配置文件
public class AccountServiceTest
{
	@Autowired
	private accountservice as;
	@Test
	public void tsetselect()
	{
		System.out.println(as.select());
	}
}
