package Controlador;

import Datos.ClientesDao;
import Datos.EmpleadosDao;
import Modelo.ClientesBin;
import Modelo.EmpleadosBin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ControladorValidar", value = "/ControladorValidar")
public class ControladorValidar extends HttpServlet {
    EmpleadosBin empleadosBin=new EmpleadosBin();
    EmpleadosDao empleadosDao=new EmpleadosDao();
    ClientesBin clientesBin=new ClientesBin();
    ClientesDao clientesDao=new ClientesDao();
    int empleado, cliente;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("ingresar"))
        {
            String user= request.getParameter("user");
            String password=request.getParameter("password");

            empleadosBin=empleadosDao.validar(user,password);
            if(empleadosBin!=null)
                cliente=0;
            else
                cliente=1;
            clientesBin=clientesDao.validar(user,password);
            if(clientesBin!=null)
                empleado=0;
            else
                empleado=1;

            if(cliente==0)
            {
                request.getRequestDispatcher("views/Cliente.jsp").forward(request,response);
                System.out.println("Entro a clientes");
            }
            else if (empleado==0) {
                System.out.println("Entro a empleado");
                request.getRequestDispatcher("Controlador?menu=Categorias&accion=listar").forward(request, response);
            }
            else
                System.out.println("Ninguno");
           // request.getRequestDispatcher("index.jsp").forward(request,response);

        }
        else {
            request.getRequestDispatcher("index.jsp").forward(request,response);
            System.out.println("Inicio");

        }

    }
}
