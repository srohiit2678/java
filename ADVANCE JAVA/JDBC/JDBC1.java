import java.sql.*;

class JDBC1
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql:///advjava";
		String uname = "root";
		String pass = "root";
		Connection cn = DriverManager.getConnection(url,uname,pass);
		
		Statement st = cn.createStatement();
		String s1 = args[0];
		String s2 = args[1];
		
		String query = "insert into login values('"+s1+"','"+s2+"')";
		st.executeUpdate(query);
		System.out.println("Data insert...");
		cn.close();
	}
}