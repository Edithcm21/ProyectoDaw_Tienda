/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-06-04 22:52:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Clientes</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Clientes</h1>\r\n");
      out.write("<div>\r\n");
      out.write("    <form action=\"Controlador?menu=Categorias\" method=\"GET\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Nombre</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"nombre\"  class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Apellidos</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"apellidos\"  class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Colonia</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"colonia\"  class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Ciudad</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"ciudad\"  class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Calle</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"calle\"  class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Avenida</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"avenida\"  class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>estado</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"estado\"  class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Correo</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"correo\" value=\"");
String user = (String) request.getAttribute("user");
      out.write("\" class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            <label>password</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"password\" value=\"");
String pas= (String) request.getAttribute("password");
      out.write("\" class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Telefono</label>\r\n");
      out.write("            <label><input type=\"text\" name=\"telefono\"  class=\"\" maxlength=\"30\" required></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" name=\"accion\"  value=\"Guardar Registro\" class=\"boton-3\">\r\n");
      out.write("    </form>\r\n");
      out.write("    <a href=\"index.jsp\"><input type=\"submit\"  value=\"Regresar al inicio\" class=\"boton-3\" ></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}