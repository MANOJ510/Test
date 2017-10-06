import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class TestSrv2 extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter pw=res.getWriter();

res.setContentType("text/html");

//resd form1 data
String pname=req.getParameter("hname");
String pfname=req.getParameter("hfname");
String pms=req.getParameter("hms");

//read form2 data
String f2val1=req.getParameter("f2t1");
String f2val2=req.getParameter("f2t2");

//write form1,form2 values to DB
try{
Class.forName("oracle.jdbc.driver.Oracledriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
PreparedStatement ps=con.prepareStatement("insert into person_tab values(?,?,?,?,?)");
ps.setString(1,pname);
ps.setString(2,pfname);
ps.setString(3,pms);
ps.setString(4,f2val1);
ps.setString(5,f2val2);

ps.executeUpdate();

pw.println("<br>Record Inserted<br>");


}
catch(Exception e)
{
e.printStackTrace();

}
pw.println("<br>form1 data is"+pname+" ..."+pfname+"..."+pms+"");
pw.println("<br>form2 data is:"+f2val1+"...."+f2val1+"");
pw.close();
}
}
