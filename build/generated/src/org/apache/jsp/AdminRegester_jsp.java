package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminRegester_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    function myFunction() {\n");
      out.write("  var x = document.getElementById(\"myInput\");\n");
      out.write("  if (x.type === \"password\") {\n");
      out.write("    x.type = \"text\";\n");
      out.write("  } else {\n");
      out.write("    x.type = \"password\";\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    function mytext(){\n");
      out.write("  var y=document.getElementById(\"id\").value;\n");
      out.write("       if(y==\"\"){\n");
      out.write("          document.getElementById(\"msg\").innerHTML=\"** please enter id number\";\n");
      out.write("          return;\n");
      out.write("       }\n");
      out.write("       if(isNaN(y)){\n");
      out.write("           document.getElementById(\"msg\").innerHTML=\"** only digit number allowed\";\n");
      out.write("           return;\n");
      out.write("       }\n");
      out.write("       if(y.length<4){\n");
      out.write("           document.getElementById(\"msg\").innerHTML=\"** id number must be 4 digit\";\n");
      out.write("           return;\n");
      out.write("       }\n");
      out.write("       else{\n");
      out.write("           document.getElementById(\"msg\").innerHTML=\"\";\n");
      out.write("       }\n");
      out.write("   }\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("     function mynumber(){\n");
      out.write("         var z=document.getElementById(\"mobilenum\").value;\n");
      out.write("         if(z==\"\"){\n");
      out.write("             document.getElementById(\"msg1\").innerHTML=\"** please enter mobile number\";\n");
      out.write("             return;\n");
      out.write("         }\n");
      out.write("         if(isNaN(z)){\n");
      out.write("           document.getElementById(\"msg1\").innerHTML=\"** only digit number allowed\";\n");
      out.write("           return;\n");
      out.write("         }\n");
      out.write("         if(z.length<10){\n");
      out.write("           document.getElementById(\"msg1\").innerHTML=\"** mobile number must be 10 digit\";\n");
      out.write("           return;\n");
      out.write("       }\n");
      out.write("       if(z.length>10){\n");
      out.write("           document.getElementById(\"msg1\").innerHTML=\"** mobile number must be 10 digit\";\n");
      out.write("           return;\n");
      out.write("       }\n");
      out.write("       if(z.charAt(0)!=9 && z.charAt(0)!=8 && z.charAt(0)!=7){\n");
      out.write("           document.getElementById(\"msg1\").innerHTML=\"** mobile number start with only 9,8,7\";\n");
      out.write("           return;\n");
      out.write("       }\n");
      out.write("       else{\n");
      out.write("           document.getElementById(\"msg1\").innerHTML=\"\";\n");
      out.write("       }\n");
      out.write("     }\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    function myemail(){\n");
      out.write("        var mail=document.getElementById(\"emailid\").value;\n");
      out.write("        var mail_pattern=/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\n");
      out.write("       if(mail==\"\")\n");
      out.write("       {\n");
      out.write("        document.getElementById(\"msg2\").innerHTML='Enter Your E-MailID';\n");
      out.write("        return;\n");
      out.write("       }\n");
      out.write("       if(mail_pattern.test(mail)==false)\n");
      out.write("       {\n");
      out.write("        document.getElementById(\"msg2\").innerHTML='Enter a Valid E-Mail Id';\n");
      out.write("        return;\n");
      out.write("       }\n");
      out.write("      else\n");
      out.write("      {\n");
      out.write("       document.getElementById('mesg_mail').innerHTML=\"\";\n");
      out.write("      } \n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Register Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"\" method=\"post\" style=\"background-image:url(wall.jpg);background-size: cover\">\n");
      out.write("            <table align=\"center\" style=\"background-color:pink\">\n");
      out.write("                <tr>\n");
      out.write("                    <th><b>Enter the id number</b></th>\n");
      out.write("                    <td><input type=\"text\" name=\"id\" id=\"id\"  placeholder=\"Id number\" style=\"width: 250px; padding: 10px\"><span id=\"msg\" style=\"color: red\"></span></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><b>Enter the Username </b></th>\n");
      out.write("                    <td><input type=\"text\" name=\"txtname\" required=\"please enter username\" placeholder=\"Username name\" style=\"width: 250px; padding: 10px\"></td><br><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><b>Enter the password :</b></th>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" required=\"please enter the password\" id=\"myInput\" placeholder=\"password\" style=\"width: 250px; padding: 10px\"> \n");
      out.write("                        <input type=\"checkbox\" onclick=\"myFunction()\">Show Password</td><br><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><b>Enter the address :</b></th>\n");
      out.write("                    <td><input type=\"text\" name=\"txtadd\" required=\"enter address\" placeholder=\"address\" style=\"width: 250px; padding: 10px\"></td><br><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><b>Enter the mobile number:</b></th>\n");
      out.write("                    <td><input type=\"text\" name=\"txtmobilenum\" id=\"mobilenum\" placeholder=\"enter mobile number\" style=\"width: 250px; padding: 10px\"><span id=\"msg1\" style=\"color: red\"></span></td><br><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><b>Enter the your email id:</b></th>\n");
      out.write("                    <td><input type=\"text\" name=\"txtemail\" id=\"emailid\" required=\"enter email\" placeholder=\"email id\" style=\"width: 250px; padding: 10px\"><span id=\"msg2\" style=\"color: red\"></span></td><br><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><b>Gender:</b></th>\n");
      out.write("                    <th><input type=\"radio\" name=\"gender\" value=\"Male\" required=\"\">Male</th>\n");
      out.write("                    <th><input type=\"radio\" name=\"gender\" value=\"Female\" required=\"\">Female</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><input type=\"submit\" name=\"btnsubmit\" value=\"Submit\" style=\"width: 250px; padding: 10px;text-align: center;color:blue;background-color:black;font-size:20px;font:bold \" onclick=\"mytext(),mynumber(),myemail()\"></th>\n");
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
