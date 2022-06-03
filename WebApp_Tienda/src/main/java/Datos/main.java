package Datos;

import Modelo.CategoriaBin;
import Modelo.ProductosColorTallaBin;

import java.io.FileNotFoundException;
import java.util.List;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        CategoriaDao Conexion= new CategoriaDao();
        List<CategoriaBin> Categorias=Conexion.Select();
        CategoriaBin categoria=new CategoriaBin("Niños");

      //  Conexion.insertar(categoria);
        //ProductosColorTallaBin prod=new ProductosColorTallaBin(1,2,1,10,"C:\\Users\\edith\\Desktop\\IMG\\1.jpg");
        //ProductosColorTallaBin prod=new ProductosColorTallaBin(1,1,1,10,"C:\\Users\\edith\\Desktop\\IMG\\1.jpg");
       /* System.out.println(prod.getFoto());
        ProductosColorTallaDao producto=new ProductosColorTallaDao();
        producto.insertar(prod);*/



    }
}
