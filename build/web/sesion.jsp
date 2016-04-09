<%-- 
    Document   : sesion
    Created on : 6/04/2016, 10:48:29 PM
    Author     : jeferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>INICIO DE SESION</title>
        <script src="validacion.js" ></script>
    </head>
    <body background="imagenes/fondo-madera.jpg"/>
    <h1>INICIO DE SESION</h1><br>
        <div style="width:900px; margin-left: auto;margin-right: auto">
          
        <form  action="iniciar"  method="post" id="iniciosesion" >
          <!--    ID
            <input type="text" name="id" style="width: 200px"><br>-->
          
             USUARIO
             <input type="text" name="usuario" style="width:200px" id="txtusuario" ><br><br>
              PASSWORD
              <input type="password" name="pass" style="width: 200px"id="txtpass" ><br><br>
           
              
            
            
              <input type="button"  value="Enviar" id="btniniciar" ><br><br>
        
        
        </form>
       
            si no tienes una cuenta dale en ....<a href="registro.html">REGISTRARSE</a>
            
        </div>
    </body>
</html>
