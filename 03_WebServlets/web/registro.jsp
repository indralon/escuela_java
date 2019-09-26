<%@include file="head.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<%= head("Form") %>
    <body>
        <%@include file="header.jsp" %>
        <form name='form1' method='post' action='./param.jsp'>
            <table border='1'>
                <tr>
                    <td>Nombre:</td>
                    <td><input type='text' name='nombre' id='nombre' /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type='hidden' name='password' id='password' /></td>
                </tr>
                <tr>
                    <td>Edad:</td>
                    <td><input type='number' name='edad' id='edad' /></td>
                </tr>
                <tr>
                    <td>¿Respiras?</td>
                    <td><input type='checkbox' name='respirar' id='respirar' /></td>
                </tr>
            </table>
            <input type='submit' value='Enviar' />
        </form>
    </body>
</html>
