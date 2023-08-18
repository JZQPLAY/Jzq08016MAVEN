package transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import transaction.dao.logdao;
import transaction.service.logservice;

/**
 * @author Jzq
 * @date 2023/7/16 20:55
 * @description
 */
@Service
public class logServiceImpl implements logservice
{
	@Autowired
	private logdao logdao;
	@Override
	public void log(String out,String in,Double money)
	{
		logdao.log("转账操作由"+out+"到"+in+"金额"+money);
	}
}