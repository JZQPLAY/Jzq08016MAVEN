package aop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Jzq
 * @date 2023/2/17 11:59
 * @description
 */
@Service
public class aopimpl implements Aop
{
	@Override
	public int save(int a)
	{
		System.out.println(a);
		return a+1;
	}
	
	@Override
	public void save1(int a)
	{
		System.out.println("跑");
		System.out.println(a);
	}
}