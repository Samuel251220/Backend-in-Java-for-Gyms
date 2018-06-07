package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/view/../WEB-INF/template/LinksRolesHead.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/VarGerente.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/LinksRolesFooter.jspf");
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
      out.write("    <title>JSP Page</title>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/VarRoles.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/reservasTab.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/usuariosTab.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/producto.css\">\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("<header class>\n");
      out.write("\n");
      out.write("\t    <nav class=\"navbar navbar-inverse navbar-static-top barra\" role=\"navigation\"> \n");
      out.write("\t\t    <div class=\"container\">\n");
      out.write("\t\t\t    <div class=\"navbar-header\">\n");
      out.write("\t\t\t    \t<i class=\"pesa fas fa-dumbbell\"></i>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navegacion\" aria-expended=\"false\" aria-controls=\"navbar\">\n");
      out.write("\t\t\t\t\t    <span class=\"sr-only\">Ocultar</span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t    </button>\n");
      out.write("\n");
      out.write("\t\t\t\t    <a href=\"#\" class=\"navbar-brand\">Stronger GYM</a> \n");
      out.write("\t\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"navegacion\">\n");
      out.write("\n");
      out.write("\t\t\t\t    <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t      \n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"#\">Usuarios</a></li><!-- class=\"active\"-->\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"#\">Reserva</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"#\">Productos</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"#\">Reportes</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar cont-flecha\"><i class=\"far fa-arrow-alt-circle-right flecha\"></i></li>\n");
      out.write("\t\t\t\t    \t\n");
      out.write("\t\t\t\t    </ul> \n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t    </nav>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"speed\">\r\n");
      out.write("        <div class=\"input-group stylish-input-group cont\">\r\n");
      out.write("          <input type=\"text\" placeholder=\"Busca por codigo\" class=\"form-control\">\r\n");
      out.write("          <span class=\"input-group-addon\">\r\n");
      out.write("            <button type=\"submit\">\r\n");
      out.write("              <i class=\"fas fa-search\"></i>\r\n");
      out.write("            </button>  \r\n");
      out.write("          </span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <ul class=\"opciones\">\r\n");
      out.write("          <li class=\"opc\"><a href=\"#\">NEW</a></li>\r\n");
      out.write("          <li class=\"opc\"><a href=\"#\">TODO</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"prod\">\r\n");
      out.write("        <ul class=\"productos\">\r\n");
      out.write("          <li class=\"pro\">\r\n");
      out.write("            <div class=\"desc\">\r\n");
      out.write("              <p>Nombre del Producto</p>\r\n");
      out.write("              <hr>\r\n");
      out.write("              <div class=\"prec\">\r\n");
      out.write("                <p>Precio: </p>\r\n");
      out.write("                <span class=\"precio\">S/ 50</span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"descP\">\r\n");
      out.write("                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imgpro new\"><img src=\"../img/prod1.jpg\"></div>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"pro\">\r\n");
      out.write("            <div class=\"desc\">\r\n");
      out.write("              <p>Nombre del Producto</p>\r\n");
      out.write("              <hr>\r\n");
      out.write("              <div class=\"prec\">\r\n");
      out.write("                <p>Precio: </p>\r\n");
      out.write("                <span class=\"precio\">S/ 50</span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"descP\">\r\n");
      out.write("                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"pro\">\r\n");
      out.write("            <div class=\"desc\">\r\n");
      out.write("              <p>Nombre del Producto</p>\r\n");
      out.write("              <hr>\r\n");
      out.write("              <div class=\"prec\">\r\n");
      out.write("                <p>Precio: </p>\r\n");
      out.write("                <span class=\"precio\">S/ 50</span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"descP\">\r\n");
      out.write("                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"pro\">\r\n");
      out.write("            <div class=\"desc\">\r\n");
      out.write("              <p>Nombre del Producto</p>\r\n");
      out.write("              <hr>\r\n");
      out.write("              <div class=\"prec\">\r\n");
      out.write("                <p>Precio: </p>\r\n");
      out.write("                <span class=\"precio\">S/ 50</span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"descP\">\r\n");
      out.write("                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"pro\">\r\n");
      out.write("            <div class=\"desc\">\r\n");
      out.write("              <p>Nombre del Producto</p>\r\n");
      out.write("              <hr>\r\n");
      out.write("              <div class=\"prec\">\r\n");
      out.write("                <p>Precio: </p>\r\n");
      out.write("                <span class=\"precio\">S/ 50</span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"descP\">\r\n");
      out.write("                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"pro1\">\r\n");
      out.write("            <div class=\"imgpro\"><img src=\"../img/prod1.jpg\"></div>\r\n");
      out.write("            <div class=\"desc1\">\r\n");
      out.write("              <strong style=\"color: #122b40;width: 100%;\">Nombre Producto</strong><br><br>\r\n");
      out.write("              <strong style=\"width: 100%;\">S/ 50.00</strong><br><br>\r\n");
      out.write("              <div class=\"botones\">\r\n");
      out.write("                <button class=\"btn btn-info\">Pedir</button>\r\n");
      out.write("                <button class=\"btn btn-primary\">Ver mas</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"../js/fontawesome-all.js\"></script>\n");
      out.write("\r\n");
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
