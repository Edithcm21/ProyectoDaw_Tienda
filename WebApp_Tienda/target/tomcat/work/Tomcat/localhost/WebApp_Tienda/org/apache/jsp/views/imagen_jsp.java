/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-29 00:53:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.ImagenBin;
import java.util.List;

public final class imagen_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--\r\n");
      out.write("<div style=\"text-align: center;\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <form action=\"../Controlador\" METHOD=\"post\">\r\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"listar\">\r\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Nuevo\">\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        <table>\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>ID</th>\r\n");
      out.write("                <th>NOMBRES</th>\r\n");
      out.write("                <th>FOTOS</th>\r\n");
      out.write("                <th>ACCONES</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

                List<ImagenBin> cat=(List<ImagenBin>)request.getAttribute("categorias");
                if(cat!=null)
                {
                    for(ImagenBin list:cat)
                    {
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(list.getId());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(list.getNombre());
      out.write("</td>\r\n");
      out.write("                <td><img src=\"ControlerIMG?id=");
      out.print(list.getId());
      out.write("\" width=\"250\" height=\"230\" alt=\"\"></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <form action=\"../Controlador\" METHOD=\"post\">\r\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"editar\">\r\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"eliminar\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("               ");
 }
               }
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("!-->\r\n");
      out.write("<div>\r\n");
      out.write("    <h1>Agregar Usuario</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"Controlador\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("    <label>id producto</label>\r\n");
      out.write("    <input type=\"text\" name=\"Id\">\r\n");
      out.write("    <label>talla</label>\r\n");
      out.write("    <input type=\"text\" name=\"talla\">\r\n");
      out.write("    <label>color</label>\r\n");
      out.write("    <input type=\"text\" name=\"color\">\r\n");
      out.write("    <label>foto</label>\r\n");
      out.write("    <input type=\"file\" name=\"foto\">\r\n");
      out.write("    <label>precio</label>\r\n");
      out.write("    <input type=\"text\" name=\"precio\">\r\n");
      out.write("    <label>cantidad</label>\r\n");
      out.write("    <input type=\"number\" name=\"cantidad\">\r\n");
      out.write("    <input type=\"submit\" name=\"accion\" value=\"Guardar\">\r\n");
      out.write("    <input type=\"submit\" name=\"accion\" value=\"regresar\">\r\n");
      out.write("    <input type=\"submit\" name=\"accion\"  value=\"Insertar\" class=\"btn btn-info\">\r\n");
      out.write("</form>\r\n");
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
