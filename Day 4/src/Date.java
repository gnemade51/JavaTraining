
public class Date {
	int dd,mm,yy;
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public boolean equals(Object o)
	{
		Date d=(Date)o; //cast object to object Employee
		if(this.dd==d.dd && this.mm==d.mm && this.yy==d.yy)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Date d1=new Date(10,9,2019);
		Date d2=new Date(10,9,2019);
		if(d1.equals(d2))
			System.out.println("Objects are equal");
		else
			System.out.println("Objects are not equal");
	}

}
