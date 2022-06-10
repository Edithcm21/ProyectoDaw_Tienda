/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-06-10 00:58:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Datos.CategoriaDao;
import Modelo.CategoriaBin;
import Modelo.ProductosColorTallaBin;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Luyed</title>\n");
      out.write("    <link rel=\"icon\" href=\"images/logo.jpg\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Styles/Botones.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Styles/menu.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <STYLE>\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border: 15px black;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th,\n");
      out.write("        td {\n");
      out.write("            padding: 15px;\n");
      out.write("            color: black;\n");
      out.write("            border: 3px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        fieldset{\n");
      out.write("            width: 50vh;\n");
      out.write("        }\n");
      out.write("        .marqui{\n");
      out.write("            font-family: BlinkMacSystemFont, sans-serif;\n");
      out.write("            color: lightcoral;\n");
      out.write("            size: 35px;\n");
      out.write("            height: 55px;\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .padre {\n");
      out.write("            background-color: #fafafa;\n");
      out.write("            margin: 1rem;\n");
      out.write("            padding: 1rem;\n");
      out.write("            border: 2px solid #ccc;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </STYLE>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<marquee behavior=\"ALTERNATE\" class=\"marqui\" ><br><b>ENVÍOS GRATIS A PARTIR DE $899 PESOS A TODA LA REPÚBLICA MEXICANA </b></marquee>\n");
      out.write("<nav >\n");
      out.write("    <ul class=\"menu-horizontal\">\n");
      out.write("        <li>\n");
      out.write("            <a href=\"ServletPrincipal?accion=home&id=0\">Productos</a>\n");
      out.write("            <ul class=\"menu-vertical\">\n");
      out.write("                ");

                    CategoriaDao dao=new CategoriaDao();
                    List<CategoriaBin> lista=dao.Select();
                    if(lista!=null)
                    {
                        for (CategoriaBin r:lista) {
                
      out.write("\n");
      out.write("                <li><a href=\"ServletPrincipal?accion=home&id=");
      out.print(r.getId_categoria());
      out.write('"');
      out.write('>');
      out.print(r.getNombre_categoria());
      out.write("</a></li>\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li><a >              </a></li>\n");
      out.write("        <li><a >              </a></li>\n");
      out.write("        <li><a href=\"#\">Tejiendo con el corazon </a></li>\n");
      out.write("        <li><a >              </a></li>\n");
      out.write("        <li><a href=\"views/Login.jsp\" methods=\"post\">Acceder\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <li><a href=\"#\">Carrito</a></li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("    ");

        List<ProductosColorTallaBin> productos=(List)request.getAttribute("productos");
        if(productos!=null)
        {
            for(ProductosColorTallaBin list:productos)
            {
    
      out.write("\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("        <table >\n");
      out.write("            <tr>\n");
      out.write("                <td><h4>");
      out.print(list.getNombre());
      out.write("</h4></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"images/");
      out.print(list.getFoto());
      out.write("\" width=\"200\" height=\"180\" alt=\"\">\n");
      out.write("                    <br>\n");
      out.write("                    $ ");
      out.print(list.getPrecio());
      out.write("\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> Talla ");
      out.print(list.getTallan());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> ");
      out.print(list.getDescripcion());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td><a href=\"views/Login.jsp\"><input type=\"submit\"  class=\"boton-7\" value=\"Agregar carrito\"></a><a href=\"views/Login.jsp\"><input type=\"submit\" class=\"boton-7\" value=\"Comprar\"></a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

            }
        }
    
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<img src=\"images/portada.jpg\" width=\"100%\" height=\"80%\" alt=\"\">\n");
      out.write("<div class=\"padre\">\n");
      out.write("    <img src=\"images/ACCESORIOS.jpg\" width=\"30%\" height=\"30%\" alt=\"\">\n");
      out.write("    <img src=\"images/AMIGURUMIS-1.jpg\" width=\"30%\" height=\"30%\" alt=\"\">\n");
      out.write("    <img src=\"images/BEBE003-1.jpg\" width=\"30%\" height=\"30%\" alt=\"\">\n");
      out.write("</div>\n");
      out.write("<div class=\"padre\">\n");
      out.write("    <img src=\"images/DECO3-2.jpg\" width=\"30%\" height=\"30%\" alt=\"\">\n");
      out.write("    <img src=\"images/MODA.jpg\" width=\"30%\" height=\"30%\" alt=\"\">\n");
      out.write("    <img src=\"images/AMIGURUMIS-1.jpg\" width=\"30%\" height=\"30%\" alt=\"\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
