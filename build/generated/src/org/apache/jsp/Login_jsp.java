package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:url(wall.jpg);background-size: cover\">\n");
      out.write("        <header style=\"font-size:20px;padding:20px;background: yellow;color:red;\"><marquee><h2>Welcome To Online Examination</h2></marquee></header>\n");
      out.write("        <div style=\"width:400px;margin: 10% 0 0;margin: auto;height:565px\">\n");
      out.write("            <form action=\"http://localhost:8080/OnlineExam/login\" method=\"post\" style=\"position: relative;z-index: 1;background-image:url(shadow.jpg) ;max-width: 400px;margin: 0 auto 100px;padding: 45px;text-align: center\">\n");
      out.write("                <img src=\"login.jpg\" style=\"border-radius:50%;height: 100px;width:100px;\">\n");
      out.write("                <p style=\"font-size:20px;color:yellow;font:bold\">Enter Student Name:</p>\n");
      out.write("                <input style=\"padding:10px;width:200px\" type=\"text\" name=\"txtname\" placeholder=\"Student Name\" required=\"\">\n");
      out.write("                \n");
      out.write("                <p style=\"font-size:20px;color:yellow;font:bold\">Enter Student Password:</p>\n");
      out.write("                <input style=\"padding:10px;width:200px\" type=\"password\" id=\"myInput\" name=\"txtpass\" placeholder=\"Student Password\" required=\"\"><br>\n");
      out.write("                <input type=\"checkbox\" onclick=\"mypass()\" style=\"font-size:20px;color:yellow;font:bold\">Show Password<br><br>\n");
      out.write("                <input style=\"border: 2px solid red;width:100px;height:50px;border-radius: 25px;\" type=\"submit\" value=\"Login\"><br>\n");
      out.write("                <p style=\"font-size:20px;color:yellow;font:bold\">you don't have Account--</p>\n");
      out.write("                <a style=\"color:red\" href=\"RegesterForm.jsp\"><b>Register Here</b></a><br>\n");
      out.write("                <a style=\"color: red\" href=\"Adminlogin.jsp\"><b>Go To Admin Login Page</b></a>\n");
      out.write("            </form>\n");
      out.write("         </div>\n");
      out.write("        <footer style=\"font-size:20px;padding:20px;background: yellow;color:red;\">\n");
      out.write("            <marquee><h2>Welcome To Online Examination</h2></marquee></footer>\n");
      out.write("     </body>\n");
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
