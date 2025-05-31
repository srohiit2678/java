import java.sql.*;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

class JDBC01
{
	public static void main(String [] ar)
	{
		try
		{
			MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
			ds.setURL("jdbc:mysql:///advjava");
			ds.setUser("root");
			ds.setPassword("root");
			Connection con = ds.getConnection();
			Statement st = con.createStatement();
				ResultSet rs =st.executeQuery("select * from login");
				while(rs.next())
				{
					System.out.println(rs.getString(1));
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}