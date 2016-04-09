<%-- 
    Document   : editartabla
    Created on : 6/04/2016, 10:45:32 PM
    Author     : jeferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
    </head>
    <body>
        <h1>nueva edicion </h1>
        <div style="width:900px; margin-left: auto;margin-right: auto">
            <c:forEach items="${getNewById}" var="p">
                <form  action="JSP/nuevaedicion.jsp"    method="post">
             
             <input type="hidden" name="id" value="${p.id}" >
             NOMBRE
            <input type="text"  value="${p.nombre}" name="nombre" style="width:200px" ><br>
              APELLIDO
            <input type="text" value="${p.apellido}"  name="apellido" style="width: 200px" ><br>
             CORREO
            <input type="text"  value="${p.correo}" name="correo" style="width: 200px" ><br>
             TELEFONO
            <input type="text"  value="${p.telefono}" name="telefono" style="width: 200px"><br>
            USUARIO
            <input type="text"  value="${p.usuario}" name="usuario" style="width: 200px"><br>
            PASS
            <input type="text"  value="${p.pass}" name="pass" style="width: 200px"><br>
            
            
            <input type="submit"  value="Enviar"><br>
        
        
        </form>
            </c:forEach>
            
        </div>
    </body>
</html>
