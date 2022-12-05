
public class Date {
	int day, month, year;
	public void initDate(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	public void displayDate()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
	public static void main(String[] args)
	{
		Date d1=new Date();
		d1.initDate(16,12,2019);
		d1.displayDate();
		Date d2=new Date();
		d2.initDate(17,12,2019);
		d2.displayDate();
	}

}
