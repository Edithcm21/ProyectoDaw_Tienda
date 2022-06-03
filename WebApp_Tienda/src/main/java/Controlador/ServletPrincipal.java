package Controlador;

import Datos.ProductosColorTallaDao;
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion=request.getParameter("accion");
        productos=dao.Join1();
        switch (accion){
            case "ejemplo":
                break;
            default:
                request.setAttribute("productos",productos);
                request.getRequestDispatcher("index.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
