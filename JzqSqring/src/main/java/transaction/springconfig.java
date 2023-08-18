package transaction;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Jzq
 * @date 2023/2/15 12:01
 * @description
 */
@Configuration
@ComponentScan("transaction")
@PropertySource("jdbc.properties")
@Import({jdbcconfig.class,mybatisconfig.class})
@EnableTransactionManagement//告知程序是用注解进行事务驱动的
public class springconfig
{
}