package factory;

/**
 * @author Jzq
 * @date 2023/2/11 21:23
 * @description
 */
public class FactoryBean implements org.springframework.beans.factory.FactoryBean<dao>
{
	@Override
	public dao getObject() throws Exception//该方法用来代替实例工厂中创建对象的方法
	{
		return new impl();
	}
	//该方法用来声明变量类型
	@Override
	public Class<?> getObjectType()
	{
		return dao.class;//该方法内返回接口的class字节码
	}
}
