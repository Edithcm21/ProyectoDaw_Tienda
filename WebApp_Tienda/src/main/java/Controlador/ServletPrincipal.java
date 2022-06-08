package Controlador;

import Datos.ClientesDao;
import Datos.ProductosColorTallaDao;
import Modelo.ClientesBin;
import Modelo.ProductosColorTallaBin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletPrincipal", value = "/ServletPrincipal")
public class ServletPrincipal extends HttpServlet {
    ProductosColorTallaDao dao=new ProductosColorTallaDao();
    List<ProductosColorTallaBin> productos=new ArrayList<>();
    ClientesBin cliente=new ClientesBin();
    ClientesDao clientesDao=new ClientesDao();
    String usu;
    String pass;
    int id;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion=request.getParameter("accion");
        String join1="select id_alternocolor,productos.nombre,productos.id_producto,productos.categoria,productos.descripcion,foto,precio from productos_tallacolor\n" +
                "            join productos\n" +
                "            on productos.id_producto=productos_tallacolor.id_producto";
        String join2="select id_alternocolor,productos.nombre,productos.id_producto,productos.categoria,productos.descripcion,foto,precio from productos_tallacolor\n" +
                "            join productos\n" +
                "            on productos.id_producto=productos_tallacolor.id_producto\n" +
                "\t\t\twhere productos.categoria=";

        System.out.println("entro al servlet principal");
        switch (accion){
            case "home":
                id=Integer.parseInt(request.getParameter("id"));
                if(id==0)
                productos=dao.Join1(join1);
                else
                    productos=dao.Join1(join2+id);
                request.setAttribute("productos",productos);
                System.out.println("Entro al home");
                request.getRequestDispatcher("index.jsp").forward(request,response);
                break;
            case "cliente":
                id=Integer.parseInt(request.getParameter("id"));
                if(id==0)
                {
                    productos=dao.Join1(join1);
                    System.out.println(join1);
                }
                else
                {
                    productos=dao.Join1(join2+id);
                    System.out.println(join2+id+"else");
                }
                System.out.println(id);
                usu=request.getParameter("user");
                pass=request.getParameter("pass");
                cliente=clientesDao.validar(usu,pass);
                request.setAttribute("cliente",cliente);
                request.setAttribute("productos",productos);
                System.out.println("Entro al else de cliente"+cliente.getNombre());
                request.getRequestDispatcher("views/IndexCliente.jsp").forward(request,response);
                break;
            default:
                request.setAttribute("productos",productos);
                System.out.println("ento endjddjd");
                request.getRequestDispatcher("views/index.jsp").forward(request,response);
                break;


        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
