package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InstructionPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("    header{\n");
      out.write("        width: 1350px;\n");
      out.write("        height: 200px;\n");
      out.write("        margin: auto;\n");
      out.write("        margin: auto;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>instruction Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:url(wall.jpg);background-size:cover\">\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("           <div class=\"header\">\n");
      out.write("               <img src=\"flower.jpg\" width=\"1350px\" height=\"200px\">\n");
      out.write("               <h1 style=\"background-color:darkorange;font-size:40px;text-align: center\">Student Instruction Before Exam</h1>\n");
      out.write("               <h3>During the exam:</h3>\n");
      out.write("               <p style=\"color: red;font-size: 20px\">\n");
      out.write("                   This is multiple system quize to test your knowledge.<br>\n");
      out.write("                   you will get 10 minute for this test.\n");
      out.write("               </p>\n");
      out.write("               <input style=\"background: black;color:red\" type=\"submit\" value=\"Star the Exam\">\n");
      out.write("           </div>\n");
      out.write("            \n");
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
