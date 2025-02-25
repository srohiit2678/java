import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("un");
		String s2 = request.getParameter("up");
		try
		 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql:///advjava1","root","root");
		Statement st = cn.createStatement();
		
		st.executeUpdate("insert into login values('"+s1+"','"+s2+"','12345')");
		 cn.close();}
		catch(Exception e){
			out.println(e);
		}
		out.println("<html><body><h1>data insert</h1></body></html>");
		out.close();
	}
	
}