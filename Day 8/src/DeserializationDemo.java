import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) throws Exception
	{
		File f=new File("student.dat");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream in=new ObjectInputStream(fis);
		Student s=(Student)in.readObject();
		System.out.println(s);
	}

}
