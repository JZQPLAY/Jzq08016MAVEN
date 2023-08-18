/**
 * @author Jzq
 * @date 2023/1/21 15:43
 * @description
 */
public class demo1
{
	int id;
	
	String password;
	
	String username;
	
	public demo1(int id,String password,String username)
	{
		this.id=id;
		this.password=password;
		this.username=username;
	}
	
	public demo1()
	{
	
	}
	
	public int getId()
	{
		System.out.println("jzq666");
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	@Override
	public String toString()
	{
		return "demo1{" + "id=" + id + ", password='" + password + '\'' + ", username='" + username + '\'' + '}';
	}
}
	
