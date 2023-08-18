package config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
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
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource)//使用该类型的方法替换mybatis-config配置文件
	{
		// 创建SqlSessionFactoryBean对象并设置属性
		SqlSessionFactoryBean sb=new SqlSessionFactoryBean();
		sb.setDataSource(dataSource);
		return sb;
	}
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer()//使用该方法替换mapper扫描
	{
		MapperScannerConfigurer mc=new MapperScannerConfigurer();
		mc.setBasePackage("mybatis.dao");
		return mc;
	}
}
