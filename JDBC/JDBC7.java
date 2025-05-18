import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class JDBC7
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava?useSSL=false","root","root");
			PreparedStatement st = con.prepareStatement("insert into login values(?,?)");
			//st.addBatch();//Exception
			st.addBatch("delete from login"); // 4
			st.addBatch("insert into login values('ccc','333')");//1
			st.addBatch("insert into login values('ddd','444')");//1
			st.addBatch("insert into login values('eee','555')");//1
			st.addBatch("update login set pass='11' where name='aaa'");//0
			
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

