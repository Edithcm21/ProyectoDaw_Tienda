package Controlador;

import Datos.TipoEmpleadoDao;
import Modelo.TipoEmpleadoBin;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletTipo_Empleados", value = "/ServletTipo_Empleados")
public class ServletTipo_Empleados extends HttpServlet {
    TipoEmpleadoBin empleadoBin=new TipoEmpleadoBin();
    TipoEmpleadoDao empleadoDao=new TipoEmpleadoDao();
    int id;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String accion=request.getParameter("accion");

        switch (accion) {
            case "listar":
                List<TipoEmpleadoBin> lista=empleadoDao.Select();
                request.setAttribute("tipos",lista);
                request.getRequestDispatcher("views/Tipo_Empleados.jsp").forward(request,response);
                break;
            case "Editar":
                id=Integer.parseInt(request.getParameter("id"));
                TipoEmpleadoBin tipo=empleadoDao.listarId(id);
                request.setAttribute("tipo",tipo);
                request.getRequestDispatcher("ServletTipo_Empleados?menu=Tipo_Empleado&accion=listar").forward(request,response);
                break;
            case "Insertar":
                String nombre=request.getParameter("nombre");
                empleadoBin.setTipo(nombre);
                empleadoDao.insertar(empleadoBin);
                request.getRequestDispatcher("ServletTipo_Empleados?menu=Tipo_Empleado&accion=listar").forward(request,response);
                break;
            case "Eliminar":
                id=Integer.parseInt(request.getParameter("id"));
                empleadoBin.setId_tipo(id);
                empleadoDao.borrar(empleadoBin);
                request.getRequestDispatcher("ServletTipo_Empleados?menu=Tipo_Empleado&accion=listar").forward(request,response);

                break;

            case "Actualizar":
                String nom=request.getParameter("nombre");
                empleadoBin.setTipo(nom);
                empleadoBin.setId_tipo(id);
                empleadoDao.modificar(empleadoBin);
                request.getRequestDispatcher("ServletTipo_Empleados?menu=Tipo_Empleado&accion=listar").forward(request,response);
                break;

        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
