import com.alibaba.fastjson.JSON;

/**
 * @author Jzq
 * @date 2023/1/31 18:42
 * @description
 */
public class json
{
	public static void main(String[] args)
	{
		//json数据和java对象转换：请求数据：json字符串转为java对象  响应数据：java对象转为json字符串
		demo1 d=new demo1();
		d.setUsername("jzq");
		d.setId(1);
		d.setPassword("19851019");
		//1.java转json
		String s = JSON.toJSONString(d);
		System.out.println(s);
		//2.json转java
		demo1 demo1 = JSON.parseObject("{\"id\":1,\"password\":\"19851019\",\"username\":\"jzq\"}",demo1.class);
		System.out.println(demo1);
	}
}
