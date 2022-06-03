package Controlador;


import Datos.ColoresDao;
import Modelo.ColoresBin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletColores", value = "/ServletColores")
public class ServletColores extends HttpServlet {
    ColoresDao coloresDao=new ColoresDao();
    ColoresBin coloresBin=new ColoresBin();
    int id;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String accion=request.getParameter("accion");

        switch (accion) {
            case "listar":
                List<ColoresBin> lista=coloresDao.Select();
                request.setAttribute("colores",lista);
                request.getRequestDispatcher("views/Colores.jsp").forward(request,response);
                break;
            case "Editar":
                id=Integer.parseInt(request.getParameter("id"));
                ColoresBin talla=coloresDao.listarId(id);
                request.setAttribute("color",talla);
                request.getRequestDispatcher("ServletColores?menu=Colores&accion=listar").forward(request,response);
                break;
            case "Insertar":
                String nombre=request.getParameter("nombre");
                coloresBin.setNombre_color(nombre);
                coloresDao.insertar(coloresBin);
                request.getRequestDispatcher("ServletColores?menu=Colores&accion=listar").forward(request,response);
                break;
            case "Eliminar":
                id=Integer.parseInt(request.getParameter("id"));
                coloresBin.setId_color(id);
                coloresDao.borrar(coloresBin);
                request.getRequestDispatcher("ServletColores?menu=Colores&accion=listar").forward(request,response);

                break;

            case "Actualizar":
                String nom=request.getParameter("nombre");
                coloresBin.setNombre_color(nom);
                coloresBin.setId_color(id);
                coloresDao.modificar(coloresBin);
                request.getRequestDispatcher("ServletColores?menu=Colores&accion=listar").forward(request,response);
                break;

        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
