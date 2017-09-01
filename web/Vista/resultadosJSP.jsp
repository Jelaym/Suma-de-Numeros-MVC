<%-- 
    Document   : resultadosJSP
    Created on : 31/08/2017, 05:44:02 PM
    Author     : Touchier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        /* Recibe parametros del sevlet por medio de httpsesion */
        <%
            int resul= 0;
            HttpSession sesion = request.getSession();
            resul= Integer.parseInt(sesion.getAttribute("resultado") + "");
        %>
        /* Despliega resultado */
        <h1>El Resultado es: <%= resul %></h1>
    </body>
</html>
