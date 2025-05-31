// program to read from a file
import java.io.*;

class ReadFile
{
	public static void main(String[] args)
	{
		//try
		{
		FileInputStream f1 = new FileInputStream("file.txt");
		int i = f1.read();// -1 if file ends
		while(i!=-1)
		{
			System.out.print((char)i);
			i = f1.read();
		}
		}
		//catch(Exception e)
		{
		//	e.printStackTrace();
		}
	}
}