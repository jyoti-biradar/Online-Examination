package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Addquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Question Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"http://localhost:8080/OnlineExam/questionAdd\" method=\"post\">\n");
      out.write("            <table align=\"center\" style=\"background-color:yellow\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter the Question Number:</td>\n");
      out.write("                    <th><input style=\"padding:10px;width:200px\" type=\"text\" placeholder=\"Enter number\" name=\"txtquenum\"></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Write the Question Here:</td>\n");
      out.write("                    <th><input style=\"padding:15px;width:300px\" type=\"text\" placeholder=\"Write Question\" name=\"txtque\"></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Write Option one</td>\n");
      out.write("                    <th><input style=\"padding:15px;width:300px\" type=\"text\" placeholder=\"option 1\" name=\"option1\"></th>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Write Option two</td>\n");
      out.write("                    <th><input style=\"padding:15px;width:300px\" type=\"text\" placeholder=\"option 2\" name=\"option2\"></th>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Write Option three</td>\n");
      out.write("                    <th><input style=\"padding:15px;width:300px\" type=\"text\" placeholder=\"option 3\" name=\"option3\"></th>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Write Option four</td>\n");
      out.write("                    <th><input style=\"padding:15px;width:300px\" type=\"text\" placeholder=\"option 4\" name=\"option4\"></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Write correct option</td>\n");
      out.write("                    <th><input style=\"padding:10px;width:200px\" type=\"text\" placeholder=\"write option number\" name=\"choose\"></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input style=\"border: 2px solid red;width:100px;height:50px;border-radius: 25px;\" type=\"submit\" value=\"Add Question\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
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
