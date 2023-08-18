package springMVC.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jzq
 * @date 2023/7/22 19:20
 * @description restful风格开发
 */
@RestController//结合了responsebody和controller
@RequestMapping("/users")
public class restful
{
	@PostMapping
	public String save()
	{
		return "common Param";
	}
	
	//method：设置请求方式
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public String save1(@PathVariable int id)//将形参定义在路径上
	{
		System.out.println(id);
		return "common Param";
	}
}