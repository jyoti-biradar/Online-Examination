<%-- 
    Document   : ResultDisplayForAdmin
    Created on : Apr 22, 2019, 5:57:26 PM
    Author     : Felix-ITs
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Result List</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
    <tr></tr>
         <tr bgcolor="#A52A2A">
            <td><b>Id</b></td>
            <td><b>stud_id</b></td>
            <td><b>Name</b></td>
            <td><b>Total_marks</b></td>
            <td><b>Date</b></td>
        </tr>
<%
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement=con.createStatement();
    String sql="select * from result";
    resultSet=statement.executeQuery(sql);
    while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

            <td><%=resultSet.getString("id") %></td>
            <td><%=resultSet.getString("stud_id") %></td>
            <td><%=resultSet.getString("Name") %></td>
            <td><%=resultSet.getString("Total_mark") %></td>
            <td><%=resultSet.getString("Date") %></td>
        </tr>
<%
}
 }catch(Exception e){
        e.printStackTrace();

    }
%>
</table>