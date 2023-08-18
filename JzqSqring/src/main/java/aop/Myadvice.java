package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Jzq
 * @date 2023/2/17 11:29
 * @description
 * Aop:面向切面编程，在不惊动原始设计的情况下为其进行功能增强
 * 原始方法称为连接点
 * 需要增强的方法称为切入点
 * 追加的功能称为通知
 * 通知和切入点的关系称为切面
 * ----------------------------书写技巧：
 * 1.切入点一般描述接口，而不描述实现类
 * 2.针对接口开发，访问控制修饰符一般使用public（可省略）
 * 3.增删改精准匹配，查询宜用*匹配
 * 4.包名一般不用..匹配，一般用*
 * 5.书写接口名和类名时和模块相关的采用*匹配
 * 6.方法名动词精准匹配，名词*匹配
 * 7.一般不用异常作为匹配规则
 */
@Component//定义为bean，方便识别
@Aspect//告知spring为Aop
public class Myadvice
{
	@Pointcut("execution(void aop.Aop.save1(..))")//定义一个私有方法，并使用注解将其和切入点连接起来
	private void pt()
	{
	}
	@Pointcut("execution(int aop.Aop.save(int))")//定义一个私有方法，并使用注解将其和切入点连接起来
	private void pt1()
	{
	}
	//通知类型：before:前置通知
	@Before("pt()")//设定功能在切入点执行前还是执行后执行，将私有方法导入进来
	public void method0(JoinPoint jp)//方法中写通知功能
	{
		//使用JoinPoint获取参数
		Object[] args = jp.getArgs();
		System.out.println(Arrays.toString(args));
		System.out.println("before");
	}
	//通知类型：after:后置通知
	@After("pt()")
	public void method1()
	{
		System.out.println("after");
	}
	//通知类型：around:环绕通知
	@Around("pt()")
	public void method2(ProceedingJoinPoint pj) throws Throwable
	{
		System.out.println("前");
		//调用原始方法
		pj.proceed();
		System.out.println("后");
	}
	@Around("pt1()")//当切入有返回值的方法时，可以将其返回值调出来，原方法有返回值，通知方法也要有返回值
	public Object method3(ProceedingJoinPoint pj) throws Throwable
	{
		//使用ProceedingJoinPoint获取参数
		Object[] args = pj.getArgs();
		System.out.println(Arrays.toString(args));
		long l = System.currentTimeMillis();
		//获取一次执行的签名信息，即执行一次方法的操作过程,可以用其获得方法的信息
		Signature signature = pj.getSignature();
		System.out.print(signature.getName());
		System.out.println(signature.getDeclaringType());
		//调用原始方法
		Object proceed = pj.proceed();
		long l1 = System.currentTimeMillis();
		System.out.println(l1 - l+"ms");
		return proceed;
	}
	//通知类型：afterReturning:原始方法正常运行后触发
	@AfterReturning(value = "pt1()" ,returning="ret")//获取返回值，在注解定义时加上returning
	public void method4(Object ret)
	{
		System.out.println   ("运行成功"+ret);
	}
	//通知类型：afterThrowing:原始方法抛出异常后触发
	@AfterThrowing(value = "pt1()",throwing = "ter")//获取返回值，在注解定义时加上throwing
	public void method5(Throwable ter)
	{
		System.out.println("运行异常"+ter);
	}
}
