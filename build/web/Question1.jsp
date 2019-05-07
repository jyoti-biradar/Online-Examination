<%-- 
    Document   : Question1
    Created on : Apr 19, 2019, 11:55:51 AM
    Author     : Felix-ITs
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
<div  style="text-align: center;background-color:blue;color: yellow;font-size: 30px;font: bold;position: fixed;height:60px;width:1500px">
    test closes in <span id="time">01:00</span> minutes!</div>
<script>
    
    function startTimer(duration, display) {
    var timer = duration, minutes, seconds;
    setInterval(function () {
        minutes = parseInt(timer / 60, 10)
        seconds = parseInt(timer % 60, 10);

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds;

        if (--timer < 0) {
            timer = duration;
        }
       
    }, 1000);
   }
 
window.onload = function () {
    var oneMinutes = 60*1,
        display = document.querySelector('#time');
    startTimer(oneMinutes, display);
    setTimeout(timing,60000);
   
};
</script>
<script>
    function timing(){  
        alert("time out for this examination");
        document.getElementById('theForm').submit();
       // var a=document.getElementById("a").value;
       // var b=document.getElementById("b").value;
       // var c=document.getElementById("c").value;
       // var d=document.getElementById("d").value;
       // var e=document.getElementById("e").value;
         
       // window.location.href="ResultDisplay.jsp?a="+a+"b="+b+"c="+c+"d="+d+"e="+e;
    }
</script>
<%
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
     String g;
    String ans=" ";
    int count=0;
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    
%>
   


<%
   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement=con.createStatement();
    String sql="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=1";
    resultSet=statement.executeQuery(sql);
    while(resultSet.next()){
%>
    <br>
    <br>
    <br>
    <br>
    <form action="ResultDisplay.jsp" method="post" id="theForm">
        <table>
            <tr>
               
                <td>Question no:
                    <%=resultSet.getString("Question_no")
                    %>
                </td>
                
            </tr>
            <tr>
               <td>
                   <%=resultSet.getString("Question")
                   %>
               </td>
            </tr>
            <tr>
                <td>
                    1: <input type="radio" name="a" value="1">
               
                <%=resultSet.getString("option_1")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    2: <input type="radio" name="a" value="2">
                
                    <%=resultSet.getString("option_2")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    3: <input type="radio" name="a" value="3">
                
                    <%=resultSet.getString("option_3")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    4: <input type="radio" name="a" value="4">
                
                    <%=resultSet.getString("option_4")
                    %>
                        
                </td>
                <td>
                    <input type="hidden" name="ans_a" value="<%=resultSet.getString("select_option")%>">
                </td>
            </tr>
               
         </table>   
<%
}

}catch(Exception e){
        e.printStackTrace();
}

%>


<%
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    
%>
   


<%
   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement=con.createStatement();
    String sql="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=2";
    resultSet=statement.executeQuery(sql);
    while(resultSet.next()){
%>
    <br>
    <br>
    <br>
    <br>
    <body>
            <table>
            <tr>
               
                <td>Question no:
                    <%=resultSet.getString("Question_no")
                    %>
                </td>
                
            </tr>
            <tr>
               <td>
                   <%=resultSet.getString("Question")
                   %>
               </td>
            </tr>
            <tr>
                <td>
                    1: <input type="radio" name="b" value="1">
                
                    <%=resultSet.getString("option_1")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    2: <input type="radio" name="b" value="2">
               
                    <%=resultSet.getString("option_2")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    3: <input type="radio" name="b" value="3">
                
                    <%=resultSet.getString("option_3")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    4: <input type="radio" name="b" value="4">
                
                    <%=resultSet.getString("option_4")
                    %>
                        
                </td>
                <td>
                    <input type="hidden" name="ans_b" value="<%=resultSet.getString("select_option")%>">
                </td>
            </tr>
        </table>         
<%
}

}catch(Exception e){
        e.printStackTrace();
}

%>
<%
    Connection connection2 = null;
    Statement statement2 = null;
    ResultSet resultSet2 = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    
