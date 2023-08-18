package springMVC.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Jzq
 * @date 2023/7/24 10:30
 * @description
 */
@Configuration
@ComponentScan({"springMVC.ssm.service"})
@PropertySource("classpath:jdbc.properties")
@Import({jdbcconfig.class,mybatisconfig.class})
@EnableTransactionManagement
public class springConfig
{
}