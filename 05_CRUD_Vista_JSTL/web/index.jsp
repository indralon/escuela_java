<%-- 
    Document   : index
    Created on : 02-oct-2019, 12:37:04
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vista JSTL Operaciones CRUD</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Vista JSTL Operaciones CRUD</h1>
        <ul>
            <li> <a href="register.jsp">Register</a> </li>
            <li> <a href="users.do">Users list</a> </li>
        </ul>

        <form id="formLogin" action="users.do" method="get">
            <label for="email">Email: </label>
            <input id="email" name="email" type="email"
                   size="50" maxlength="255" value="${cookie.email.value}"/><br/>

            <label for="password">Password: </label>
            <input id="password" name="password" type="password"
                   size="50" maxlength="50" required="required"/><br/>
            <input name="method" type="submit" value="Login" />
        </form>
                   <script src='js/md5.min.js'></script>
                   <script src='js/encryptLogin.js'></script>
    </body>
</html>
