import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException
	{
		File f=new File("a.txt");
		FileReader fr=new FileReader(f);
		int i;
		while ((i = fr.read()) != -1)
		{
			System.out.println((char)i);
		}
		fr.close();
	}

}
