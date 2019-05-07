<%-- 
    Document   : questionList
    Created on : Apr 18, 2019, 4:20:06 PM
    Author     : Felix-ITs
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Question List</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
    <tr></tr>
         <tr bgcolor="#A52A2A">
            <td><b>Question_number</b></td>
            <td><b>Question</b></td>
            <td><b>Option1</b></td>
            <td><b>Option2</b></td>
            <td><b>Option3</b></td>
            <td><b>Option4</b></td>
            <td><b>Correct_option_number</b></td>
        </tr>

<%
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement=con.createStatement();
    String sql="select * from Question";
    resultSet=statement.executeQuery(sql);
    while(resultSet.next()){
%>
        <tr bgcolor="#DEB887">

            <td><%=resultSet.getString("Question_no") %></td>
            <td><%=resultSet.getString("Question") %></td>
            <td><%=resultSet.getString("option_1") %></td>
            <td><%=resultSet.getString("option_2") %></td>
            <td><%=resultSet.getString("option_3") %></td>
            <td><%=resultSet.getString("option_4") %></td>
            <td><%=resultSet.getString("select_option") %></td>
        </tr>
<%
}
 }catch(Exception e){
        e.printStackTrace();

    }
%>
</table>
