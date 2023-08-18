package springMVC.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jzq
 * @date 2023/3/4 10:36
 * @description
 * 使用controller定义bean
 */

@Controller
@RequestMapping("/User")//请求路径前缀
public class UserController
{
	@RequestMapping("/save")
	@ResponseBody
	public String save()//返回的是json数据，所以定义为string
	{
		System.out.println("user save");
		return "{'module':'springmvc'}";
	}
}