
public class Emp {
	int empId;
	String empName;
	double basicSalary, grossSalary;
	public Emp(int empId, String empName, double basicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}
	public double getGrossSalary()
	{
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary)
	{
		this.grossSalary = grossSalary;
	}
	public String toString()
	{
		return empId+" , "+empName+" , "+basicSalary;
	}

}
