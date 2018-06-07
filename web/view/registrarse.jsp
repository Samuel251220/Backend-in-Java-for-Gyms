<%-- 
    Document   : registrarse
    Created on : 05/06/2018, 12:52:59 PM
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registrarse</title>
    <%@include file="../WEB-INF/template/headLogin.jspf" %>
  </head>
  <body>
    <%@include file="../WEB-INF/template/headerRegistrar.jspf" %>
      <div class="contentAll">
        <div class="imgL" style="background-image: url(../img/login.jpg);">Log In</div>
        <div class="formuDiv">
          <form class="formu">
            <div class="divI">
              <label>Username: </label>
              <input type="text" placeholder="Enter username" class="txt"><br><br>
              <label>Password: </label>
              <input type="password" placeholder="Enter password" class="txt">
            </div>
            <br><br>
            <div class="divO">
              <div class="divCheck">
                <input type="checkbox"><span class="checkS">Recuerdame</span>
              </div>
              <div class="divF">
                <span>Olvidaste tu contraseña?</span>
              </div>
            </div>
            <br><br>
            <div class="divB">
              <input type="button" value="Iniciar Sesion" class="btnL">
            </div>
          </form>
        </div>
      </div>
      <%@include file="../WEB-INF/template/footerLogin.jspf" %>
      <%@include file="../WEB-INF/template/footerMain.jspf" %>
      <%@include file="../WEB-INF/template/footerLinks.jspf" %> 
  </body>
</html>
