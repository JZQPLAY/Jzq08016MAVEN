package springMVC.ssm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springMVC.ssm.controller.interceptor.projectintercpetor;
import springMVC.ssm.controller.interceptor.projectintercpetor1;

/**
 * @author Jzq
 * @date 2023/7/28 11:40
 * @description
 */
@Configuration
public class SpringmvcSupport extends WebMvcConfigurationSupport
{
	@Autowired
	private projectintercpetor projectintercpetor;
	
	@Autowired
	private projectintercpetor1 projectintercpetor1;
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		super.addResourceHandlers(registry);
	}
	
	//拦截器
	@Override
	protected void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(projectintercpetor).addPathPatterns("/wanghuangs","/wanghuangs/*");
		registry.addInterceptor(projectintercpetor1).addPathPatterns("/wanghuangs","/wanghuangs/*");
		
	}
}
