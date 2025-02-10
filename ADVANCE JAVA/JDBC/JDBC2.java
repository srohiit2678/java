import java.sql.*;

class JDBC2
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql:///advjava";
		String uname = "root";
		String pass = "root";
		Connection cn = DriverManager.getConnection(url,uname,pass);
		
		Statement st = cn.createStatement();
		
		String query = "select * from login";
		ResultSet rs = st.executeQuery(query);
		
		System.out.println("name\tpass");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		cn.close();
	}
}