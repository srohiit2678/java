import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginUser extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      PrintWriter out = response.getWriter();
      String uname = request.getParameter("uname");
      String upass = request.getParameter("upass");
      out.println("<html><body>");

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql:///advjava?useSSL=false", "root", "root");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from registration where uname='" + uname + "' and upass='" + upass + "'");
         if (rs.next()) {
            response.sendRedirect("MenuPage.html");
         } else {
            out.println("<center>Invalide User Name Or Password</center>");
         }
          con.close();
       } 
      catch (Exception e) {
         out.println(e);
      }

      out.println("</body></html>");
      out.close();
   }
}
