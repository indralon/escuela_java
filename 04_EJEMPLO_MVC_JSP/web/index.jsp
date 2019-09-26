<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Ejemplo MVC con JSP y Servlet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Ejemplo MVC con JSP y Servlet</h1>
        <h2>Añadir persowna</h2>
        <form name='form1' method='post' action='./personas.do'>
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
        
        <h2>buscar persowna</h2>
        <form name='formBusq' method='get' action='./personas.do'>
            <table border='1'>
                <tr>
                    <td>Nombre:</td>
                    <td><input type='text' name='nombre' id='nombre' /></td>
                </tr>
            </table>
            <input type='submit' value='Enviar' />
        </form>
    </body>
</html>
