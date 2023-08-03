<%-- 
    Document   : listar
    Created on : 1/08/2023, 12:07:43 AM
    Author     : RYZEN
--%>
<%@page import="co.edu.sena.colegioweb.logica.Estudiante"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar usuarios</title>
    </head>
    <body>
        <h1>Listado de Empleados</h1>

        <%
            List<Estudiante> estudiantes = (List) request.getSession().getAttribute("listaEstudiantes");
            int cont = 1;
            for (Estudiante e : estudiantes) {

        %>

        <p><b>Empleado N° <%=cont%></b></p>
        <p>Codigo: <%=e.getCodigo()%></p>
        <p>Nombre: <%=e.getNombre()%></p>
        <p>Apellido: <%=e.getApellido()%></p>
        <p>Edad: <%=e.getEdad()%></p>
        <p>----------------------------------------</p>
        <% cont = cont + 1;%>
        
        <% } %>
    </body>
</html>

