package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<script>\n");
      out.write("    function mypass(){\n");
      out.write("        var x = document.getElementById(\"myInput\");\n");
      out.write("       if (x.type === \"password\") {\n");
      out.write("           x.type = \"text\";\n");
      out.write("       } else {\n");
      out.write("           x.type = \"password\";\n");
      out.write("              }\n");
      out.write("      }\n");
      out.write("</script>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:url(wall.jpg);background-size: cover\">\n");
      out.write("        <form action=\"http://localhost:8080/OnlineExam/Adminlogin\" method=\"post\" style=\"text-align: center\">\n");
      out.write("        <table align=\"center\" style=\"background-color:yellow\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Enter the username:</td>\n");
      out.write("                <th><input style=\"padding:10px;width:200px\" type=\"text\" name=\"txtname\" placeholder=\"enter username\" required=\"\"></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Enter the password:</td>\n");
      out.write("                <th><input style=\"padding:10px;width:200px\" type=\"password\" name=\"txtpass\" placeholder=\"Enter password\" required=\"\"></th>\n");
      out.write("                <td><input type=\"checkbox\" onclick=\"mypass()\" style=\"font-size:20px;color:yellow;font:bold\">Show Password</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input style=\"border: 2px solid red;width:100px;height:50px;border-radius: 25px;\" type=\"submit\" value=\"login\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>you don't have Account</td>\n");
      out.write("                <th><a style=\"color:red\" href=\"AdminRegester.jsp\"><b>Register Here</b></a></th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
