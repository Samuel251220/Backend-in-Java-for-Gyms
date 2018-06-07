<%-- 
    Document   : nosotros
    Created on : 03/06/2018, 04:34:15 PM
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
        <section class="testimony_section">
		<div class="container">
			<h2 class="title_section">ENTRENADORES</h2>
			<div class="row">
				<div class="col-md-4">
					<div class="testimony">
                                            <img src="../img/testimonio1.jpg" class="img-circle">
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto necessitatibus voluptate hic totam labore, iste, sunt. Dolor non, eos sequi rem, reiciendis repellendus alias ratione labore ut corporis eum esse.</p>
						<a href="#">@CreativoHN </a><i class="fab fa-twitter" id="twiter"></i>
					</div>
				</div>
				<div class="col-md-4">
					<div class="testimony">
						<img src="../img/testimonio2.jpg" class="img-circle">
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto necessitatibus voluptate hic totam labore, iste, sunt. Dolor non, eos sequi rem, reiciendis repellendus alias ratione labore ut corporis eum esse.</p>
						<a href="#">@CreativoHN </a><i class="fab fa-twitter" id="twiter"></i>
					</div>
				</div>
				<div class="col-md-4">
					<div class="testimony">
						<img src="../img/testimonio3.jpg" class="img-circle">
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto necessitatibus voluptate hic totam labore, iste, sunt. Dolor non, eos sequi rem, reiciendis repellendus alias ratione labore ut corporis eum esse.</p>
						<a href="#">@CreativoHN </a><i class="fab fa-twitter" id="twiter"></i>
					</div>
				</div>
			</div>
		</div>
	</section>
        <%@include file="../WEB-INF/template/footerMain.jspf" %>
        <%@include file="../WEB-INF/template/footervar.jspf" %> 
    </body>
</html>
