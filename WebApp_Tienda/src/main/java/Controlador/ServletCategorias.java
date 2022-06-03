package Controlador;

import Datos.CategoriaDao;
import Modelo.CategoriaBin;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Controlador", value = "/Controlador")
public class ServletCategorias extends HttpServlet {
    CategoriaBin categoriaBin = new CategoriaBin();
    CategoriaDao categoriaDao = new CategoriaDao();
    int id;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        //System.out.println(accion+"desde get");


        switch (accion) {
            case "listar":
                List<CategoriaBin> lista = categoriaDao.Select();
                request.setAttribute("categorias", lista);
                request.getRequestDispatcher("views/Categoria2.jsp").forward(request, response);
                break;
            case "Editar":
                id = Integer.parseInt(request.getParameter("id"));
                CategoriaBin cat = categoriaDao.listarId(id);
                request.setAttribute("categoriase", cat);
                request.getRequestDispatcher("Controlador?menu=Categorias&accion=listar").forward(request, response);
                break;
            case "Insertar":
                String nombre = request.getParameter("nombre");
                categoriaBin.setNombre_categoria(nombre);
                categoriaDao.insertar(categoriaBin);
                request.getRequestDispatcher("Controlador?menu=Categorias&accion=listar").forward(request, response);
                break;
            case "Eliminar":
                id = Integer.parseInt(request.getParameter("id"));
                categoriaBin.setId_categoria(id);
                categoriaDao.borrar(categoriaBin);
                request.getRequestDispatcher("Controlador?menu=Categorias&accion=listar").forward(request, response);

                break;

            case "Actualizar":
                String nom = request.getParameter("nombre");
                categoriaBin.setNombre_categoria(nom);
                categoriaBin.setId_categoria(id);
                categoriaDao.modificar(categoriaBin);
                request.getRequestDispatcher("Controlador?menu=Categorias&accion=listar").forward(request, response);
                break;

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
