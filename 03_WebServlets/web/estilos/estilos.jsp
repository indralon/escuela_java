<%-- 
    Document   : estilos
    Created on : 26-sep-2019, 9:30:32
    Author     : alumno
--%>

<%@page contentType="text/css" pageEncoding="UTF-8"%>
<% for (int i = 0; i < 10; i++) {%>

.tipo-letra-<%="tam" + i%>{
font-size: <%=10 + i * 2%>px;
background-color: #4444<%=i * 10%>
}

#margen<%= i%>{
margin-left: <%= i *2 %>em;
margin-bottom: <%= i  %>em; 
}

.menu-princip {
display: inline-block;
border: 2px solid green;
margin: 3px;
}

<%
    }
%>
