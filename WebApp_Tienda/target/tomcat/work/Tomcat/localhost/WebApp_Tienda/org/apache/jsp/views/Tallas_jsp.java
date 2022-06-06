/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-06-06 17:27:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.TallasBin;
import java.util.List;

public final class Tallas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Tallas</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .izquierda{\r\n");
      out.write("\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            width: 30%;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .derecha{\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            width: 70%;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        #pantalla-dividida{\r\n");
      out.write("            display: flex;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Styles/Style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Styles/Botones.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"pantalla-dividida\">\r\n");
      out.write("    <div class=\"izquierda\">\r\n");
      out.write("        <fieldset >\r\n");
      out.write("            <form action=\"ServletTallas?menu=Tallas\" method=\"get\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label>Nombre de talla</label>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        ");

                            TallasBin valor= (TallasBin) request.getAttribute("talla");
                            if (valor == null) {
                        
      out.write("\r\n");
      out.write("                        <input type=\"text\" name=\"nombre\"  class=\"form-control\">\r\n");
      out.write("                        ");

                        } else {
                        
      out.write("\r\n");
      out.write("                        <input type=\"text\" name=\"nombre\" value=\"");
      out.print(valor.getNombretalla());
      out.write("\"  class=\"form-control\">\r\n");
      out.write("                        ");
 }
                        
      out.write("\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br><br>\r\n");
      out.write("\r\n");
      out.write("                <input type=\"submit\" name=\"accion\"  value=\"Insertar\" class=\"boton-3\">\r\n");
      out.write("                <input type=\"submit\" name=\"accion\"  value=\"Actualizar\" class=\"boton-3\" >\r\n");
      out.write("            </form>\r\n");
      out.write("            <input type=\"button\" value=\"Página anterior\" onClick=\"history.go(-1);\" class=\"boton-7\">\r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"derecha\">\r\n");
      out.write("        <table >\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>ID</th>\r\n");
      out.write("                <th>Nombre</th>\r\n");
      out.write("                <th>ACCIONES</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

                List<TallasBin> talla=(List)request.getAttribute("tallas");
                if(talla!=null)
                {
                    for(TallasBin list:talla)
                    {
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(list.getId_talla() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(list.getNombretalla());
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <a class=\"boton-8\" href=\"ServletTallas?menu=ServletTallas&accion=Editar&id=");
      out.print(list.getId_talla());
      out.write("\">Editar </a>\r\n");
      out.write("                    <a class=\"boton-8\" href=\"ServletTallas?menu=ServletTallas&accion=Eliminar&id=");
      out.print(list.getId_talla());
      out.write("\">Eliminar</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                }
            }
            else
            {
            
      out.write("\r\n");
      out.write("            <option value=\"No hay categorias\"></option>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>>\r\n");
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
