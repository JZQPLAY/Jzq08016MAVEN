package ZhuJie;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

/**
 * @author Jzq
 * @date 2023/2/14 16:52
 * @description
 * 纯注解开发;使用java类替代配置文件
 */
@Configuration//表示为配置类
@ComponentScan("ZhuJie")//注解扫描,括号里为路径
@PropertySource("jdbc.properties")//引入外部property文件,输入文件名时星号不能用
public class SpringConfig
{
	//直接在配置类中测试注解开发
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		zhuJie zhujie = (zhuJie)ctx.getBean("zhujie");
		zhuJie zhujie1 = (zhuJie)ctx.getBean("zhujie");
		System.out.println(zhujie);
		System.out.println(zhujie1);
		zhujie.save();
		ctx.close();
	}
	@Value("${jdbc.password}")
	private String password;
	//管理第三方bean:由于不能在外部代码直接写自己的配置，所以要自己手写
	
	/**1.定义一个方法获得要管理的对象
	 * 2.将方法返回值定义为一个bean，使用bean注解
	 * 类型注入
	 *       1.基本类型：使用成员变量的形式
	 *       2.引用类型：只需为bean定义方法设置形参即可，容器会根据类型自动装配对象
	 * @return
	 */
	@Bean
	public DataSource dataSource(zhujiedao zhujiedao)
	{
		zhujiedao.save();
		System.out.println(zhujiedao);
		DruidDataSource ds=new DruidDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///demo?useSSL=false");
		ds.setUsername("root");
		ds.setPassword(password);
		return ds;
	}
}
