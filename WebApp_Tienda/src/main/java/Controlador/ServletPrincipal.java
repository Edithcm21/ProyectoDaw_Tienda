package Controlador;

import Datos.ClientesDao;
import Datos.ProductosColorTallaDao;
import Modelo.Carrito;
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
    ProductosColorTallaBin producto=new ProductosColorTallaBin();
    ClientesBin cliente=new ClientesBin();
    ClientesDao clientesDao=new ClientesDao();
    String usu;
    String pass;
    int id;
    List<Carrito> listaCarrito=new ArrayList<>();
    int i,total=0,cantidad=1;
    int id_c;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion=request.getParameter("accion");
        String join1="select id_alternocolor,productos.nombre,productos.id_producto,productos.categoria,productos.descripcion,foto,precio,cantidad from productos_tallacolor\n" +
                "            join productos\n" +
                "            on productos.id_producto=productos_tallacolor.id_producto";
        String join2="select id_alternocolor,productos.nombre,productos.id_producto,productos.categoria,productos.descripcion,foto,precio,cantidad from productos_tallacolor\n" +
                "            join productos\n" +
                "            on productos.id_producto=productos_tallacolor.id_producto\n" +
                "\t\t\twhere productos.categoria=";
        String joinbuscarid="select id_alternocolor,productos.nombre,productos.id_producto,productos.categoria,productos.descripcion,foto,precio,cantidad from productos_tallacolor\n" +
                "                join productos\n" +
                "\t\t\t\ton productos.id_producto=productos_tallacolor.id_producto\n" +
                "\t\t\t\twhere id_alternocolor=";

        System.out.println("entro al servlet principal");
        switch (accion){
            case "home":
                id=Integer.parseInt(request.getParameter("id"));
                if(id==0)
                productos=dao.Join1(join1);
                else
                    productos=dao.Join1(join2+id);
                request.setAttribute("productos",productos);
                request.getRequestDispatcher("index.jsp").forward(request,response);
                break;
            case "cliente":
                id=Integer.parseInt(request.getParameter("id"));
                if(id==0)
                {
                    productos=dao.Join1(join1);
                }
                else
                {
                    productos=dao.Join1(join2+id);
                }
                id_c=Integer.parseInt(request.getParameter("id_cliente"));
                cliente=clientesDao.listarId(id_c);
                request.setAttribute("cliente",cliente);
                request.setAttribute("productos",productos);
                request.getRequestDispatcher("views/IndexCliente.jsp").forward(request,response);
                break;
            case "AgregarCarrito":

                int idpa=Integer.parseInt(request.getParameter("idpa"));
                producto=dao.listarId2(joinbuscarid+idpa);
                i++;
                Carrito carrito=new Carrito();
                int id_producto=producto.getId_alterno();
                String nombre=producto.getNombre();
                String descripcion=producto.getDescripcion();
                String foto= producto.getFoto();
                int precio=producto.getPrecio();
                carrito =new Carrito(i,id_producto,nombre,descripcion,precio,cantidad,cantidad*precio,foto);
                listaCarrito.add(carrito);
                request.getRequestDispatcher("ServletPrincipal?accion=cliente&id=0&id_cliente="+id_c).forward(request,response);
                break;
            case "carrito":
                total=0;
                request.setAttribute("cliente",cliente);
                request.setAttribute("carrito",listaCarrito);
                for (Carrito c:listaCarrito) {
                    total=total+c.getSubtotal();
                }
                request.setAttribute("totalpagar",total);
                request.getRequestDispatcher("views/Carrito.jsp").forward(request,response);

                break;
            default:
                request.setAttribute("productos",productos);
                request.getRequestDispatcher("views/index.jsp").forward(request,response);
                break;


        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