%>
   


<%
   
    Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement2=con2.createStatement();
    String sql3="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=3";
    resultSet2=statement2.executeQuery(sql3);
    while(resultSet2.next()){
%>
    <br>
    <br>
        <table>
            <tr>
               
                <td>Question no:
                    <%=resultSet2.getString("Question_no")
                    %>
                </td>
                
            </tr>
            <tr>
               <td>
                   <%=resultSet2.getString("Question")
                   %>
               </td>
            </tr>
            <tr>
                <td>
                    1: <input type="radio" name="c" value="1">
               
                    <%=resultSet2.getString("option_1")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    2: <input type="radio" name="c" value="2">
                
                    <%=resultSet2.getString("option_2")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    3: <input type="radio" name="c" value="3">
                
                    <%=resultSet2.getString("option_3")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    4: <input type="radio" name="c" value="4">
                
                    <%=resultSet2.getString("option_4")
                    %>
                        
                </td>
                <td>
                    <input type="hidden" name="ans_c" value="<%=resultSet2.getString("select_option")%>">
                </td>
            </tr>
        </table>       
<%
}

}catch(Exception e){
        e.printStackTrace();
}

%>
<%
    Statement statement3 = null;
    ResultSet resultSet3 = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    
%>
   


<%
   
    Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement3=con3.createStatement();
    String sql4="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=4";
    resultSet3=statement3.executeQuery(sql4);
    while(resultSet3.next()){
%>
    <br>
    <br>
        <table>
            <tr>
               
                <td>Question no:
                    <%=resultSet3.getString("Question_no")
                    %>
                </td>
                
            </tr>
            <tr>
               <td>
                   <%=resultSet3.getString("Question")
                   %>
               </td>
            </tr>
            <tr>
                <td>
                    1: <input type="radio" name="d" value="1">
                
                    <%=resultSet3.getString("option_1")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    2: <input type="radio" name="d" value="2">
               
                    <%=resultSet3.getString("option_2")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    3: <input type="radio" name="d" value="3">
                
                    <%=resultSet3.getString("option_3")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    4: <input type="radio" name="d" value="4">
               
                    <%=resultSet3.getString("option_4")
                    %>
                        
                </td>
                <td>
                    <input type="hidden" name="ans_d" value="<%=resultSet3.getString("select_option")%>">
                </td>
            </tr>
        </table>       
<%
}

}catch(Exception e){
        e.printStackTrace();
}

%>
<%
    Statement statement4 = null;
    ResultSet resultSet4 = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
           
    
    
%>
   


<%
   
    Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    statement4=con4.createStatement();
    String sql5="select Question_no,Question,option_1,option_2,option_3,option_4,select_option from question where Question_no=5";
    resultSet4=statement4.executeQuery(sql5);
    while(resultSet4.next()){
%>
    <br>
    <br>
        <table>
            <tr>
               
                <td>Question no:
                    <%=resultSet4.getString("Question_no")
                    %>
                </td>
                
            </tr>
            <tr>
               <td>
                   <%=resultSet4.getString("Question")
                   %>
               </td>
            </tr>
            <tr>
                <td>
                    1: <input type="radio" name="e" value="1">
                
                    <%=resultSet4.getString("option_1")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    2: <input type="radio" name="e" value="2">
                
                    <%=resultSet4.getString("option_2")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    3: <input type="radio" name="e" value="3">
                
                    <%=resultSet4.getString("option_3")
                    %>
                        
                </td>
            </tr>
            <tr>
                <td>
                    4: <input type="radio" name="e" value="4">
                
                    <%=resultSet4.getString("option_4")
                    %>
                        
                </td>
                <td>
                    <input type="hidden" name="ans_e" value="<%=resultSet4.getString("select_option")%>">
                </td>
            </tr>
        </table>       
<%
}

}catch(Exception e){
        e.printStackTrace();
}

%>
  
    <form1>
         <input type="submit" value="submit the test">
    </form1>  
       
        
    </form>
</body>
<html>
