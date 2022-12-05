import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read1 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x,y;
		System.out.println("Enter 2 nos: ");
		x = Integer.parseInt(reader.readLine()); //convert string to integer
		y = Integer.parseInt(reader.readLine());
		int ans=x+y;
		//Printing the read line
		System.out.println("Addition = "+ans);
	}

}
