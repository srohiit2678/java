import java.io.*;
import java.sql.*;

class FileOutput01
{
	public static void main(String[] args){
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
	PreparedStatement st = con.prepareStatement("select * from login2");
	
	ResultSet rs = st.executeQuery();
	// file Process
	if(rs.next())
	{
		String s = rs.getString(1);
		Blob b1 = rs.getBlob(2);
		byte []b = b1.getBytes(1,(int)b1.length());
		FileOutputStream fi = new  FileOutputStream("s43.png");
		fi.write(b);
		fi.close();
		System.out.println(s);
	}
	con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}