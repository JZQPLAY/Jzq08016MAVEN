package factory;

/**
 * @author Jzq
 * @date 2023/2/11 21:06
 * @description
 */
public class OrderFactory
{
	public dao getdao()
	{
		return new impl();
	}
}
