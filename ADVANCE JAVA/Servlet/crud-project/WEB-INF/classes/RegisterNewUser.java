// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterNewUser extends HttpServlet {
   public void doGet(HttpServletRequest var1, HttpServletResponse var2) throws IOException, ServletException {
      PrintWriter var3 = var2.getWriter();
      String var4 = var1.getParameter("uname");
      String var5 = var1.getParameter("upass");
      String var6 = var1.getParameter("ucontact");
      var3.println("<html><body>");
      var3.println("<html><body>");

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection var7 = DriverManager.getConnection("jdbc:mysql:///advjava", "root", "root");
         Statement var8 = var7.createStatement();
         var8.executeUpdate("insert into registration values('" + var4 + "','" + var5 + "','" + var6 + "')");
         var7.close();
      } catch (Exception var9) {
         var3.println(var9);
      }

      var2.sendRedirect("login.html");
      var3.println("</body></html>");
      var3.close();
   }
}
