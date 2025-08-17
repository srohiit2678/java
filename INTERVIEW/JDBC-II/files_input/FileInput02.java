import java.io.*;
import java.sql.*;

class FileInput02
{
	public static void main(String[] args){
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
	PreparedStatement st = con.prepareStatement("insert into login3 values(?, ?)");
	
	// file Process
	File f = new File("vid.mp4");
	FileInputStream fi = new  FileInputStream(f);
	st.setString(1,"aaa");
	st.setBlob(2,fi);
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