
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class DateSrv extends GenericServlets
{
public void service(ServletRequest req ,ServletResponse res)throws ServletException,IOException
{
PrintWriter pw=res.getWriter();
res.setContentType("text/html")
Date d=new Date();

pw.println("<i><h1>Date and time:"+d+"</i></h1>");
pw.close();
}
}
