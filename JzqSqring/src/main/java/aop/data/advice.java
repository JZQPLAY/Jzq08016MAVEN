package aop.data;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Jzq
 * @date 2023/7/7 19:35
 * @description
 */
@Component
@Aspect
public class advice
{
	@Pointcut("execution(boolean aop.data.datadao.pipei(..))")
	private void pt()
	{
	}
	@Around("pt()")
	public Object method(ProceedingJoinPoint pj) throws Throwable
	{
		Object[] args = pj.getArgs();
		for(int i = 0; i < args.length; i++)
		{
			if(args[i].getClass().equals(String.class))
			{
				args[i]=args[i].toString().trim();
			}
			
		}
		Object proceed = pj.proceed(args);
		return proceed;
	}
}
