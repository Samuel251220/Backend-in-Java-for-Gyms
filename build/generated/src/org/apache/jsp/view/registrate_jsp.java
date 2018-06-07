package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/view/../WEB-INF/template/HeadMainLinks.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/HeadVarMain.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/FooterMain.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/FooterMainLinks.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Registrate</title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/nosotros.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/productos.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/registrate.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/secion\"/>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/inicio.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class>\r\n");
      out.write("\r\n");
      out.write("\t  <!-- Aca se agrega un nav para poder crear el menu de navegacion de la pagina -->\r\n");
      out.write("\r\n");
      out.write("\t    <nav class=\"navbar navbar-inverse navbar-static-top\" role=\"navigation\"> <!-- el inverse es para que cambien los colores y el static top es para que el menu se mantenga en la parte de arriba de la pagina -->\r\n");
      out.write("\r\n");
      out.write("\t\t    <div class=\"container\">\r\n");
      out.write("\t\t\t    <div class=\"navbar-header\">\r\n");
      out.write("\t\t\t    \t<i class=\"pesa fas fa-dumbbell\"></i>\r\n");
      out.write("\t\t\t\t    <!-- Esto es para hacer el boton que se muestra cuando el dispositivo es mediano-->\r\n");
      out.write("\t\t\t\t    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navegacion\" aria-expended=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t\t    <span class=\"sr-only\">Ocultar</span>\r\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t    </button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    <a href=\"#\" class=\"navbar-brand\">Stronger GYM</a> <!-- Este es el titulo que va en el menu-->\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t    <!-- Aqui se iniciara el menu-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"navegacion\"> <!-- El id que se agrega aqui debe de llevar el mismo nombre que se ingreso en el data-target que va en el boton que se muestra en dispositivos medianos-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t      \r\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=1\">Inicio</a></li><!-- class=\"active\"-->\r\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=2\">Nosotros</a></li>\r\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=3\">Productos</a></li>\r\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=4\">Registrarse</a></li>\r\n");
      out.write("                                        <li class=\"bar\"><a href=\"menu?op=5\">Iniciar Seción</a></li>\r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t        <!--<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expended=\"false\">\r\n");
      out.write("\t\t\t\t\t        Nuestros Servicios \r\n");
      out.write("\t\t\t\t\t        <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t        </a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t        <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"#\">Todos los servicios</a></li>\r\n");
      out.write("\t\t\t\t\t\t        <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"#\">Outsourcing 1</a></li>\r\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"#\">Outsourcing 2</a></li>\r\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"#\">Outsourcing 3</a></li>\r\n");
      out.write("\t\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t      \t</li>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t    </ul> \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    <!--<form action=\"\" class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" class=\"form-control\" placeholder=\"Buscar\">\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <button type=\"submit\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t    <span class=\"glyphicon glyphicon-search\"></span>\r\n");
      out.write("\t\t\t\t\t    </button>\r\n");
      out.write("\t\t\t\t    </form>-->\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t    </nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"contentAll\">\r\n");
      out.write("            <h2>Registrate</h2>\r\n");
      out.write("            <div class=\"imgL\" style=\"background-image: url(../img/login.jpg);\">Log In</div>\r\n");
      out.write("            <div class=\"formuDiv\">\r\n");
      out.write("              <form class=\"formu\">\r\n");
      out.write("                <div class=\"divI\">\r\n");
      out.write("                  <label>Username: </label>\r\n");
      out.write("                  <input type=\"text\" placeholder=\"Enter username\" class=\"txt\"><br><br>\r\n");
      out.write("                  <label>Password: </label>\r\n");
      out.write("                  <input type=\"password\" placeholder=\"Enter password\" class=\"txt\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <div class=\"divO\">\r\n");
      out.write("                  <div class=\"divCheck\">\r\n");
      out.write("                    <input type=\"checkbox\"><span class=\"checkS\">Recuerdame</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"divF\">\r\n");
      out.write("                    <span>Olvidaste tu contraseña?</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <div class=\"divB\">\r\n");
      out.write("                  <input type=\"button\" value=\"Iniciar Sesion\" class=\"btnL\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"row\">\n");
      out.write("    \t\t\t<div class=\"col-md-4\">\n");
      out.write("    \t\t\t\t<h2>Ultimas entradas</h2>\n");
      out.write("    \t\t\t\t<ul class=\"parrafo\">\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t\t<li><a class=\"a\" href=\"#\">Proximamente</a></li>\n");
      out.write("    \t\t\t\t</ul>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-md-4\">\n");
      out.write("    \t\t\t\t<h2>Contacto</h2>\n");
      out.write("    \t\t\t\t<p><strong>Strong Corporation</strong></p>\n");
      out.write("    \t\t\t\t<p class=\"parrafo\"><i class=\"fas fa-map-marker-alt\"></i> Direccion</p>\n");
      out.write("    \t\t\t\t<p class=\"parrafo\"><i class=\"fas fa-phone\"></i> Telefono</p>\n");
      out.write("    \t\t\t\t<p class=\"parrafo\"><i class=\"fab fa-whatsapp\"></i> Whatsapp</p>\n");
      out.write("    \t\t\t\t<p class=\"parrafo\"><i class=\"fas fa-envelope\"></i> Email</p>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-md-4\">\n");
      out.write("    \t\t\t\t<h2 class=\"title\">Recibir mas informacion</h2>\n");
      out.write("    \t\t\t\t<form action=\"./\">\n");
      out.write("    \t\t\t\t\t<div class=\"input-group\">\n");
      out.write("    \t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("\t\t    \t\t\t\t<span class=\"input-group-btn\">\n");
      out.write("\t\t    \t\t\t\t\t<button class=\"btn btn-default\" type=\"button\">\n");
      out.write("\t\t    \t\t\t\t\t\t<i class=\"glyphicon glyphicon-ok\"></i>\n");
      out.write("\t\t    \t\t\t\t\t</button>\n");
      out.write("\t\t    \t\t\t\t</span>\n");
      out.write("    \t\t\t\t\t</div><br>\n");
      out.write("    \t\t\t\t\t<p class=\"parrafo\">Recibe Informacion de nuestras actualizaciones directamente en tu correo electrónico</p>\n");
      out.write("    \t\t\t\t</form>\n");
      out.write("    \t\t\t\t\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"copy container\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<p class=\"copy-title\">COPYRIGHT © 2018 TODOS LOS DERECHOS RESERVADOS</p>\n");
      out.write("\t\t\t<ul class=\"copy-ul\">\n");
      out.write("\t\t\t\t<li class=\"copy-ul-li\"><a href=\"#\">Comunidada</a></li>\n");
      out.write("\t\t\t\t<li class=\"copy-ul-li\"><a href=\"#\">Términos de uso</a></li>\n");
      out.write("\t\t\t\t<li class=\"copy-ul-li\"><a href=\"#\">Privacidad y condiciones</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"../js/fontawesome-all.js\"></script>\n");
      out.write("<script src=\"../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write(" \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
