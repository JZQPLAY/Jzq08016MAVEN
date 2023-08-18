package aop.data;

import org.springframework.stereotype.Service;

/**
 * @author Jzq
 * @date 2023/7/7 19:29
 * @description
 */
@Service
public class datadaoimpl implements datadao
{
	@Override
	public boolean pipei(String trim)
	{
		return trim.equals("root");
	}
}
