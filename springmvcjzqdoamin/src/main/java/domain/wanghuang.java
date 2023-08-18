package domain;

/**
 * @author Jzq
 * @date 2023/7/16 10:08
 * @description
 */
public class wanghuang
{
	int id;
	String name;
	String password;
	String sex;
	String region;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getSex()
	{
		return sex;
	}
	
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	public String getRegion()
	{
		return region;
	}
	
	public void setRegion(String region)
	{
		this.region = region;
	}
	
	public wanghuang(int id,String name,String password,String sex,String region)
	{
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.region = region;
	}
	
	public wanghuang()
	{
	}
	
	@Override
	public String toString()
	{
		return "wanghuang{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + ", sex='" + sex + '\'' + ", region='" + region + '\'' + '}';
	}
}
