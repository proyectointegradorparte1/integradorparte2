<%-- 
    Document   : menuusuario
    Created on : 6/04/2016, 10:47:14 PM
    Author     : jeferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    HttpSession objSession= request.getSession(false);
    String usuario = (String)objSession.getAttribute("usuario");
    if(usuario.equals("")){
        response.sendRedirect("sesion.jsp");
    }




    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU</title>
    </head>
    <body background="imagenes/fondo.jpg"/>
        <div style="width:1200px; margin-left: auto;margin-right: auto">
            <h1>USUARIO: <% out.println(usuario); %>......Acceso correcto</h1>
           
          
        <form  action="/integradors7/tabla"  method="post"  >
         
           
           
              
            
            
            <input type="submit"  value="IR A TABLA"  ><br><br>
        
        
        </form>
                   
              
               
          
       </div>>
       
    </body>
</html>
