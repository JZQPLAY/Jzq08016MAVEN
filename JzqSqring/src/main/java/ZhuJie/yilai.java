package ZhuJie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Jzq
 * @date 2023/2/14 19:13
 * @description
 */
public class yilai
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		zhuJie zhujie = (zhuJie)ctx.getBean("zhujie");
		zhujie.save();
	}
}
