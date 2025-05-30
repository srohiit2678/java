import java.sql.*;

class Function01
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");
			CallableStatement p = con.prepareCall("{? = call cube1(?)}");
			p.setInt(2,10);
			p.execute();
			p.registerOutParameter(1,Types.INTEGER);
			System.out.println(p.getInt(1));
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}  