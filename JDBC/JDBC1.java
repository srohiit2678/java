import java.sql.*;


class JDBC1
{
 public static void main(String []args)
	 {   
	  
	     String db_url ="jdbc:mysql://localhost:3306/explorehub?useSSL=false";
		 String db_uname ="root";
		 String db_upass ="root";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_url,db_uname,db_upass);
			PreparedStatement st = con.prepareStatement("select * from projects where status='Approved'");
			
			ResultSet rs = st.executeQuery();
           while(rs.next())
           {
            System.out.println(rs.getInt("project_id"));
            System.out.println(rs.getString("title"));
            System.out.println(rs.getString("description"));
            System.out.println(rs.getInt("student_id"));
            System.out.println(rs.getInt("guide_id"));
            System.out.println(rs.getInt("department_id"));
            System.out.println(rs.getTimestamp("created_at"));
            System.out.println(rs.getString("project_link"));
            System.out.println(rs.getString("tech_stack"));
            System.out.println(rs.getString("enroll_id"));
		   }
		   {
			   
           // System.out.println("enroll_id");
		   }
		   
		 con.close();
		}
		  catch(Exception e){
	  System.out.println(e);
  }

	}
 }