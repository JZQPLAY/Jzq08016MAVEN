package springMVC.ssm.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * @author Jzq
 * @date 2023/7/24 10:33
 * @description
 */
public class mybatisconfig
{
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource)
	{
		SqlSessionFactoryBean s = new SqlSessionFactoryBean();
		s.setDataSource(dataSource);
		return s;
	}
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer()
	{
		MapperScannerConfigurer m = new MapperScannerConfigurer();
		m.setBasePackage("springMVC.ssm.dao");
		return m;
	}
}
