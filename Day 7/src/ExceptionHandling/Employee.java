package ExceptionHandling;

public class Employee {
	int empId;
	String empName;
	Date dt_of_joining;
	public Employee(int empId, String empName, Date dt_of_joining)
	{
		this.empId=empId;
		this.empName=empName;
		this.dt_of_joining=dt_of_joining;
	}
	public String toString()
	{
		return empId+" , "+empName+" , "+dt_of_joining;
	}
	public static void main(String[] args)
	{
		//Employee e1=new Employee(101, "Umesh", new Date(18,12,2019));
		Date d1=new Date(18,12,2019);
		Employee e1=new Employee(101,"Umesh",d1);
		if(d1.checkDate()==false)
		{
			System.out.println("Invalid Date");
		}
		else
		{
			System.out.println("Valid Date");
		}
		System.out.println(e1);
	}

}
