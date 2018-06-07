<%-- 
    Document   : articulos
    Created on : 07/06/2018, 01:04:18 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../WEB-INF/template/headvar.jspf" %>
    </head>
    <body>
        <%@include file="../WEB-INF/template/headerMain.jspf" %>
        <div class="contenedor">
		<div class="contenedor_tarjeta">
			<a href="http://www.falconmasters.com">
				<figure id="tarjeta">
                                    <img src="../img/rotacion1.jpg" class="frontal" alt="">
					<figcaption class="trasera">
						<h2 class="titulo">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut, vero!</h2>
						<hr>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis cupiditate voluptates ipsum suscipit, aspernatur eum, amet nemo architecto nihil corrupti.</p>
					</figcaption>
				</figure>
			</a>
		</div>

		<div class="contenedor_tarjeta">
			<a href="http://www.falconmasters.com">
				<figure id="tarjeta">
                                    <img src="../img/rotacion2.jpg" class="frontal" alt="">
					<figcaption class="trasera">
						<h2 class="titulo">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut, vero!</h2>
						<hr>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis cupiditate voluptates ipsum suscipit, aspernatur eum, amet nemo architecto nihil corrupti.</p>
					</figcaption>
				</figure>
			</a>
		</div>

		<div class="contenedor_tarjeta">
			<a href="http://www.falconmasters.com">
				<figure id="tarjeta">
                                    <img src="../img/rotacion3.jpg" class="frontal" alt="">
					<figcaption class="trasera">
						<h2 class="titulo">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut, vero!</h2>
						<hr>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis cupiditate voluptates ipsum suscipit, aspernatur eum, amet nemo architecto nihil corrupti.</p>
					</figcaption>
				</figure>
			</a>
		</div>
	</div>
        <br><br><br><br><br><br>
        <%@include file="../WEB-INF/template/footerMain.jspf" %>
        <%@include file="../WEB-INF/template/footerLinks.jspf" %> 
    </body>
</html>
