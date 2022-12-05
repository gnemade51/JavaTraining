import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException
	{
		Student s1=new Student(101,"Gaurav","9830291181");
		//creation of reference
		File f=new File("student.dat");
		//Opening in a file in write mode to write bytes
		FileOutputStream fout=new FileOutputStream(f);
		//writing object to file
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		System.out.println("Object is Serialized");
	}

}
