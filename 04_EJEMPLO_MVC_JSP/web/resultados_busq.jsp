
<%@page import="com.sinensia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemeplo MVC con JSP y Servlet</title>
    </head>
    <body>
        <h1>Ejemeplo MVC con JSP y Servlet</h1>
        <h2>Usuario</h2>
        <% Persona p = (Persona) session.getAttribute("persona"); %>
        <% if (p != null) {%>
        <label for="nombre">Nombre: </label>
        <input id ="nombre" readonly="readonly"
               value="<%= p.getNombre()%>" />
        <label for="edad">Edad: </label>
        <input id ="nombre" readonly="readonly"
               value="<%= p.getEdad()%>" />
        <% } else { %>
        <span style="color: red">
            No se han encontrado personas
        </span>
        <% }%>
    </body>
</html>
