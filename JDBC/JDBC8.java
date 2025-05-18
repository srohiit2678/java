import java.sql.*;
import java.util.*;

class JDBC8
{
public static void main(String[] ars)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root");
PreparedStatement st = con.prepareStatement("insert into login values(?,?)");//exe

//st.addBatch();//

st.addBatch("delete from login");//4
st.addBatch("insert into login values('ccc','333')");//1
st.addBatch("insert into login values('ddd','444')");//1
st.addBatch("insert into login values('eee','555')");//1
st.addBatch("update login set pass='11' where name='aaa'");//0

int x[] = st.executeBatch();

for(int x1:x)
{
	System.out.println(x1);
}

con.close();
st.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}