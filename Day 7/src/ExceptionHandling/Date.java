package ExceptionHandling;

public class Date {
	int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public static void checkDate(int dd, int mm, int yy) throws DateException
	{
		if (mm>12)
		{
			try
			{
				throw new DateException();
			}
			catch (DateException e)
			{
				//System.out.println(e);
				System.err.println(e);
			}
		}
		
	}

}
