package springMVC.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Jzq
 * @date 2023/7/24 10:53
 * @description
 */
@Configuration
@ComponentScan({"springMVC.ssm.controller","springMVC.practice.controller","springMVC.ssm.config"})
@EnableWebMvc
public class Springconfigmvc
{
}