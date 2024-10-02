/*
-------- JDBC -------------
-> import package
-> Load and Register the Driver
-> Opening database connection to MySql server
-> getting Statement object to execute query
-> execute query
-> close connection
===========================================================
	1.import package 
		-> import java.sql.*;
	
===========================================================
	2.Load and Register the Driver
		-> Class.forName("com.mysql.cj.jdbc.Driver");
	
===========================================================
	3.Opening database connection to MySql server
		->  String db_url ="jdbc:mysql://localhost:3306/RDB?useSSL=false";
		->  String db_uname ="root";
		->  String db_upass ="root";
		->  Connection con= DriverManager.getConnection(db_url,db_uname,db_upass);

===========================================================
	4.getting Statement object to execute query
		->	Statement st = con.createStatement();

===========================================================	
    5.execute query
	    -> String q = "insert into login(uname,upass) values('swt',258)";
		-> st.executeUpate(q);

===========================================================
	6.close connection
		-> con.close();
===========================================================
 --> for temprary class path set 
set classpath=C:\Users\Rohit\OneDrive\Desktop\java\JDBC\mysql-connector-j-8.1.0.jar;.;%classpath%
*/

// 1.import package
import java.sql.*;

 class Jdbc2 {
 public static void main(String []args){
	 String s1 ="hhhh";
	 String s2 ="8888";
  try{
	  //	2.Load and Register the Driver
	     Class.forName("com.mysql.cj.jdbc.Driver");
		              //"com.mysql.jdbc.Driver"    
	  
	  //    3.Opening database connection to MySql server
	     String db_url ="jdbc:mysql://localhost:3306/RDB?useSSL=false&allowPublicKeyRetrieval=true";
		 String db_uname ="root";
		 String db_upass ="root";
		 Connection con = DriverManager.getConnection(db_url,db_uname,db_upass);
     
	  //    4.getting Statement object to execute query
		 Statement st = con.createStatement();
	  
	  //    5.execute query
	     String q = "insert into login(uname,upass) values('"+s1+"','"+s2+"')";
		 // String q = "insert into login values('swt',258)";
		 st.executeUpdate(q);	
		System.out.println("data insert....");
	  //    6.close connection
		 con.close();
  
  }
  catch(Exception e){
	  System.out.println(e);
  }
 }
}