/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felix-ITs
 */
@WebServlet(urlPatterns = {"/AdminRegister"})
public class AdminRegister extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
            LocalDateTime now = LocalDateTime.now(); 
            int id=Integer.parseInt(request.getParameter("id"));
            String name=request.getParameter("txtname");
            String pass=request.getParameter("password");
            String address=request.getParameter("txtadd");
            long mobnumber=Long.parseLong(request.getParameter("txtmobilenum"));
            String email=request.getParameter("txtemail");
            String gender=request.getParameter("gender");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
            Statement statement=con.createStatement();
            int a=statement.executeUpdate("insert into adminlogin values('"+id+"','"+name+"','"+pass+"','"+address+"','"+mobnumber+"','"+email+"','"+gender+"','"+dtf.format(now)+"')");
            if(a!=0){
                   out.println("<script type=\"text/javascript\">");
                   out.println("alert('regester successfully!!!!!');");
                   out.println("location='Adminlogin.jsp';");
                   out.println("</script>");
                    //RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
                    //dispatcher.forward(request, response);
                 }else{
                    out.println("data  not insertted");
                 }
        
            }catch(Exception e){
               
              //out.println(e);
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