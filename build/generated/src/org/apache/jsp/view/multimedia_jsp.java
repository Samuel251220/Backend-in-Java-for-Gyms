package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class multimedia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/adipoli.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/multimedia.css\">\n");
      out.write("\t<script src=\"../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("\t<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.adipoli.min.js\"></script>\n");
      out.write("        <script src=\"../js/multimedia.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2 class=\"title_section\" >ULTIMAS IMAGENES</h2>\n");
      out.write("\t\t\t<div class=\"row mb48\">\n");
      out.write("                            <div class=\"col-md-4\"><a href=\"\"><img src=\"../img/uno.jpg\" alt=\"\" class=\"img-responsive hoveri\"></a></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"><a href=\"\"><img src=\"../img/dos.jpg\" alt=\"\" class=\"img-responsive hoveri\"></a></div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"><a href=\"\"><img src=\"../img/tres.jpg\" alt=\"\" class=\"img-responsive hoveri\"></a></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
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
