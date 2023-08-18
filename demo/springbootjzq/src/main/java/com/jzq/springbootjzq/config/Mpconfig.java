package com.jzq.springbootjzq.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jzq
 * @date 2023/8/5 20:36
 * @description
 */
@Configuration
public class Mpconfig
{
	@Bean
	public MybatisPlusInterceptor mybatisPlusInterceptor()
	{
		MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
		mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());//添加分页
		mybatisPlusInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());//添加乐观锁
		return mybatisPlusInterceptor;
	}
}