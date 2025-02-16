import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Servlet2 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		
		PrintWriter out = res.getWriter();
			  String s1 = req.getParameter("un");
			  String s2 = req.getParameter("up");
		int n=0;
		out.println("<html><body>");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///advjava1","root","root");
			Statement st = con.createStatement();
			n = st.executeUpdate("insert into login values('"+s1+"','"+s2+"')");
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);	
		}		
		
		out.println("<h1>Name = "+s1+"</h1><h1>pass = "+s2+"</h1>");
		if(n!=0)
		{
			out.println("<h1>Data inserted</h1></body></html>");			
		}
		out.close();

	}
}
