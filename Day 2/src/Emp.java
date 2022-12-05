
public class Emp {
	private int id;
	private String name;
	static int count;
	public Emp(int empId, String empName)
	{
		id = empId;
		name = empName;
		count++;
	}
	public void displayEmp()
	{
		System.out.println("Total no. of Employees = "+count);
	}
	public static void main(String[] args)
	{
		Emp e1=new Emp(1,"Gaurav");
		Emp e2=new Emp(2,"Daksh");
		Emp e3=new Emp(3,"Sanket");
		e3.displayEmp();
	}

}
