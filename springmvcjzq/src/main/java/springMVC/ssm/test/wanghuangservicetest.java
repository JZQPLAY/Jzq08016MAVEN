package springMVC.ssm.test;

import domain.wanghuang;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springMVC.ssm.config.springConfig;
import springMVC.ssm.service.wanghuangservice;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/24 16:18
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = springConfig.class)
public class wanghuangservicetest
{
	@Autowired
	private wanghuangservice wanghuangservice;
	
	@Test
	public void testSelectbyid()
	{
		wanghuang selectbyid = wanghuangservice.selectbyid(2);
		System.out.println(selectbyid);
	}
	
	@Test
	public void testSelectall()
	{
		List<wanghuang> selectbyid = wanghuangservice.selectAll();
		System.out.println(selectbyid);
	}
}
