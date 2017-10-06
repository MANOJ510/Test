import java.sql.*;
import java.io.*;
public class UpdateTest{
public static void main(String args[])throws Exception
{
/*Scanner sc =new Scanner(System.in);
System.out.println("enter Student number");
int num=sc.next();

System.out.println("enter Student name");

String name=sc.next();
System.out.println("enter Student address");
sc.next();*/
String driverName = "oracle.jdbc.driver.OracleDriver";
Class.forName(driverName);
//Class.forName("oracle.jdbc.driver.OracleDriver");


Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select empno,ename,job from emp");
while(rs.next()!=false)
{
	

System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
 
rs.close();



	
}
}

