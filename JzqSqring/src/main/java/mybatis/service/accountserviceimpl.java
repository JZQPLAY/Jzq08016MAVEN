package mybatis.service;

import mybatis.dao.accountdao;
import mybatis.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/2/15 19:42
 * @description
 */
@Service
public class accountserviceimpl implements accountservice
{
	@Autowired
	private accountdao ac;
	
	@Override
	public void update2(String name)
	{
		ac.update2(name);
	}
	
	@Override
	public List<demo1> select()
	{
		return ac.select();
	}
}
