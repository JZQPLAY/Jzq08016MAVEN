package com.jzq.springbootjzq;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jzq.springbootjzq.daomybatis.wanghuangmybatisdao;
import com.jzq.springbootjzq.domain.wanghuang;
import com.jzq.springbootjzq.service.wanghuangservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/24 16:18
 * @description
 */
@SpringBootTest
public class wanghuangservicetest
{
	@Autowired(required = false)
	private wanghuangservice wanghuangservice;
	
	@Autowired
	private wanghuangmybatisdao wanghuangmybatisdao;
	
	@Test
	public void testSelectbyid()
	{
		wanghuang selectbyid = wanghuangservice.selectbyid(2);
		System.out.println(selectbyid);
	}
	
	@Test
	public void testSelectall()
	{
		QueryWrapper queryWrapper = new QueryWrapper<>();
		queryWrapper.select("count(*)");//设置查询投影
		List list = wanghuangmybatisdao.selectMaps(queryWrapper);
		List<wanghuang> selectbyid = wanghuangservice.selectAll();
		System.out.println(list);
		System.out.println(selectbyid);
	}
	
	@Test
	public void testSelectbyids()
	{
		LambdaQueryWrapper<wanghuang> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.eq(wanghuang::getName,"阿朱");
		List<wanghuang> wanghuangs = wanghuangmybatisdao.selectList(queryWrapper);
		for(wanghuang wanghuang : wanghuangs)
		{
			System.out.println(wanghuang);
		}
	}
	
	@Test
	void testsave()
	{
		wanghuang wanghuang = new wanghuang();
		wanghuang.setId(0);
		wanghuang.setName("阿朱");
		wanghuang.setPassword("是你的阿朱");
		wanghuang.setSex("女");
		wanghuang.setRegion("微密圈");
		wanghuangmybatisdao.insert(wanghuang);
	}
	
	@Test
	void testbypage()
	{
		IPage page = new Page(1,2);
		wanghuangmybatisdao.selectPage(page,null);
		System.out.println(page.getRecords());
	}
}