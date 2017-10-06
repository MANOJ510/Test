import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class DeleteDemo extends HttpServlet
{


	private static final long serialVersionUID = 1L;
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	int rs=0;
try
{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
pw.println("<html><form  target='dispaly'>");
int sid=Integer.parseInt(req.getParameter("stu_id"));
//String sname=req.getParameter("stu_name");
//String sadd =req.getParameter("stu_add");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
System.out.println("connection");
PreparedStatement ps=con.prepareStatement("delete from student_info where stu_id=?");
ps.setInt(1,sid);
//ps.setString(2,sname);
//ps.setString(3,sadd);
rs=ps.executeUpdate();
if(rs!=1)

pw.println("<h2>Recordid is Problem");
else

pw.println("<h2 style='position:absolute;left=50;top=50'>Record deleted Successfull");
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

