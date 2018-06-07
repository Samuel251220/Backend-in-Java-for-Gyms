package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class articulos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/view/../WEB-INF/template/headvar.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/headerMain.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/FooterVarInicioLinks.jspf");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/nosotros.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/inicio.css\"/>   \n");
      out.write("<link rel=\"stylesheet\" href=\"../css/articulos.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menu?op=3\">Articulos</a></li>\r\n");
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
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"speed\">\n");
      out.write("              <div class=\"input-group stylish-input-group cont\">\n");
      out.write("                <input type=\"text\" placeholder=\"Busca por codigo\" class=\"form-control\">\n");
      out.write("                <span class=\"input-group-addon\">\n");
      out.write("                  <button type=\"submit\">\n");
      out.write("                    <i class=\"fas fa-search\"></i>\n");
      out.write("                  </button>  \n");
      out.write("                </span>\n");
      out.write("              </div>\n");
      out.write("              <hr>\n");
      out.write("              <ul class=\"opciones\">\n");
      out.write("                <li class=\"opc\"><a href=\"#\">NEW</a></li>\n");
      out.write("                <li class=\"opc\"><a href=\"#\">TODO</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"prod\">\n");
      out.write("              <ul class=\"productos\">\n");
      out.write("                <li class=\"pro\">\n");
      out.write("                  <div class=\"desc\">\n");
      out.write("                    <p>Nombre del Producto</p>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"prec\">\n");
      out.write("                      <p>Precio: </p>\n");
      out.write("                      <span class=\"precio\">S/ 50</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"descP\">\n");
      out.write("                      <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"imgpro new\"><img src=\"../img/prod1.jpg\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"pro\">\n");
      out.write("                  <div class=\"desc\">\n");
      out.write("                    <p>Nombre del Producto</p>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"prec\">\n");
      out.write("                      <p>Precio: </p>\n");
      out.write("                      <span class=\"precio\">S/ 50</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"descP\">\n");
      out.write("                      <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"pro\">\n");
      out.write("                  <div class=\"desc\">\n");
      out.write("                    <p>Nombre del Producto</p>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"prec\">\n");
      out.write("                      <p>Precio: </p>\n");
      out.write("                      <span class=\"precio\">S/ 50</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"descP\">\n");
      out.write("                      <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"pro\">\n");
      out.write("                  <div class=\"desc\">\n");
      out.write("                    <p>Nombre del Producto</p>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"prec\">\n");
      out.write("                      <p>Precio: </p>\n");
      out.write("                      <span class=\"precio\">S/ 50</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"descP\">\n");
      out.write("                      <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"pro\">\n");
      out.write("                  <div class=\"desc\">\n");
      out.write("                    <p>Nombre del Producto</p>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"prec\">\n");
      out.write("                      <p>Precio: </p>\n");
      out.write("                      <span class=\"precio\">S/ 50</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"descP\">\n");
      out.write("                      <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"pro1\">\n");
      out.write("                  <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\n");
      out.write("                  <div class=\"desc1\">\n");
      out.write("                    <strong style=\"color: #122b40;width: 100%;\">Nombre Producto</strong><br><br>\n");
      out.write("                    <strong style=\"width: 100%;\">S/ 50.00</strong><br><br>\n");
      out.write("                    <div class=\"botones\">\n");
      out.write("                      <button class=\"btn btn-info\">Pedir</button>\n");
      out.write("                      <button class=\"btn btn-primary\">Ver mas</button>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"../js/fontawesome-all.js\"></script>");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
