import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	public Employee(int id, String name, double salary) {
		// TODO Auto-generated constructor stub
	}
	public static Employee createEmployee(String input)
	{
		String[] data = input.split(",");
		int id = Integer.parseInt(data[0]);
		String name = data[1];
		double salary = Double.parseDouble(data[2]);
		return new Employee(id,name,salary);
		
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader emp = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many Employees: ");
		int no=Integer.parseInt(emp.readLine());
		Employee[] empArray=new Employee[no];
		for(int i = 0;i<no;i++)
		{
			System.out.println("Enter Employee Details: ");
			String s=emp.readLine();
			Employee e = createEmployee(s);
			empArray[i]=e;
//			System.out.println(e);
		}
		
		
//		int id;
//		String name;
//		double salary;
//		System.out.println("Enter id, name and salary: ");
//		id = Integer.parseInt(emp.readLine()); //convert string to integer
//		name = emp.readLine();
//		salary = Double.parseDouble(emp.readLine());
//
//		//Printing the read line
//		System.out.println("Id  = "+id);
//		System.out.println("Name = "+name);
//		System.out.println("Salary  = "+salary);
	}
	public String toString()
	{
		return id+" / "+name+" / "+salary;
	}

}
