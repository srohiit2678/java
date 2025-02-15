// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;;

public class LoginUser extends HttpServlet {
   public LoginUser() {
   }

   public void doGet(HttpServletRequest var1, HttpServletResponse var2) throws IOException, ServletException {
      PrintWriter var3 = var2.getWriter();
      String var4 = var1.getParameter("uname");
      String var5 = var1.getParameter("upass");
      var3.println("<html><body>");

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection var6 = DriverManager.getConnection("jdbc:mysql:///advjava", "root", "root");
         Statement var7 = var6.createStatement();
         ResultSet var8 = var7.executeQuery("select * from registration where uname='" + var4 + "' and upass='" + var5 + "'");
         if (var8.next()) {
            var2.sendRedirect("MenuPage.html");
         } else {
            var3.println("<center>Invalide User Name Or Password</center>");
         }

         var6.close();
      } catch (Exception var9) {
         var3.println(var9);
      }

      var3.println("</body></html>");
      var3.close();
   }
}
