package springMVC.ssm.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;

/**
 * @author Jzq
 * @date 2023/7/24 10:52
 * @description
 */
public class Servletconfig extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class[]{springConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class[]{Springconfigmvc.class};
	}
	
	@Override
	protected String[] getServletMappings()
	{
		return new String[]{"/"};
	}
	
	@Override
	protected Filter[] getServletFilters()
	{
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		return new Filter[]{characterEncodingFilter};
	}
}
