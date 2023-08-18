package ZhuJie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author Jzq
 * @date 2023/2/14 19:26
 * @description
 */
@Repository("zhujiedao")
public class zhujiedaodemo implements zhujiedao
{
	@Value("${jdbc.url}")
	private String name;
	@Override
	public void save()
	{
		System.out.println("看"+name);
	}
}
