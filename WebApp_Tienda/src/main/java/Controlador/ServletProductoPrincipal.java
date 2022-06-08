package Controlador;

import Datos.CategoriaDao;
import Datos.ProductosDao;
import Modelo.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletProductoPrincipal", value = "/ServletProductoPrincipal")
public class ServletProductoPrincipal extends HttpServlet {
    ProductosBin bin=new ProductosBin();
    ProductosDao dao=new ProductosDao();
    CategoriaDao categoria=new CategoriaDao();
    int id_;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String accion=request.getParameter("accion");

        switch (accion) {
            case "listar":
                List<ProductosBin> lista=dao.Select();
                request.setAttribute("productos",lista);
                List<CategoriaBin> cat=categoria.Select();
                request.setAttribute("categorias",cat);
                request.getRequestDispatcher("views/ProductoPrincipal.jsp").forward(request,response);
                break;
            case "Editar":
                id_=Integer.parseInt(request.getParameter("id"));
                ProductosBin producto=dao.listarId(id_);
                request.setAttribute("producto",producto);
                request.getRequestDispatcher("ServletProductoPrincipal?menu=Productos&accion=listar").forward(request,response);
                break;
            case "Insertar":
                String nombre= request.getParameter("Nombre");
                int categoria= Integer.parseInt(request.getParameter("Categoria"));
                String descripcion= request.getParameter("Descripcion");
                ProductosBin nuevo=new ProductosBin(nombre,categoria,descripcion);
                dao.insertar(nuevo);
                request.getRequestDispatcher("ServletProductoPrincipal?menu=Productos&accion=listar").forward(request,response);
                break;
            case "Eliminar":
                id_=Integer.parseInt(request.getParameter("id"));
                ProductosBin i=new ProductosBin(id_);
                dao.borrar(i);
                request.getRequestDispatcher("ServletProductoPrincipal?menu=Productos&accion=listar").forward(request,response);
                break;

            case "Actualizar":
                String nombre1=request.getParameter("Nombre");
                String des=request.getParameter("Descripcion");
                int c=Integer.parseInt(request.getParameter("Categoria"));
                ProductosBin n=new ProductosBin(id_,nombre1,c,des);
                dao.Modificartotal(n);
                request.getRequestDispatcher("ServletProductoPrincipal?menu=Productos&accion=listar").forward(request,response);
                break;

            default:
                request.getRequestDispatcher("ServletProductoPrincipal?menu=Productos&accion=listar").forward(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
