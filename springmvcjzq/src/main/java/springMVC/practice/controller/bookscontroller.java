package springMVC.practice.controller;

import domain.wanghuang;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/7/23 19:38
 * @description
 */
@RestController
@RequestMapping("/books")
public class bookscontroller
{
	@PostMapping
	public String save(@RequestBody wanghuang w)
	{
		System.out.println("查询结果" + w);
		return "jzq";
	}
	
	@GetMapping
	public List<wanghuang> selectAll()
	{
		List<wanghuang> list = new ArrayList<>();
		wanghuang w = new wanghuang(1,"jok","玖珂","女","for you");
		wanghuang w1 = new wanghuang(2,"kalinapark","klina","女","twitter");
		list.add(w);
		list.add(w1);
		return list;
	}
}