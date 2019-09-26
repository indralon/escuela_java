package com.sinensia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Indra Mon
 */
public class HolaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        String ruta = peticion.getContextPath();
        // indicar el tipo de respuesta
        respuesta.setContentType("text/html;charset=UTF-8");
        // Construir el HTMl de respuesta:
        try (PrintWriter salida = respuesta.getWriter()) {
            salida.println("<html>");
            salida.println("<head><title>HTML creado desde Servlet</title>");
            salida.println("</head>");

            salida.println("<body>");
            salida.println("<h1>HTML creado desde Servlet WOOW O.o </h1>");
            salida.println("<body>");
            salida.println("<p>Ruta: "+ ruta + "</p>");
            salida.println("<ul>");
            for(int i = 0; i < 10; i ++) {
                salida.println("<li>Numero generado en Java: " + i + "</li>");
            }
            salida.println("</ul>");
            salida.println("</body>");

            salida.println("</html>");
        }
    }

}
