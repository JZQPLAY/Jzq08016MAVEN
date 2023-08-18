package mybatis;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

/**
 * @author Jzq
 * @date 2023/2/15 10:57
 * @description
 */
@Configuration
@ComponentScan("mybatis")
public class mybatisconfig
{
	//使用该类型的方法替换mybatis-config配置文件
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource)
	{
		// 创建SqlSessionFactoryBean对象并设置属性
		SqlSessionFactoryBean sb=new SqlSessionFactoryBean();
		sb.setDataSource(dataSource);
		return sb;
	}
	//使用该方法替换mapper扫描
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer()
	{
		MapperScannerConfigurer mc=new MapperScannerConfigurer();
		mc.setBasePackage("mybatis.dao");
		return mc;
	}
}
