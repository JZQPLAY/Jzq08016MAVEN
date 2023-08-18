package denglu;

import org.w3c.dom.stylesheets.LinkStyle;
import java.util.List;

/**
 * @author Jzq
 * @date 2023/8/3 21:00
 * @description
 */
public class Pagebean<J>
{
	private int totalcount;
	private List<J> rows;
	
	public int getTotalcount()
	{
		return totalcount;
	}
	
	public void setTotalcount(int totalcount)
	{
		this.totalcount = totalcount;
	}
	
	public List<J> getRows()
	{
		return rows;
	}
	
	public void setRows(List<J> rows)
	{
		this.rows = rows;
	}
}
