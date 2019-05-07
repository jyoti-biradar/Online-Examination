
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Enumeration"%>
<%
int count  = 0;
out.println("YOU FINISHED YOUR ONLINE EXAM"+"<br>");
//out.println(request.getParameter("a")+'='+request.getParameter("ans_a")+"<br>");
try{
if( request.getParameter("a").equals(request.getParameter("ans_a"))){
    count++;
}
}catch(Exception e){
    
}
//out.println(request.getParameter("b")+'='+request.getParameter("ans_b")+"<br>");
try{
if( request.getParameter("b").equals(request.getParameter("ans_b"))){
    count++;
}
}catch(Exception e){
    
}
//out.println(request.getParameter("c")+'='+request.getParameter("ans_c")+"<br>");
try{
if( request.getParameter("c").equals(request.getParameter("ans_c"))){
    count++;
}
}catch(Exception e){
    
}
//out.println(request.getParameter("d")+'='+request.getParameter("ans_d")+"<br>");
try{
if( request.getParameter("d").equals(request.getParameter("ans_d"))){
    count++;
}
}catch(Exception e){
    
}
//out.println(request.getParameter("e")+'='+request.getParameter("ans_e")+"<br>");
try{
if( request.getParameter("e").equals(request.getParameter("ans_e"))){
    count++;
}
}catch(Exception e){
    
}
try{
HttpSession httpSession = request.getSession();
String id=httpSession.getAttribute("txtid").toString();
String nam = httpSession.getAttribute("txtname").toString();

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
LocalDateTime now = LocalDateTime.now();
out.println(dtf.format(now)+"<br>");
out.println("total marks is--"+count+"<br>");
if(count>=3){
    out.println("clear the Test"+"<br>");
}else{
    out.println("not clear the Test"+"<br>");
}
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examonline", "root","");
    Statement statement=con.createStatement();
    int a=statement.executeUpdate("insert into result(stud_id,Name,Total_mark,Date)values('"+id+"','"+nam+"','"+count+"','"+dtf.format(now)+"')");
           
}catch(Exception e){
    out.println(e);
}
}catch(Exception e){
    out.println("userid invalid");
}
%>
 
<a style="font:Bold;color:red;font-size: 20px;background-color:blue;" href="index.jsp">Go to Login Page</a>
