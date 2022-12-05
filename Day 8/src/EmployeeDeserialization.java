import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("employee.dat");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream in=new ObjectInputStream(fis);
		Employee e1=(Employee)in.readObject();
		System.out.println(e1);
		Employee e2=(Employee)in.readObject();
		System.out.println(e2);
		Employee e3=(Employee)in.readObject();
		System.out.println(e3);

	}

}
