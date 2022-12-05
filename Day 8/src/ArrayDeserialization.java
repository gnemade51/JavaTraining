import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ArrayDeserialization {
	public static void main(String[] args) throws Exception
	{
		File f=new File("array.dat");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream in=new ObjectInputStream(fis);
		int[] s=(int[])in.readObject();
		for(int value:s)
			System.out.println(value);
	}

}
