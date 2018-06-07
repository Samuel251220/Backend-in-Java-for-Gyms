package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservasTab_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TABLA DE RESERVAS</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/VarRoles.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/reservasTab.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/usuariosTab.css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        <h2 class=\"titulo\">TABLA DE RESERVAS</h2>\n");
      out.write("\t<div class=\"container contenedor\">\n");
      out.write("\t\t<table class=\"table table-striped \">\n");
      out.write("\t\t  <thead class=\"tabla\">\n");
      out.write("\t\t    <tr>\n");
      out.write("\t\t      <th scope=\"col\">#</th>\n");
      out.write("\t\t      <th scope=\"col\">Producto</th>\n");
      out.write("\t\t      <th scope=\"col\">Precio</th>\n");
      out.write("\t\t      <th scope=\"col\">Codigo</th>\n");
      out.write("\t\t      <th scope=\"col\">Cantidad</th>\n");
      out.write("\t\t      <th scope=\"col\">Fecha</th>\n");
      out.write("\t\t      <th scope=\"col\" colspan=\"2\">Accion</th>\n");
      out.write("\t\t    </tr>\n");
      out.write("\t\t  </thead>\n");
      out.write("\t\t  <tbody>\n");
      out.write("\t\t    <tr>\n");
      out.write("\t\t      <th scope=\"row\">1</th>\n");
      out.write("\t\t      <td>Producto1</td>\n");
      out.write("\t\t      <td>$50</td>\n");
      out.write("\t\t      <td>P-36985</td>\n");
      out.write("\t\t      <td>3</td>\n");
      out.write("\t\t      <td>05-05-2018</td>\n");
      out.write("\t\t      <td><i class=\"far fa-edit\"></i></td><td><i class=\"fas fa-trash-alt\"></i></td>\n");
      out.write("\t\t    </tr>\n");
      out.write("\t\t    <tr>\n");
      out.write("\t\t      <th scope=\"row\">2</th>\n");
      out.write("\t\t      <td>Producto2</td>\n");
      out.write("\t\t      <td>$20</td>\n");
      out.write("\t\t      <td>P-45285</td>\n");
      out.write("\t\t      <td>1</td>\n");
      out.write("\t\t      <td>05-05-2018</td>\n");
      out.write("\t\t      <td><i class=\"far fa-edit\"></i></td><td><i class=\"fas fa-trash-alt\"></i></td>\n");
      out.write("\t\t    </tr>\n");
      out.write("\t\t    <tr>\n");
      out.write("\t\t      <th scope=\"row\">3</th>\n");
      out.write("\t\t      <td>Producto3</td>\n");
      out.write("\t\t      <td>$150</td>\n");
      out.write("\t\t      <td>P-96385</td>\n");
      out.write("\t\t      <td>10</td>\n");
      out.write("\t\t      <td>05-05-2018</td>\n");
      out.write("\t\t      <td><i class=\"far fa-edit\"></i></td><td><i class=\"fas fa-trash-alt\"></i></td>\n");
      out.write("\t\t    </tr>\n");
      out.write("\t\t  </tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"../js/fontawesome-all.js\"></script>\n");
      out.write("\n");
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
