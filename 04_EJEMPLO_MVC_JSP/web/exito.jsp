<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exito - registro guardado</title>
    </head>
    <body>
        <h1>Exito - Registro guardado</h1>
        <label for="nombre">Nombre: </label>
        <input readonly="readonly" value="<%=request.getParameter("nombre")%>"/>
        <label for="nombre">Edad: </label>
        <input type="text" readonly="readonly" value="<%=request.getParameter("edad")%>"/>       
    </body>
</html>
