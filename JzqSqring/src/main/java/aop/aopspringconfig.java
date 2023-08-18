package aop;

import org.springframework.context.annotation.*;

/**
 * @author Jzq
 * @date 2023/2/17 12:01
 * @description
 */
@Configuration
@ComponentScan("aop")
@EnableAspectJAutoProxy//使用该注解对应aspect
@PropertySource("jdbc.properties")
public class aopspringconfig
{
}
