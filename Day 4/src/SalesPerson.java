public class SalesPerson extends Emp{
	double incentives, sales;
	public SalesPerson(int empId, String empName, double basicSalary, double sales) {
		super(empId, empName, basicSalary);
		this.sales = sales;
	}
	public double getIncentives()
	{
		return incentives;
	}
	public void setIncentives(double incentives)
	{
		this.incentives=incentives;
	}
	public String toString()
	{
		return super.toString()+" "+this.incentives;
	}
	
}
