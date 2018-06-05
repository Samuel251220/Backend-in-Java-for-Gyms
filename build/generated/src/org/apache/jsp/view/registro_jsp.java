package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/view/../WEB-INF/template/headLogin.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/headerRegistrar.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/footerLogin.jspf");
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
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/estilos.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/cssLogin.css\">\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("      ");
      out.write("<header>\r\n");
      out.write("  <nav class=\"navbar navbar-inverse navbar-static-top\" role=\"navigation\"> <!-- el inverse es para que cambien los colores y el static top es para que el menu se mantenga en la parte de arriba de la pagina -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"navbar-header\">\r\n");
      out.write("        <i class=\"pesa fas fa-dumbbell\"></i>\r\n");
      out.write("        <!-- Esto es para hacer el boton que se muestra cuando el dispositivo es mediano-->\r\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navegacion\" aria-expended=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("          <span class=\"sr-only\">Ocultar</span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"#\" class=\"navbar-brand\">Stronger GYM</a> <!-- Este es el titulo que va en el menu-->\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Aqui se iniciara el menu-->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"collapse navbar-collapse navbar-right\" id=\"navegacion\"> <!-- El id que se agrega aqui debe de llevar el mismo nombre que se ingreso en el data-target que va en el boton que se muestra en dispositivos medianos-->\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("          <li class=\"bar\"><a href=\"#\">Inicio</a></li><!-- class=\"active\"-->\r\n");
      out.write("          <li class=\"bar\"><a href=\"#\">Nosotros</a></li>\r\n");
      out.write("          <li class=\"bar\"><a href=\"#\">Articulos</a></li>\r\n");
      out.write("          <li class=\"bar\"><a href=\"#\">Multimedia</a></li>\r\n");
      out.write("        </ul> \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("      <div class=\"contentAll\">\r\n");
      out.write("        <div class=\"imgL\" style=\"background-image: url(../img/login.jpg);\">Log In</div>\r\n");
      out.write("        <div class=\"formuDiv\">\r\n");
      out.write("          <form class=\"formu\">\r\n");
      out.write("            <div class=\"divI\">\r\n");
      out.write("              <label>Username: </label>\r\n");
      out.write("              <input type=\"text\" placeholder=\"Enter username\" class=\"txt\"><br><br>\r\n");
      out.write("              <label>Password: </label>\r\n");
      out.write("              <input type=\"password\" placeholder=\"Enter password\" class=\"txt\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"divO\">\r\n");
      out.write("              <div>\r\n");
      out.write("                <input type=\"checkbox\"><span class=\"checkS\">Remember me</span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"divF\">\r\n");
      out.write("                <span>forgot password?</span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"divB\">\r\n");
      out.write("              <input type=\"button\" value=\"Log In\" class=\"btnL\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("<script src=\"../js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
