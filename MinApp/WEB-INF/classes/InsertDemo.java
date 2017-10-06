import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Insert")
public class InsertDemo extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
	int rs=0;
try
{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
pw.println("<html><form  action='/insert' target='dispaly'>");
int sid=Integer.parseInt(req.getParameter("stu_id"));
String sname=req.getParameter("stu_name");
String sadd =req.getParameter("stu_add");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
System.out.println("connection");
PreparedStatement ps=con.prepareStatement("insert into student_info values(?,?,?)");
ps.setInt(1,sid);
ps.setString(2,sname);
ps.setString(3,sadd);
rs=ps.executeUpdate();
if(rs!=1)

pw.println("<h2>Record is Problem");
else

pw.println("<h2 style='position:absolute;left=50;top=50'>Record inserted Successfull");
ps.close();
con.close();

}
catch(Exception e)
{
e.printStackTrace();
}
}
public void doGet(HttpServletRequest req,HttpServletResponse res)
{
try
{
doPost(req,res);
}
catch(Exception e)
{
e.printStackTrace();

}
}

}

