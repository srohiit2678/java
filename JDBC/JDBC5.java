import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class JDBC5
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava?useSSL=false","root","root");
			PreparedStatement st = con.prepareStatement("insert into login values(?,?)");
			st.setString(1,"aaa");
			st.setString(2,"111");
			st.addBatch();

			st.setString(1,"bbb");
			st.setString(2,"222");
			st.addBatch();
			
    		st.setString(1,"ccc");
			st.setString(2,"333");
			st.addBatch();

			st.setString(1,"ddd");
			st.setString(2,"444");
			st.addBatch();
			int x[] = st.executeBatch();
			
			
			for(int x1:x)
			{
				
				//System.out.print(rs.getString(1)+"  "+rs.getString(2));
				
				System.out.println(x1);
				
			}
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}	
	}
} 

