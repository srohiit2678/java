import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class JDBC4
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava?useSSL=false","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from login");
			while(rs.next())
			{
				
				System.out.print(rs.getString(1)+"  "+rs.getString(2));
				
				System.out.println();
				
			}
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}	
	}
} 

