<%-- 
    Document   : Addquestion
    Created on : Apr 18, 2019, 3:52:57 PM
    Author     : Felix-ITs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Question Page</title>
    </head>
    <body>
        <form action="http://localhost:8080/OnlineExam/questionAdd" method="post">
            <table align="center" style="background-color:yellow">
                <tr>
                    <td>Enter the Question Number:</td>
                    <th><input style="padding:10px;width:200px" type="text" placeholder="Enter number" name="txtquenum"></th>
                </tr>
                <tr>
                    <td>Write the Question Here:</td>
                    <th><input style="padding:15px;width:300px" type="text" placeholder="Write Question" name="txtque"></th>
                </tr>
                <tr>
                    <td>Write Option one</td>
                    <th><input style="padding:15px;width:300px" type="text" placeholder="option 1" name="option1"></th>
                </tr>
                 <tr>
                    <td>Write Option two</td>
                    <th><input style="padding:15px;width:300px" type="text" placeholder="option 2" name="option2"></th>
                </tr>
                 <tr>
                    <td>Write Option three</td>
                    <th><input style="padding:15px;width:300px" type="text" placeholder="option 3" name="option3"></th>
                </tr>
                 <tr>
                    <td>Write Option four</td>
                    <th><input style="padding:15px;width:300px" type="text" placeholder="option 4" name="option4"></th>
                </tr>
                <tr>
                    <td>Write correct option</td>
                    <th><input style="padding:10px;width:200px" type="text" placeholder="write option number" name="choose"></th>
                </tr>
                <tr>
                    <td><input style="border: 2px solid red;width:100px;height:50px;border-radius: 25px;" type="submit" value="Add Question"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
