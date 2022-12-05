
public class EmpApp {
	public static void main(String[] args)
	{
		Developer sp1=new Developer(101,"abc",23000);
		Utility.calculateSalary(sp1);
		System.out.println(sp1+" , "+sp1.getGrossSalary());
		SalesPerson sp2=new SalesPerson(102,"dac",15000,50000);
		Utility.calculateSalary(sp2);
		System.out.println(sp2+" , "+sp2.getGrossSalary());
	}

}
