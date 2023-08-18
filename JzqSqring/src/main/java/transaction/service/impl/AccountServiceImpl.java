package transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import transaction.dao.AccountDao;
import transaction.service.AccountService;
import transaction.service.logservice;

/**
 * @author Jzq
 * @date 2023/3/3 10:04
 * @description
 */
@Service
public class AccountServiceImpl implements AccountService
{
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private logservice logservice;
	
	@Override
	public void transfer(String out,String in,Double password)
	{
		try
		{
			accountDao.inpassword(in,password);//加
			int i=1/0;
			accountDao.outpassword(out,password);//减
		}finally
		{
			logservice.log(out,in,password);
		}
		
		
	}
}