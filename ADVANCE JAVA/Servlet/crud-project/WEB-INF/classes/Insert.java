import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Insert extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		PrintWriter out = response.getWriter();
		String uroll = request.getParameter("uroll");
		String uname = request.getParameter("uname");
		String uphysics = request.getParameter("uphysics");
		String uchemistry = request.getParameter("uchemistry");
		String umath = request.getParameter("umath");
		
		out.println("<html><body>");
		
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///advjava","root","root");	
		Statement st = con.createStatement();
		st.executeUpdate("insert into Student values ('"+uroll+"','"+uname+"','"+uphysics+"','"+uchemistry+"','"+umath+"')");
		con.close();	
	}
	catch(Exception e)
	{
		out.println(e);
	}
	response.sendRedirect("ShowAll");
	out.println("</html></body>");
	out.close();
	}
}
