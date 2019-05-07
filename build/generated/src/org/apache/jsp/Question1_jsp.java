package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Connection;

public final class Question1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("<div  style=\"text-align: center;background-color:blue;color: yellow;font-size: 30px;font: bold;position: fixed;height:60px;width:1500px\">\n");
      out.write("    test closes in <span id=\"time\">01:00</span> minutes!</div>\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    function startTimer(duration, display) {\n");
      out.write("    var timer = duration, minutes, seconds;\n");
      out.write("    setInterval(function () {\n");
      out.write("        minutes = parseInt(timer / 60, 10)\n");
      out.write("        seconds = parseInt(timer % 60, 10);\n");
      out.write("\n");
      out.write("        minutes = minutes < 10 ? \"0\" + minutes : minutes;\n");
      out.write("        seconds = seconds < 10 ? \"0\" + seconds : seconds;\n");
      out.write("\n");
      out.write("        display.textContent = minutes + \":\" + seconds;\n");
      out.write("\n");
      out.write("        if (--timer < 0) {\n");
      out.write("            timer = duration;\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("    }, 1000);\n");
      out.write("   }\n");
      out.write(" \n");
      out.write("window.onload = function () {\n");
      out.write("    var oneMinutes = 60*1,\n");
      out.write("        display = document.querySelector('#time');\n");
      out.write("    startTimer(oneMinutes, display);\n");
      out.write("    setTimeout(timing,60000);\n");
      out.write("   \n");
      out.write("};\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    function timing(){  \n");
      out.write("        alert(\"time out for this examination\");\n");
      out.write("        \n");
      out.write("        window.location.href=\"ResultDisplay.jsp?\";\n");
      out.write("    }\n");
      out.write("</script>\n");

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
     String g;
    String ans=" ";
    int count=0;
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    

      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");

   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement=con.createStatement();
    String sql="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=1";
    resultSet=statement.executeQuery(sql);
    while(resultSet.next()){

      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <form action=\"ResultDisplay.jsp\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("               \n");
      out.write("                <td>Question no:\n");
      out.write("                    ");
      out.print(resultSet.getString("Question_no")
                    );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td>\n");
      out.write("                   ");
      out.print(resultSet.getString("Question")
                   );
      out.write("\n");
      out.write("               </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    1: <input type=\"radio\" name=\"a\" value=\"1\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet.getString("option_1")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    2: <input type=\"radio\" name=\"a\" value=\"2\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet.getString("option_2")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    3: <input type=\"radio\" name=\"a\" value=\"3\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet.getString("option_3")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    4: <input type=\"radio\" name=\"a\" value=\"4\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet.getString("option_4")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"hidden\" name=\"ans_a\" value=\"");
      out.print(resultSet.getString("select_option"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("               \n");
      out.write("         </table>   \n");

}

}catch(Exception e){
        e.printStackTrace();
}


      out.write("\n");
      out.write("\n");
      out.write("\n");

    
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    

      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");

   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement=con.createStatement();
    String sql="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=2";
    resultSet=statement.executeQuery(sql);
    while(resultSet.next()){

      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <body>\n");
      out.write("            <table>\n");
      out.write("            <tr>\n");
      out.write("               \n");
      out.write("                <td>Question no:\n");
      out.write("                    ");
      out.print(resultSet.getString("Question_no")
                    );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td>\n");
      out.write("                   ");
      out.print(resultSet.getString("Question")
                   );
      out.write("\n");
      out.write("               </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    1: <input type=\"radio\" name=\"b\" value=\"1\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet.getString("option_1")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    2: <input type=\"radio\" name=\"b\" value=\"2\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet.getString("option_2")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    3: <input type=\"radio\" name=\"b\" value=\"3\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet.getString("option_3")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    4: <input type=\"radio\" name=\"b\" value=\"4\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet.getString("option_4")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"hidden\" name=\"ans_b\" value=\"");
      out.print(resultSet.getString("select_option"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>         \n");

}

}catch(Exception e){
        e.printStackTrace();
}


      out.write('\n');

    Connection connection2 = null;
    Statement statement2 = null;
    ResultSet resultSet2 = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    

      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");

   
    Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement2=con2.createStatement();
    String sql3="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=3";
    resultSet2=statement2.executeQuery(sql3);
    while(resultSet2.next()){

      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("               \n");
      out.write("                <td>Question no:\n");
      out.write("                    ");
      out.print(resultSet2.getString("Question_no")
                    );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td>\n");
      out.write("                   ");
      out.print(resultSet2.getString("Question")
                   );
      out.write("\n");
      out.write("               </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    1: <input type=\"radio\" name=\"c\" value=\"1\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet2.getString("option_1")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    2: <input type=\"radio\" name=\"c\" value=\"2\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet2.getString("option_2")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    3: <input type=\"radio\" name=\"c\" value=\"3\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet2.getString("option_3")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    4: <input type=\"radio\" name=\"c\" value=\"4\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet2.getString("option_4")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"hidden\" name=\"ans_c\" value=\"");
      out.print(resultSet2.getString("select_option"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>       \n");

}

}catch(Exception e){
        e.printStackTrace();
}


      out.write('\n');

    Statement statement3 = null;
    ResultSet resultSet3 = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    

      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");

   
    Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement3=con3.createStatement();
    String sql4="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=4";
    resultSet3=statement3.executeQuery(sql4);
    while(resultSet3.next()){

      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("               \n");
      out.write("                <td>Question no:\n");
      out.write("                    ");
      out.print(resultSet3.getString("Question_no")
                    );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td>\n");
      out.write("                   ");
      out.print(resultSet3.getString("Question")
                   );
      out.write("\n");
      out.write("               </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    1: <input type=\"radio\" name=\"d\" value=\"1\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet3.getString("option_1")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    2: <input type=\"radio\" name=\"d\" value=\"2\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet3.getString("option_2")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    3: <input type=\"radio\" name=\"d\" value=\"3\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet3.getString("option_3")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    4: <input type=\"radio\" name=\"d\" value=\"4\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet3.getString("option_4")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"hidden\" name=\"ans_d\" value=\"");
      out.print(resultSet3.getString("select_option"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>       \n");

}

}catch(Exception e){
        e.printStackTrace();
}


      out.write('\n');

    Statement statement4 = null;
    ResultSet resultSet4 = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    

      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");

   
    Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement4=con4.createStatement();
    String sql5="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=5";
    resultSet4=statement4.executeQuery(sql5);
    while(resultSet4.next()){

      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("               \n");
      out.write("                <td>Question no:\n");
      out.write("                    ");
      out.print(resultSet4.getString("Question_no")
                    );
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td>\n");
      out.write("                   ");
      out.print(resultSet4.getString("Question")
                   );
      out.write("\n");
      out.write("               </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    1: <input type=\"radio\" name=\"e\" value=\"1\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet4.getString("option_1")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    2: <input type=\"radio\" name=\"e\" value=\"2\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet4.getString("option_2")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    3: <input type=\"radio\" name=\"e\" value=\"3\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet4.getString("option_3")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    4: <input type=\"radio\" name=\"e\" value=\"4\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(resultSet4.getString("option_4")
                    );
      out.write("\n");
      out.write("                        \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"hidden\" name=\"ans_e\" value=\"");
      out.print(resultSet4.getString("select_option"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>       \n");

}

}catch(Exception e){
        e.printStackTrace();
}


      out.write("\n");
      out.write("  \n");
      out.write("    <form1>\n");
      out.write("         <input type=\"submit\" value=\"submit the test\">\n");
      out.write("    </form1>  \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("<html>\n");
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
