
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class VoterSrv extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
//get printwriters
PrintWriter pw=res.getWriter();

//set responce
res.setContentType("text/html");

//read component values from package

String name=req.getParameter("tname");

String tags=req.getParameter("tage");

int age=Integer.parseInt(tags);

if(age>18)

	pw.println("<font color ='green'><h3>"+name+"Your are Eligible");
	else
		pw.println("<font color ='red'><h3>"+name+"Your are  not Eligible");

  // pw.println("<a href='http://localhost:8080/VoterApp/Input.html'><img src='manoj.jpg'></a>");
   
   pw.close();
}

   }