import java.sql.*;

class JDBC02
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
			CallableStatement p = con.prepareCall("{call cube2(?)}");
			p.setInt(1,5);
			p.execute();
			System.out.println(p.getInt(1));
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}  