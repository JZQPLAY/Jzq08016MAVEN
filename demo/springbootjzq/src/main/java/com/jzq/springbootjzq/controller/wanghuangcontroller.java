package com.jzq.springbootjzq.controller;

import com.jzq.springbootjzq.domain.wanghuang;
import com.jzq.springbootjzq.service.wanghuangservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/24 11:05
 * @description
 */
@RestController
@RequestMapping("/wanghuangs")
public class wanghuangcontroller
{
	@Autowired
	private wanghuangservice wanghuangservice;
	
	@PostMapping
	public result insert(@RequestBody wanghuang wanghuang)
	{
		boolean insert = wanghuangservice.insert(wanghuang);
		return new result(insert ? code.INSERT_OK : code.INSERT_ERR,insert);
	}
	
	@DeleteMapping("/{id}")
	public result delete(@PathVariable int id)
	{
		boolean flag = wanghuangservice.delete(id);
		return new result(flag ? code.INSERT_OK : code.INSERT_ERR,flag);
	}
	
	@PutMapping
	public result update(@RequestBody wanghuang wanghuang)
	{
		boolean flag = wanghuangservice.update(wanghuang);
		return new result(flag ? code.INSERT_OK : code.INSERT_ERR,flag);
	}
	
	@GetMapping
	public result selectAll()
	{
		List<wanghuang> wanghuangs = wanghuangservice.selectAll();
		Integer integer = wanghuangs != null ? code.SELECT_OK : code.SELECT_ERR;
		String s = wanghuangs != null ? "" : "数据查询失败，请重试";
		return new result(integer,wanghuangs,s);
	}
	
	@GetMapping("/{id}")
	public result selectbyid(@PathVariable int id)
	{
		wanghuang wanghuangs = wanghuangservice.selectbyid(id);
		Integer integer = wanghuangs != null ? code.SELECT_OK : code.SELECT_ERR;
		String s = wanghuangs != null ? "" : "数据查询失败，请重试";
		return new result(integer,wanghuangs,s);
	}
}