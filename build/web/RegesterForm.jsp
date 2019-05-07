
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script>
    function myFunction() {
  var x = document.getElementById("myInput");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
  
}
</script>
<script>
    function mytext(){
  var y=document.getElementById("id").value;
       if(y==""){
          document.getElementById("msg").innerHTML="** please enter id number";
          return;
       }
       if(isNaN(y)){
           document.getElementById("msg").innerHTML="** only digit number allowed";
           return;
       }
       if(y.length<4){
           document.getElementById("msg").innerHTML="** id number must be 4 digit";
           return;
       }
       else{
           document.getElementById("msg").innerHTML="";
       }
   }
</script>
<script>
     function mynumber(){
         var z=document.getElementById("mobilenum").value;
         if(z==""){
             document.getElementById("msg1").innerHTML="** please enter mobile number";
             return;
         }
         if(isNaN(z)){
           document.getElementById("msg1").innerHTML="** only digit number allowed";
           return;
         }
         if(z.length<10){
           document.getElementById("msg1").innerHTML="** mobile number must be 10 digit";
           return;
       }
       if(z.length>10){
           document.getElementById("msg1").innerHTML="** mobile number must be 10 digit";
           return;
       }
       if(z.charAt(0)!=9 && z.charAt(0)!=8 && z.charAt(0)!=7){
           document.getElementById("msg1").innerHTML="** mobile number start with only 9,8,7";
           return;
       }
       else{
           document.getElementById("msg1").innerHTML="";
       }
     }
</script>
<script>
    function myemail(){
        var mail=document.getElementById("emailid").value;
        var mail_pattern=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
       if(mail=="")
       {
        document.getElementById("msg2").innerHTML='Enter Your E-MailID';
        return;
       }
       if(mail_pattern.test(mail)==false)
       {
        document.getElementById("msg2").innerHTML='Enter a Valid E-Mail Id';
        return;
       }
      else
      {
       document.getElementById('mesg_mail').innerHTML="";
      } 
    }
</script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body style="background-image:url(wall.jpg);background-size: cover">
          <form action="http://localhost:8080/OnlineExam/Register" method="post" style="text-align: center;color: red">
              <header style="font-size:20px;padding:20px;background: yellow;color:red;"><marquee><h2>Welcome To Online Examination</h2></marquee></header>
              <table align="center" style="background-color:aquamarine;border: 5px solid purple;">
                <tr>
                    <th><b>Enter the id number</b></th>
                    <td><input type="text" name="id" id="id"  placeholder="Id number" style="width: 250px; padding: 10px"><span id="msg" style="color: red"></span></td>
                </tr>
                <tr>
                    <th><b>Enter the Student name </b></th>
                    <td><input type="text" name="txtname" required="please enter username" placeholder="Student name" style="width: 250px; padding: 10px"></td><br><br>
                </tr>
                <tr>
                    <th><b>Enter the password :</b></th>
                    <td><input type="password" name="password" required="please enter the password" id="myInput" placeholder="password" style="width: 250px; padding: 10px"> 
                        <input type="checkbox" onclick="myFunction()">Show Password</td><br><br>
                </tr>
                <tr>
                    <th><b>Enter the address :</b></th>
                    <td><input type="text" name="txtadd" required="enter address" placeholder="address" style="width: 250px; padding: 10px"></td><br><br>
                </tr>
                <tr>
                    <th><b>Enter the mobile number:</b></th>
                    <td><input type="text" name="txtmobilenum" id="mobilenum" placeholder="enter mobile number" style="width: 250px; padding: 10px"><span id="msg1" style="color: red"></span></td><br><br>
                </tr>
                <tr>
                    <th><b>Enter the your email id:</b></th>
                    <td><input type="text" name="txtemail" id="emailid" required="enter email" placeholder="email id" style="width: 250px; padding: 10px"><span id="msg2" style="color: red"></span></td><br><br>
                </tr>
                <tr>
                    <th><b>Gender:</b></th>
                    <th><input type="radio" name="gender" value="Male" required="">Male</th>
                    <th><input type="radio" name="gender" value="Female" required="">Female</th>
                </tr>
                <tr>
                    <th><input type="submit" name="btnsubmit" value="Submit" style="width: 250px; padding: 10px;text-align: center;color:blue;background-color:black;font-size:20px;font:bold " onclick="mytext(),mynumber(),myemail()"></th>
                </tr>
            </table>
          </form>
      
      <footer style="font-size:20px;padding:20px;background: yellow;color:red;">
            <marquee><h2>Welcome To Online Examination</h2></marquee></footer>
    </body>
</html>
