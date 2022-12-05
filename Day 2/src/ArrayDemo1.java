
public class ArrayDemo1 {
	static int i, j, temp, flag=0;
	public static void sort(int[] myarray)
	{
		for(int j=0;j<myarray.length;j++)
		{
			for(int i=0;i<myarray.length-1;i++)
			{
				if(myarray[i]>myarray[i+1])
				{
					temp = myarray[i+1];
					myarray[i+1] = myarray[i];
					myarray[i] = temp;
				}
			}
		}
	}
	public static void search(int[] myarray, int value)
	{
		for(int j=0;j<myarray.length;j++)
		{
			if(myarray[j]==value)
			{
				flag=1;
			}
		}
		if (flag==1)
		{
			System.out.println("Value is Present.");
		}
		else
		{
			System.out.println("Value is Not Present.");
		}
	}
	public static void replace(int[] myarray, int val1, int val2)
	{
		for(int j=0;j<myarray.length;j++)
		{
			if(myarray[j]==val1)
			{
				myarray[j]=val2;
			}
		}
	}
	
	public static void display(int[] myarray)
	{
		for(int i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		}
	}
	public static void main(String[] args)
	{
		int[] data = {34,4,54,23,54,56};
		display(data);
		System.out.println("");
		sort(data);
		display(data);
		System.out.println("");
		search(data, 23);
		System.out.println("");
		replace(data, 23, 12);
		display(data);
	}

}
