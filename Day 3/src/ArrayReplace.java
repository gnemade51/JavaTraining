
public class ArrayReplace {
	static int i, j, k;
	public static void main(String[] args)
	{
		int[] array={2,10,8,5,10,20};
		int x=0;
		for(i=0;i<array.length;i++)
		{
			if(array[i]==10)
			{
				for(j=i;j<array.length-1;j++)
				{
					array[j]=array[j+1];
				}
				x++;
				i--;
			}
		}
		for(k=array.length-1;k>=(array.length-x);k--)
		{
			array[k]=0;
		}
		for (int l = 0; l < array.length; l++)
		{
			System.out.println(array[l]);
		}
	}
}

