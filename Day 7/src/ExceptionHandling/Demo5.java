package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo5 {
	public static void readFile(File f) throws FileNotFoundException
	{
		FileReader fr=new FileReader(f);
	}
	public static void main(String[] args) 
	{
	File f=new File("d:\\a.txt");
	try {
		readFile(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
