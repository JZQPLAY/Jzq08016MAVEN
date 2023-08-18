package mybatis;

import org.springframework.context.annotation.*;

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