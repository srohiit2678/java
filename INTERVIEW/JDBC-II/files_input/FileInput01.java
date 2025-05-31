import java.io.*;
import java.sql.*;

class FileInput01
{
	public static void main(String[] args){
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:///explorehub","root","root");
	PreparedStatement st = con.prepareStatement("insert into files ( project_id, file_data, file_name, file_type, uploaded_at) values(?,?,?,?,now())");
	
	// file_id, project_id, file_data, file_name, file_type, uploaded_at
	
	
	
	// file Process
	File f = new File("AIchatbotimg5.jpg");
	FileInputStream fi = new  FileInputStream(f);
	st.setInt(1,1);
	st.setBlob(2,fi);
	st.setString(3,"AIchatbotimg5.jpg");
	st.setString(4,"image/jpg");
	
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