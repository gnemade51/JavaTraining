package ExceptionHandling;

public class Assign2 {
	public static void main(String[] args)
	{
		int[] data=new int[2];
		
		try
		{
			data[0]=Integer.parseInt(args[0]);
			data[1]=Integer.parseInt(args[1]);
			int div=data[0]/data[1];
			System.out.println("Division = "+div);
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("Check the index numbers of array");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Second argument must be non zero");
		}
		catch(NumberFormatException nf)
		{
			System.out.println("Please enter only numbers as arguments");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}
