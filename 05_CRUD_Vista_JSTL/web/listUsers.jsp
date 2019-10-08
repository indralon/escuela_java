<%-- 
    Document   : listUsers
    Created on : 01-oct-2019, 16:47:47
    Author     : alumno
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sinensia.modelo.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="usersList" 
             type="java.util.ArrayList<User>" scope="request">
    <jsp:getProperty property="*" name="usersList"></jsp:getProperty>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users list</title>
    </head>
    <body>
        <h1>Users list</h1>
        <a href="index.jsp">Inicio</a>
        <%-- ${} corresponde a EL (Expression Language) de JSTL --%>
        <c:if test="${cookie.email.value ==null}">
            <h1>No estas logueado amigo</h1>
        </c:if>

        <c:if test="${cookie.email.value !=null }">
            <c:forEach items="${usersList}" var="user">
                <form action="users.do" method="post">
                    <table>
                        <tr>
                            <td><input id="id" name="id" 
                                       readonly type="number" size="4" 
                                       value="${user.id}"/></td>
                            <td><label>Email:</label><input id="email" name="email" type="email"
                                                            size="15" value="${user.email}"/></td>
                            <td><label>Password:</label><input id="password" name="password" type="text"
                                                               size="10" value="${user.password}"/></td>
                            <td><label>Name:</label><input id="name" name="name" type="text"
                                                           size="10" value="${user.name}"/></td>
                            <td><label>Age:</label><input id="age" name="age" type="number"
                                                          value="${user.age}"/></td>
                            <td><input name="method" type="submit" value="Delete"/></td>
                            <td><input name="method" type="submit" value="Update"/></td>

                        </tr>
                    </table>
                </form>
            </c:forEach>
        </c:if>

    </body>
</html>
