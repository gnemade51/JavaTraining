public class Utility {
	static double da=0.04, hra=0.08;
	public static void calculateSalary(Object o)
	{
		if(o instanceof Developer)
		{
			Developer d = (Developer) o;
			double grossSalary = d.basicSalary+(d.basicSalary*da)+(d.basicSalary*hra);
			d.setGrossSalary(grossSalary);
		}
		else
		{
			SalesPerson d = (SalesPerson) o;
			double grossSalary = d.basicSalary+(d.basicSalary*da)+(d.basicSalary*hra)+calculateIncentives(d);
			d.setGrossSalary(grossSalary);
		}
	}
	public static double calculateIncentives(SalesPerson sp)
	{
		double incentives=sp.sales*0.10;
		sp.setIncentives(incentives);
		return incentives;
	}
}
