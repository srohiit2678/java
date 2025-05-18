import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class JDBC6
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava?useSSL=false","root","root");
			PreparedStatement st = con.prepareStatement("delete from login");

			int x = st.executeUpdate();

			System.out.println(x);
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}	
	}
} 

