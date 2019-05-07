<%-- 
    Document   : Adminlogin
    Created on : Apr 18, 2019, 2:47:27 PM
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
        <title>Admin Login Page</title>
    </head>
    <body style="background-image:url(wall.jpg);background-size: cover">
        <form action="http://localhost:8080/OnlineExam/Adminlogin" method="post" style="text-align: center">
        <table align="center" style="background-color:yellow">
            <tr>
                <td>Enter the username:</td>
                <th><input style="padding:10px;width:200px" type="text" name="txtname" placeholder="enter username" required=""></th>
            </tr>
            <tr>
                <td>Enter the password:</td>
                <th><input style="padding:10px;width:200px" type="password" name="txtpass" placeholder="Enter password" required=""></th>
                <td><input type="checkbox" onclick="mypass()" style="font-size:20px;color:yellow;font:bold">Show Password</td>
            </tr>
            <tr>
                <td><input style="border: 2px solid red;width:100px;height:50px;border-radius: 25px;" type="submit" value="login"></td>
            </tr>
            <tr>
                <td>you don't have Account</td>
                <th><a style="color:red" href="AdminRegester.jsp"><b>Register Here</b></a></th>
            </tr>
        </table>
        </form>
    </body>
</html>
