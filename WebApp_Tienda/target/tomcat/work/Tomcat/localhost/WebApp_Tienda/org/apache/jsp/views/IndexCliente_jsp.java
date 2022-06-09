/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-06-09 00:13:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.ClientesBin;
import Datos.CategoriaDao;
import Modelo.CategoriaBin;
import java.util.List;
import Modelo.ProductosColorTallaBin;

public final class IndexCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Luyed</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"images/logo.jpg\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Styles/Botones.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Styles/menu.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Styles/Style.css\">\r\n");
      out.write("\r\n");
      out.write("    <STYLE>\r\n");
      out.write("        table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border: 15px black;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th,\r\n");
      out.write("        td {\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            border: 3px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        fieldset{\r\n");
      out.write("            width: 50vh;\r\n");
      out.write("        }\r\n");
      out.write("    </STYLE>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav >\r\n");
      out.write("    <ul class=\"menu-horizontal\">\r\n");
      out.write("        <li>\r\n");
      out.write("            ");

                ClientesBin cliente= (ClientesBin) request.getAttribute("cliente");
            
      out.write("\r\n");
      out.write("            <a href=\"ServletPrincipal?accion=cliente&id=0&id_cliente=");
      out.print(cliente.getId_cliente());
      out.write("\">Productos</a>\r\n");
      out.write("            <ul class=\"menu-vertical\">\r\n");
      out.write("                ");

                    CategoriaDao dao=new CategoriaDao();
                    List<CategoriaBin> lista=dao.Select();
                    if(lista.size()>0)
                    {
                        for (CategoriaBin r:lista) {
                
      out.write("\r\n");
      out.write("                <li><a href=\"ServletPrincipal?accion=cliente&id=");
      out.print(r.getId_categoria());
      out.write("&id_cliente=");
      out.print(cliente.getId_cliente());
      out.write('"');
      out.write('>');
      out.print(r.getNombre_categoria());
      out.write("</a></li>\r\n");
      out.write("                ");

                        }
                    }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li><a >              </a></li>\r\n");
      out.write("        <li><a >              </a></li>\r\n");
      out.write("        <li><a >Tejiendo con el corazon </a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <li><a>");
      out.print(cliente.getNombre());
      out.write(' ');
      out.print(cliente.getApellido());
      out.write("</a>\r\n");
      out.write("        <ul class=\"menu-vertical\">\r\n");
      out.write("            <li><a href=\"index.jsp\">Cerrar Sesion</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"ServletPrincipal?accion=carrito\">Carrito</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div >\r\n");
      out.write("\r\n");
      out.write("    ");

        List<ProductosColorTallaBin> productos=(List)request.getAttribute("productos");
        if(productos!=null)
        {
            for(ProductosColorTallaBin list:productos)
            {
    
      out.write("\r\n");
      out.write("    <div >\r\n");
      out.write("\r\n");
      out.write("        <table >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><h4>");
      out.print(list.getNombre());
      out.write("</h4></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <img src=\"images/");
      out.print(list.getFoto());
      out.write("\" width=\"200\" height=\"180\" alt=\"\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    $ ");
      out.print(list.getPrecio());
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td> ");
      out.print(list.getDescripcion());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("\r\n");
      out.write("                <td><a href=\"ServletPrincipal?accion=AgregarCarrito&idpa=");
      out.print(list.getId_alterno());
      out.write("\"><input type=\"submit\"  class=\"boton-7\" value=\"Agregar carrito\"></a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <br>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

            }
        }
        else{
    
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<img src=\"images/imagenfondoempleado.jpg\" alt=\"\" width=\"100%\" height=\"757\">\r\n");
}
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
