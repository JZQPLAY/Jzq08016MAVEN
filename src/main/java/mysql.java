import java.util.Date;

/**
 * @author Jzq
 * @date 2023/1/1 17:33
 * @description
 */
public class mysql
{
	private int id;
	private String name;
	private int age;
	private String sex;
	private String hobby;
	private Date entryDate;
	private int idcard;
	private int score;
	
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
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getSex()
	{
		return sex;
	}
	
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	public String getHobby()
	{
		return hobby;
	}
	
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	
	public Date getentryDate()
	{
		return entryDate;
	}
	
	public void setentryDate(Date entryDate)
	{
		this.entryDate = entryDate;
	}
	
	public int getIdcard()
	{
		return idcard;
	}
	
	public void setIdcard(int idcard)
	{
		this.idcard = idcard;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	@Override
	public String toString()
	{
		return "mysql{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + ", hobby='" + hobby + '\'' + ", entryDate=" + entryDate + ", idcard=" + idcard + ", score=" + score + '}';
	}
}
