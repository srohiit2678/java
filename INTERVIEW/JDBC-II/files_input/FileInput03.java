import java.io.*;
import java.sql.*;

class FileInput03
{
	public static void main(String[] args){
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
	PreparedStatement st = con.prepareStatement("insert into login4 values(?,?)");
		
	// file Process
	File f = new File("FileInput01.java");
	FileReader fi = new  FileReader(f);
	st.setString(1,"aaa");
	st.setClob(2,fi);
	int x = st.executeUpdate();
	if(x!=0)
	{
		System.out.println("insert");
	}
	con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}