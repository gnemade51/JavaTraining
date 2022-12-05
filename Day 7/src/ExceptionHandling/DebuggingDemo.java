package ExceptionHandling;

public class DebuggingDemo {
	public static void main(String[] args)
	{
		int a=10,b=0;
		display(a,b);
	}
	private static void display(int a, int b)
	{
		int c=a/b;
		System.out.println(c);
	}
}
