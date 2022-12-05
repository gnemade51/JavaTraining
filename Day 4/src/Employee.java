
public class Employee {
	int empId;
	String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public void register()
	{
		System.out.println("Registered Employee");
	}
	public static void display(Object e)
	{
		if(e instanceof Employee)
			((Employee)e).register();
		else
			System.out.println("You are not Employee...Hence you are not registered");
	}
	public boolean equals(Object o)
	{
		Employee e=(Employee)o; //cast object to object Employee
		if(this.empId==e.empId)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
	//	Employee e1=new Employee(101,"Gaurav");
	//	Employee e2=new Employee(102,"Daksh");
	//	if(e1.equals(e2))
	//		System.out.println("Objects are equal");
	//	else
	//		System.out.println("Objects are not equal");
		Animal d=new Dog();
		Animal c=new Cat();
		display(d);
		display(c);
	}

}
