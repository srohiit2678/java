import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterNewUser extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      PrintWriter out = response.getWriter();
      String uname = request.getParameter("uname");
      String upass = request.getParameter("upass");
      String ucontact = request.getParameter("ucontact");
      out.println("<html><body>");
      out.println("<html><body>");

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql:///advjava?useSSL=false", "root", "root");
         Statement st = con.createStatement();
         st.executeUpdate("insert into registration values('" + uname + "','" + upass + "','" + ucontact + "')");
         con.close();
      } catch (Exception e) {
         out.println(e);
      }
      response.sendRedirect("login.html");
      out.println("</body></html>");
      out.close();
   }
}
