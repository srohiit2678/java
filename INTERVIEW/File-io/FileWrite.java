// program to write data in file
import java.io.*;

class FileWrite
{
	public static void main(String[] args)
	{
		try
		{
		FileOutputStream f1 = new FileOutputStream("file.txt");
		FileOutputStream f2 = new FileOutputStream("file.txt", true);// true for inserting next to previous stored data whithout overeride privous stored data
		
		String s1 = "My Name Is Rohit Kumar Ojha. ";
		String s2 = "I Study In SoftWaves";
		
		for(int i=0;i<s1.length();i++)
		{
			f1.write(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++)
		{
			f2.write(s2.charAt(i));
		}
		System.out.println("Data Inserted...");
		f1.close(); f2.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}