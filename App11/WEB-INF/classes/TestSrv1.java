import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TestSrv1 extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter pw=res.getWriter();

res.setContentType("text/html");

//resd form data
String pname=req.getParameter("tname");
String pfname=req.getParameter("tfname");
String pms=req.getParameter("ms");


//design and send dynamic form page to browser window
//based on marriage status
if(pms.equals("single"))
{
pw.println("<form action='t2url'metod='get'>");
pw.println("why do u want to marry<input type='text' name='f2t1'><br>");
pw.println("when do u want to marry<input type='text' name='f2t2'><br>");

pw.println("<input type='hidden' name='hname' value="+pname+">");
pw.println("<input type='hidden' name='hfname' value="+pfname+">");
pw.println("<input type='hidden' name='hms' value="+pms+">");
pw.println("<input type='submit' value='submit'>");
pw.println("</form>");

}
else
{
pw.println("<form action='t2url' method='get'>");
pw.println("Spouse name :<input type='text' name='f2t1'><br>");
pw.println("no.of childrens :<input type='text' name='f2t2'<br>");


pw.println("<input type='hidden' name='hname' value="+pname+">");
pw.println("<input type='hidden' name='hfname' value="+pfname+">");
pw.println("<input type='hidden' name='hms' value="+pms+">");
pw.println("<input type='submit' value='submit'>");
pw.println("</form>");

}
pw.close();

}
}
