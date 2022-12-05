
public class Employee {
	private int id;
	private String name;
	private double basicsal, GS, HRA, DA;
	public void initEmployee(int empId, String empName, double empBasicsal)
	{
		id = empId;
		name = empName;
		basicsal = empBasicsal;
		HRA = 0.4*basicsal;
		DA = 0.8*basicsal;
	}
	public double calcGrossSal()
	{
		GS = basicsal + HRA + DA;
		return GS;
	}
	public void displayEmployee()
	{
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Basic Salary = "+basicsal);
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.initEmployee(1,"Gaurav",30000);
		e1.displayEmployee();
		System.out.println("Gross Salary = "+e1.calcGrossSal());
	}
}