
public class Employee {
	int empId;
	String empName, empDept;
	public void initEmployee(int id, String name, String dept)
	{
		empId = id;
		empName = name;
		empDept = dept;
	}
	public void displayEmployee()
	{
		System.out.println(empId+" "+empName+" "+empDept);
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.initEmployee(1,"Gaurav","EXTC");
		e1.displayEmployee();
	}

}
