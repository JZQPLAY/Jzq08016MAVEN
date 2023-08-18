package factory;

/**
 * @author Jzq
 * @date 2023/2/11 17:19
 * @description
 */
public class OrderDaostaticFactory
{
	public static dao getDao()
	{
		return new impl();
	}
}