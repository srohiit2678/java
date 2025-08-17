import java.io.*;
import java.sql.*;

class FileOutput03
{
	public static void main(String[] args){
	try
	{
	//Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
	PreparedStatement st = con.prepareStatement("select * from login4");
	
	ResultSet rs = st.executeQuery();
	// file Process
	if(rs.next())
	{
		String s = rs.getString(1);
		Clob c = rs.getClob(2);
//		System.out.println((int)c.length());//861
		System.out.print(c.getSubString(1,400));//400
		System.out.print(c.getSubString(400,200));//400+200 = 600
		System.out.print(c.getSubString(600,200));//600+200 = 800
		System.out.print(c.getSubString(800,61));//600+200 = 861
		
		
		
	}
	con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}