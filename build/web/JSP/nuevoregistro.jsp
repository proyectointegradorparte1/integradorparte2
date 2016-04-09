<%-- 
    Document   : nuevoregistro
    Created on : 6/04/2016, 10:37:52 PM
    Author     : jeferson
--%>
<%@page import="dao.accesobd"%>
<%@page import="modelo.modelo1"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSP Page</title>
        
    </head>
    <body>
       <% 
           String nombre= request.getParameter("nombre"); 
          
           String apellido = request.getParameter("apellido");
           String correo = request.getParameter("correo");
           String telefono = request.getParameter("telefono");
           String usuario = request.getParameter("usuario");
           String pass = request.getParameter("pass");
          
           
            modelo1 n= new modelo1(0, nombre, apellido, correo, telefono, usuario, pass );
            accesobd da = new accesobd();
            da.addNew(n);
            response.sendRedirect("/integradors7/sesion.jsp");

           

           %>
  
    </body>
</html>
