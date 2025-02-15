import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowAll extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		PrintWriter out = response.getWriter();
		out.println("<html><head><link rel='stylesheet' href='style.css'/></head><body>");
		out.println("<div id='menu'><ul><li>Home</li><li><a href='Insert.html'>Insert</a></li><li><a href='Search.html'>Search</a></li><li><a href='Update.html'>Update</a></li><li><a href='ShowAll'>ShowAll</a></li><li><a href='Delete.html'>Delete</a></li><li><a href='login.html'>LogOut</a></li></ul></div>");
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");	
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
	
		out.println("<div id='data'><center><table cellpadding ='12'>");
		out.println("<tr><th>Roll</th><th>Name</th><th>Physics</th><th>Chemistry</th><th>Math</th></tr>");	
		
		while(rs.next())
		{
		out.println("<tr><th>"+rs.getString(1)+"</th><th>"+rs.getString(2)+"</th><th>"+rs.getString(3)+"</th><th>"+rs.getString(4)+"</th><th>"+rs.getString(5)+"</th></tr>");	
		}
		out.println("</table></center></div></body></html>");
		
		con.close();	
	}
	catch(Exception e)
	{
		out.println(e);
	}
	out.println("</html></body>");
	out.close();
	}
}
