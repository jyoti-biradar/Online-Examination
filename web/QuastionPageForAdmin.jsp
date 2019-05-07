<%-- 
    Document   : QuastionPageForAdmin
    Created on : Apr 18, 2019, 3:36:40 PM
    Author     : Felix-ITs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question Page</title>
    </head>
    <body>
        <form action="Addquestion.jsp" method="post">
            <h1 style="color: blue;font-size:30px;text-align: center;padding: 20px ;background-color:black">Question Bank</h1>
            <table>
                <tr>
                    <td><input style="border: 2px solid red;width:100px;height:50px;border-radius: 25px;" type="submit" value="Add Question"></td>
                   
                </tr>
            </table>
        </form>
        <form action="questionList.jsp" method="post">
            <table>
                <tr>
                    <td><input style="border: 2px solid red;width:100px;height:50px;border-radius: 25px;" type="submit" value="Question List"></td>
                </tr>
            </table>
        </form>
        <form action="QuastionPageForAdmin.jsp" method="post">
            <table>
                <tr>
                    <td><input style="border: 2px solid red;width:100px;height:50px;border-radius: 25px;" type="submit" value="Show Results"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
