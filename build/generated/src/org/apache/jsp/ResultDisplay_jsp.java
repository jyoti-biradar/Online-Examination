package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;

public final class ResultDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

int count  = 0;
out.println("YOU FINISHED YOUR ONLINE EXAM"+"<br>");
//out.println(request.getParameter("a")+'='+request.getParameter("ans_a")+"<br>");
try{
if( request.getParameter("a").equals(request.getParameter("ans_a"))){
    count++;
}
}catch(Exception e){
    
}
//out.println(request.getParameter("b")+'='+request.getParameter("ans_b")+"<br>");
try{
if( request.getParameter("b").equals(request.getParameter("ans_b"))){
    count++;
}
}catch(Exception e){
    
}
//out.println(request.getParameter("c")+'='+request.getParameter("ans_c")+"<br>");
try{
if( request.getParameter("c").equals(request.getParameter("ans_c"))){
    count++;
}
}catch(Exception e){
    
}
//out.println(request.getParameter("d")+'='+request.getParameter("ans_d")+"<br>");
try{
if( request.getParameter("d").equals(request.getParameter("ans_d"))){
    count++;
}
}catch(Exception e){
    
}
//out.println(request.getParameter("e")+'='+request.getParameter("ans_e")+"<br>");
try{
if( request.getParameter("e").equals(request.getParameter("ans_e"))){
    count++;
}
}catch(Exception e){
    
}
try{
HttpSession httpSession = request.getSession();
String id=httpSession.getAttribute("txtid").toString();
String nam = httpSession.getAttribute("txtname").toString();

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
LocalDateTime now = LocalDateTime.now();
out.println(dtf.format(now)+"<br>");
out.println(count);

try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    Statement statement=con.createStatement();
    int a=statement.executeUpdate("insert into result(stud_id,Name,Total_mark,Date) values('"+id+"','"+nam+"','"+count+"','"+dtf.format(now)+"')");
           
}catch(Exception e){
    out.println(e);
}
}catch(Exception e){
    out.println("userid invalid");
}

      out.write("\n");
      out.write(" \n");
      out.write("<a style=\"font:Bold;color:red;font-size: 20px;background-color:blue;\" href=\"index.jsp\">Go to Login Page</a>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
