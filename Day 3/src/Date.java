
public class Date {
	private int dd,mm,yy;
	public Date(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	public boolean checkDate()
	{
		if(dd>31 || mm>12)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
