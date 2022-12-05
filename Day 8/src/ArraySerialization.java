import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArraySerialization {
	public static void main(String[] args) throws IOException
	{
		int[] array= {20,10};
		//creation of reference
		File f=new File("array.dat");
		//Opening in a file in write mode to write bytes
		FileOutputStream fout=new FileOutputStream(f);
		//writing object to file
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(array);
		System.out.println("Object is Serialized");
	}

}
