<%-- 
    Document   : tabla
    Created on : 6/04/2016, 10:44:17 PM
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
        <title>tabla</title>
    </head>
    <body background="imagenes/fondo.jpg"/>
       <div style="width:1200px; margin-left: auto;margin-right: auto">
             <h1>USUARIO: <% out.println(usuario); %>......Acceso correcto</h1>
           
           <table cellpadding="10">
               <tr>
                   <th> ID </th>  
                   <th> NOMBRE</th>
                   <th> APELLIDO </th>
                   <th> CORREO </th>
                   <th> TELEFONO </th>
                   <th> USUARIO </th>
                   <th> PASS </th>
                   <th>  </th>
                   
               </tr>
               <c:forEach items="${tabla}" var="p">
                   <tr>
                       <td>  ${p.id}</td>
                       <td>  ${p.nombre}</td>
                       <td>  ${p.apellido}</td>
                       <td>  ${p.correo}</td>
                       <td>  ${p.telefono}</td>
                       <td>  ${p.usuario}</td>
                       <td>  ${p.pass}</td>
                       <td> 
                           <a href="editar?id=${p.id}">EDITAR</a>
                           <a href="eliminar?id=${p.id}">ELIMINAR</a>
                           
                       
                       </td>
                       
                       
                   </tr>
                   
               </c:forEach>
               
           </table>
       </div>>
    </body>
</html>
