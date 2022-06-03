package Controlador;

import Datos.TallasDao;
import Modelo.TallasBin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletTallas", value = "/ServletTallas")
public class ServletTallas extends HttpServlet {
    TallasBin tallabin=new TallasBin();
    TallasDao tallasDao=new TallasDao();
    int id;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String accion=request.getParameter("accion");

        switch (accion) {
            case "listar":
                List<TallasBin> lista=tallasDao.Select();
                request.setAttribute("tallas",lista);
                request.getRequestDispatcher("views/Tallas.jsp").forward(request,response);
                break;
            case "Editar":
                id=Integer.parseInt(request.getParameter("id"));
                TallasBin talla=tallasDao.listarId(id);
                request.setAttribute("talla",talla);
                request.getRequestDispatcher("ServletTallas?menu=Tallas&accion=listar").forward(request,response);
                break;
            case "Insertar":
                String nombre=request.getParameter("nombre");
                tallabin.setNombretalla(nombre);
                tallasDao.insertar(tallabin);
                request.getRequestDispatcher("ServletTallas?menu=Tallas&accion=listar").forward(request,response);
                break;
            case "Eliminar":
                id=Integer.parseInt(request.getParameter("id"));
                tallabin.setId_talla(id);
                tallasDao.borrar(tallabin);
                request.getRequestDispatcher("ServletTallas?menu=Tallas&accion=listar").forward(request,response);

                break;

            case "Actualizar":
                String nom=request.getParameter("nombre");
                tallabin.setNombretalla(nom);
                tallabin.setId_talla(id);
                tallasDao.modificar(tallabin);
                request.getRequestDispatcher("ServletTallas?menu=Tallas&accion=listar").forward(request,response);
                break;

        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");

        System.out.println("Hola desde post");


    }
}
