
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {
     ResultSet rs=null;
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
               // Statement statement=con.createStatement();
                String name=request.getParameter("txtname");
                
                
                
                String pass=request.getParameter("txtpass");
                
                String sql="select * from login where name=? and password=?";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1,name);
                pst.setString(2,pass);
                rs=pst.executeQuery();
                if(rs.next()){
                     HttpSession httpSession = request.getSession();
                     httpSession.setAttribute("txtname", name);
                    httpSession.setAttribute("txtid",rs.getString("id"));
                    
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Login successfully!!!!!!');");
                    out.println("location='InstructionPage.jsp';");
                     out.println("</script>");
                }
                else{
                   out.println("<script type=\"text/javascript\">");
                   out.println("alert('name and password not valid..please register!!!!!');");
                   out.println("location='Login.jsp';");
                   out.println("</script>");
                }
            }catch(Exception e){
                out.println(e);
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
