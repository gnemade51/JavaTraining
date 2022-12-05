import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerializable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"Gaurav",30000);
		Employee e2=new Employee(102,"Rutu",40000);
		Employee e3=new Employee(103,"Sru",10000);
		File f=new File("employee.dat");
		FileOutputStream fout=new FileOutputStream(f);
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(e1);
		out.writeObject(e2);
		out.writeObject(e3);
		System.out.println("Object is Serialized");
	}
	

}
