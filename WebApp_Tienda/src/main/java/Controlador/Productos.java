package Controlador;
import Datos.ColoresDao;
import Datos.ProductosColorTallaDao;
import Datos.ProductosDao;
import Datos.TallasDao;
import Modelo.ColoresBin;
import Modelo.ProductosBin;
import Modelo.ProductosColorTallaBin;
import Modelo.TallasBin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Productos", value = "/Productos")
public class Productos extends HttpServlet {
    ProductosColorTallaBin bin=new ProductosColorTallaBin();
    ProductosColorTallaDao dao=new ProductosColorTallaDao();
    ProductosDao productosDao=new ProductosDao();
    ColoresDao coloresDao=new ColoresDao();
    TallasDao tallasDao=new TallasDao();
    int id_;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String accion=request.getParameter("accion");

        switch (accion) {
            case "listar":
                List<ProductosColorTallaBin> lista=dao.Select();
                request.setAttribute("productos",lista);
                List<ColoresBin> colores=coloresDao.Select();
                request.setAttribute("colores",colores);
                List<ProductosBin> prop=productosDao.Select();
                request.setAttribute("prodp",prop);
                List<TallasBin> tallas=tallasDao.Select();
                request.setAttribute("tallas",tallas);
                request.getRequestDispatcher("views/Productos.jsp").forward(request,response);
                break;
            case "Editar":
                id_=Integer.parseInt(request.getParameter("id_alterno"));
                ProductosColorTallaBin producto=dao.listarId(id_);
                request.setAttribute("producto",producto);
                request.getRequestDispatcher("Productos?menu=Tallas&accion=listar").forward(request,response);
                break;
            case "Insertar":
                int id= Integer.parseInt(request.getParameter("id"));
                int talla= Integer.parseInt(request.getParameter("talla"));
                int color= Integer.parseInt(request.getParameter("color"));
                int cantidad= Integer.parseInt(request.getParameter("cantidad"));
                String imagen= request.getParameter("foto");
                int precio=Integer.parseInt(request.getParameter("precio"));
                ProductosColorTallaBin nuevo=new ProductosColorTallaBin(id,color,talla,cantidad,imagen,precio);
                dao.insertar(nuevo);
                request.getRequestDispatcher("Productos?menu=Tallas&accion=listar").forward(request,response);
                break;
            case "Eliminar":
                id=Integer.parseInt(request.getParameter("id_alterno"));
                ProductosColorTallaBin i=new ProductosColorTallaBin(id);
                dao.borrar(i);
                request.getRequestDispatcher("Productos?menu=Tallas&accion=listar").forward(request,response);
                break;

            case "Actualizar":
                int id2= Integer.parseInt(request.getParameter("id"));
                int talla2= Integer.parseInt(request.getParameter("talla"));
                int color2= Integer.parseInt(request.getParameter("color"));
                int cantidad2= Integer.parseInt(request.getParameter("cantidad"));
                String imagen2= request.getParameter("foto");
                int precio2=Integer.parseInt(request.getParameter("precio"));
                ProductosColorTallaBin n=new ProductosColorTallaBin(id2,id_,color2,talla2,cantidad2,imagen2,precio2);
                dao.Modificartotal(n);
                request.getRequestDispatcher("Productos?menu=Tallas&accion=listar").forward(request,response);
                break;

            default:
                request.getRequestDispatcher("Productos?menu=Tallas&accion=listar").forward(request,response);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
