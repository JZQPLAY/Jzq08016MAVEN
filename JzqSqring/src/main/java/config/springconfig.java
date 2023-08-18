package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Jzq
 * @date 2023/2/15 12:01
 * @description
 */
@Configuration
@ComponentScan("mybatis")
@PropertySource("jdbc.properties")
@Import({jdbcconfig.class,mybatisconfig.class})
public class springconfig
{
}