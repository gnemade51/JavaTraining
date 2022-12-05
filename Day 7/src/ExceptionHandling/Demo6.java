package ExceptionHandling;

public class Demo6 {
	public static void calculateSalary(double basicSalary) throws SalaryException
	{
		double grossSalary=basicSalary;
		if (grossSalary<9000)
		{
			try
			{
				throw new SalaryException();
			}
			catch (SalaryException e)
			{
				//System.out.println(e);
				System.err.println(e);
			}
		}
		
	}
	public static void main(String[] args)
	{
		try {
			calculateSalary(10000);
		} catch (SalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
