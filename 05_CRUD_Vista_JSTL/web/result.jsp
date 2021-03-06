<%-- 
    Document   : result
    Created on : 02-oct-2019, 9:35:25
    Author     : alumno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h1>Result</h1>
        <a href="index.jsp">Inicio</a>
        <c:catch var="exception">
            <jsp:useBean id="user" type="sinensia.modelo.User" 
                         scope="request">
                <jsp:getProperty property="*" name="user"/>
            </jsp:useBean>
            <p>Usuario creado: ${user.email}</p>
        </c:catch>
        <c:if test="${not empty exception}">      
            <c:if test="${param.method == 'Delete'}">
                <p>User removed correctly</p>
            </c:if>
            <c:if test="${param.method == 'Update'}">
                <p>User update correctly</p>
            </c:if>
            <c:if test="${param.method == 'Login'}">
                <p>User logged correctly</p>
            </c:if> 
            <c:if test="${param.method == null}">
                <p>Error on register</p>
            </c:if>
        </c:if>
        <c:if test="${requestScope.errorMessage != null}">
            <h3 style="color: orange">
                ${requestScope.errorMessage}
            </h3>
            <c:remove var="errorMessage" scope="request"/>
        </c:if>
    </body>
</html>
