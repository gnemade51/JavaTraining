
public class EmployeeSort {
	private int id;
	private String name;
	private double salary;
	static int i, j;
	public EmployeeSort(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static void sort(EmployeeSort[] employees)
	{
		double temp;
		for(int j=0;j<employees.length;j++)
		{
			for(int i=0;i<employees.length-1;i++)
			{
				if(employees[i].salary>employees[i+1].salary)
				{
					temp = employees[i+1].salary;
					employees[i+1].salary = employees[i].salary;
					employees[i].salary = temp;
				}
			}
		}
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	public static void main(String[] args)
	{
		EmployeeSort e1=new EmployeeSort(1,"Gaurav",95000);
		EmployeeSort e2=new EmployeeSort(2,"Aditya",80000);
		EmployeeSort e3=new EmployeeSort(3,"Sandy",30000);
		EmployeeSort e4=new EmployeeSort(4,"Daksh",60000);
		EmployeeSort e5=new EmployeeSort(5,"Mihir",7000);
		EmployeeSort e6=new EmployeeSort(6,"Nihar",22000);
		EmployeeSort e7=new EmployeeSort(7,"Rakesh",45000);
		EmployeeSort e8=new EmployeeSort(8,"Kunal",87000);
		EmployeeSort e9=new EmployeeSort(9,"Rick",51000);
		EmployeeSort e10=new EmployeeSort(10,"Morty",54300);
		EmployeeSort[] employees= {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
		sort(employees);
		for(int j=0;j<employees.length;j++)
		{
			System.out.println(employees[j]);
		}
	}

}
