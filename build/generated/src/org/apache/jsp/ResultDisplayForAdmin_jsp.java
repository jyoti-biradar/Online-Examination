package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class ResultDisplayForAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");

    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

      out.write("\n");
      out.write("<h2 align=\"center\"><font><strong>Result List</strong></font></h2>\n");
      out.write("<table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\">\n");
      out.write("    <tr></tr>\n");
      out.write("         <tr bgcolor=\"#A52A2A\">\n");
      out.write("            <td><b>Id</b></td>\n");
      out.write("            <td><b>stud_id</b></td>\n");
      out.write("            <td><b>Name</b></td>\n");
      out.write("            <td><b>Total_marks</b></td>\n");
      out.write("            <td><b>Date</b></td>\n");
      out.write("        </tr>\n");

    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement=con.createStatement();
    String sql="select * from result";
    resultSet=statement.executeQuery(sql);
    while(resultSet.next()){

      out.write("\n");
      out.write("<tr bgcolor=\"#DEB887\">\n");
      out.write("\n");
      out.write("            <td>");
      out.print(resultSet.getString("id") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("stud_id") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Name") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Total_mark") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Date") );
      out.write("</td>\n");
      out.write("        </tr>\n");

}
 }catch(Exception e){
        e.printStackTrace();

    }

      out.write("\n");
      out.write("</table>");
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
