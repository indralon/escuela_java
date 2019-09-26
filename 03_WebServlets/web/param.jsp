<%@include file="head.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%= head("Param") %>
    <body>
        <%@include file="header.jsp" %>
        <h1>DATOS</h1>
        <p>Te llamas <% out.println(request.getParameter("nombre")); %> </p>
        <p>Y tienes <% out.println(request.getParameter("edad")); %> años </p>
        <p>Y te gusta respirar</p>
        
        <ul>
            <% for(int i = 0; i< 10; i++) { %>
            <li class="tipo-letra-tam<%=i%>">Numelo <% out.println(i); %></li>
            <p id="margen<%= i %>">Margen<%= i %> </p>
            <% } %>
        </ul>
    </body>
</html>
