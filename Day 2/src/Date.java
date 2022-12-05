
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
	public static void main(String[] args)
	{
		Date d1=new Date(17,12,2019);
		System.out.println(d1);
	}

}
