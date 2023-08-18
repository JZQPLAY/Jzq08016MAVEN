package springMVC.practice.controller;

import domain.wanghuang;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/20 15:32
 * @description
 * responsebody的作用：设置当前控制器返回值作为响应体，即方法的返回值是什么，就响应什么数据
 */

@RestController
@RequestMapping("/Book")//请求路径前缀
public class Bookcontroller
{
	@RequestMapping("/save")
	
	public String save(String name)//使用形参形式传递请求普通参数
	{
		System.out.println(name);
		return "common Param";
	}
	
	@RequestMapping("/save1")
	public String save1(@RequestParam("username") String name)//使用形参形式传递请求普通参数(请求参数名与形参名不同)
	{
		System.out.println(name);
		return "common Param";
	}
	
	@RequestMapping("/save2")
	public String save2(wanghuang w)//pojo类型参数(可加嵌套)
	{
		System.out.println(w.getSex());
		return "common Param";
	}
	
	@RequestMapping("/save3")
	public String save3(String[] s)//数组类型参数，浏览器输入时直接按数组名赋值
	{
		System.out.println(s[0]);
		return "common Param";
	}
	
	@RequestMapping("/save4")
	public String save4(@RequestParam List<String> li)//数组类型参数，浏览器输入时直接按数组名赋值
	{
		System.out.println(li.size());
		return "common Param";
	}
	
	@RequestMapping("/save5")
	public String save5(@RequestBody List<String> li)//json类型参数传递
	{
		System.out.println(li.size());
		return "common Param";
	}
}
