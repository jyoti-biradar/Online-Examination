<%-- 
    Document   : InstructionPage
    Created on : Apr 18, 2019, 1:59:39 PM
    Author     : Felix-ITs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    header{
        width: 1350px;
        height: 200px;
        margin: auto;
        margin: auto;
    }
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>instruction Page</title>
    </head>
    <body style="background-image:url(wall.jpg);background-size:cover">
        <form action="Question1.jsp" method="post">
           <div class="header">
               <img src="flower.jpg" width="1350px" height="200px">
               <h1 style="background-color:darkorange;font-size:40px;text-align: center">Student Instruction Before Exam</h1>
               <h3>During the exam:</h3>
               <p style="color: red;font-size: 20px">
                   This is multiple system quize to test your knowledge.<br>
                   This is Based On your programming language<br>
                   Total Number of Question Only 5<br>
                   you will get 10 minute for this test.
               </p>
               <input style="background: black;color:red" type="submit" value="Star the Exam">
           </div>
            
        </form>
    </body>
</html>
