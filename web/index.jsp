<%-- 
    Document   : Login
    Created on : Apr 17, 2019, 3:02:54 PM
    Author     : Felix-ITs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script>
    function mypass(){
        var x = document.getElementById("myInput");
       if (x.type === "password") {
           x.type = "text";
       } else {
           x.type = "password";
              }
      }
</script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body style="background-image:url(wall.jpg);background-size: cover">
        <header style="font-size:20px;padding:20px;background: yellow;color:red;"><marquee><h2>Welcome To Online Examination</h2></marquee></header>
        <div style="width:400px;margin: 10% 0 0;margin: auto;height:565px">
            <form action="http://localhost:8080/OnlineExam/login" method="post" style="position: relative;z-index: 1;background-image:url(shadow.jpg) ;max-width: 400px;margin: 0 auto 100px;padding: 45px;text-align: center">
                <img src="login.jpg" style="border-radius:50%;height: 100px;width:100px;">
                <p style="font-size:20px;color:yellow;font:bold">Enter Student Name:</p>
                <input style="padding:10px;width:200px" type="text" name="txtname" placeholder="Student Name" required="">
                
                <p style="font-size:20px;color:yellow;font:bold">Enter Student Password:</p>
                <input style="padding:10px;width:200px" type="password" id="myInput" name="txtpass" placeholder="Student Password" required=""><br>
                <input type="checkbox" onclick="mypass()" style="font-size:20px;color:yellow;font:bold">Show Password<br><br>
                <input style="border: 2px solid red;width:100px;height:50px;border-radius: 25px;" type="submit" value="Login"><br>
                <p style="font-size:20px;color:yellow;font:bold">you don't have Account--</p>
                <a style="color:red" href="RegesterForm.jsp"><b>Register Here</b></a><br>
                <a style="color: red" href="Adminlogin.jsp"><b>Go To Admin Login Page</b></a>
            </form>
         </div>
        <footer style="font-size:20px;padding:20px;background: yellow;color:red;">
            <marquee><h2>Welcome To Online Examination</h2></marquee></footer>
     </body>
</html>
