
public class MainApp {
	static int temp;
	public static void swap(Date[] mydates)
	{
		Date temp;
		temp=mydates[0];
		mydates[0]=mydates[1];
		mydates[1]=temp;
		System.out.println(mydates[0]+" , "+mydates[1]);
	}
	public static void main(String[] args)
	{
		Date d1=new Date(10,10,2010);
		Date d2=new Date(2,12,2005);
		Date[] dates= {d1,d2};
		System.out.println(dates[0]+" , "+dates[1]);
		swap(dates);
		System.out.println(dates[0]+" , "+dates[1]);
	}
	
	
	
	
	
	/*static int temp;
	public static void swap(Date d1, Date d2)
	{
		Date temp;
		temp=d1;
		d1=d2;
		d2=temp;
		System.out.println(d1+" , "+d2);
	}
	public static void main(String[] args)
	{
		Date d1=new Date(10,10,2010);
		Date d2=new Date(2,12,2005);
		System.out.println(d1+" , "+d2);
		swap(d1,d2);
		System.out.println(d1+" , "+d2);
	}*/

}
