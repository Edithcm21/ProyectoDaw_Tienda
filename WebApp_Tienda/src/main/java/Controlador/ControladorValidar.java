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
    String user;
    String password;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Entro al get");
        String imagen="images/login.jsp";
        request.setAttribute("img",imagen);
        request.getRequestDispatcher("views/Login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Entro al post");
        String accion=request.getParameter("accion");
        switch (accion){
            case "ingresar":
                user= request.getParameter("user");
                password=request.getParameter("password");

                empleadosBin=empleadosDao.validar(user,password);
                if(empleadosBin!=null) {
                    empleado = 0;
                }
                else
                    empleado=1;
                clientesBin=clientesDao.validar(user,password);
                if(clientesBin!=null) {
                    cliente = 0;
                }
                else
                    cliente=1;

                if(cliente==0)
                {
                    request.setAttribute("cliente",clientesBin);
                    request.getRequestDispatcher("views/IndexCliente.jsp").forward(request,response);
                }
                else if (empleado==0) {
                    request.setAttribute("empleado",empleadosBin);
                    System.out.println("Lo mando a listar productos" +empleadosBin.getNombre());
                    request.getRequestDispatcher("views/IndexEmpleado.jsp").forward(request, response);
                }
                else {
                    request.getRequestDispatcher("views/Login.jsp").forward(request, response);
                }
                break;

            case "Registrar":
                user= request.getParameter("user");
                password=request.getParameter("password");
                clientesBin=clientesDao.validar(user,password);
                if(clientesBin!=null)
                {
                    request.setAttribute("cliente",clientesBin);
                    request.getRequestDispatcher("views/IndexCliente.jsp").forward(request,response);
                }
                else{
                    ClientesBin usu=new ClientesBin();
                    usu.setPassword(password);
                    usu.setUser(user);
                    request.setAttribute("usu",usu);
                    request.getRequestDispatcher("views/Cliente.jsp").forward(request,response);

                    }
                break;
            case "Guardar":
                String nombre=request.getParameter("nombre");
                String apellidos=request.getParameter("apellidos");
                String colonia=request.getParameter("colonia");
                String ciudad=request.getParameter("ciudad");
                String calle=request.getParameter("calle");
                String avenida=request.getParameter("avenida");
                String estado=request.getParameter("estado");
                String correo=request.getParameter("correo");
                String pass=request.getParameter("password");
                String tel=request.getParameter("telefono");
                System.out.println();
                clientesBin=new ClientesBin(nombre,apellidos,colonia,ciudad,calle,avenida,estado,tel,correo,pass);
                if(clientesDao.insertar(clientesBin)==1)
                {
                    clientesBin=clientesDao.validar(correo,pass);
                    request.setAttribute("cliente",clientesBin);
                    request.getRequestDispatcher("views/IndexCliente.jsp").forward(request,response);
                }
                else
                request.getRequestDispatcher("views/Login.jsp").forward(request,response);
                break;

            default:
                request.getRequestDispatcher("index.jsp").forward(request,response);
        }

    }
}
