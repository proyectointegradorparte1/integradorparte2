<%-- 
    Document   : nuevaedicion
    Created on : 6/04/2016, 10:38:35 PM
    Author     : jeferson
--%>
<%@page import="dao.accesobd"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String idTemp = request.getParameter("id");
            int id = Integer.parseInt(idTemp);
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
            String telefono = request.getParameter("telefono");
            String usuario = request.getParameter("usuario");
            String pass = request.getParameter("pass");
            accesobd da = new accesobd();
            da.editar(id, nombre, apellido, correo, telefono, usuario, pass );
            response.sendRedirect("/integradors7/tabla");
            
            

            %>
    </body>
</html>
