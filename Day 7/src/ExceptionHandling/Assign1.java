package ExceptionHandling;

public class Assign1 {
	public static void main(String[] args)
	{
		int[] data = {30,3};
		try
		{
			int ans=data[0]/data[1];
			System.out.println(ans);
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("Index numbers are not in range");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Second element in array must be non zero");
		}
	}

}
