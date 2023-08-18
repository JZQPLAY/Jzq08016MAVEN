package com.jzq.springbootjzq.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import javax.sql.DataSource;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Jzq
 * @date 2023/8/8 14:58
 * @description 代码生成器
 */
public class generator
{
	public static void main(String[] args)
	{
		AutoGenerator autoGenerator = new AutoGenerator();
		DataSourceConfig datasource = new DataSourceConfig();
		datasource.setDriverName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql:///demo?useSSL=false");
		datasource.setUsername("root");
		datasource.setPassword("sjzclxy");
		autoGenerator.setDataSource(datasource);
		autoGenerator.execute();
	}
}
