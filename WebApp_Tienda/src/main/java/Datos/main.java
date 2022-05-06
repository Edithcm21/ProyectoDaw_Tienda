package Datos;

import Modelo.CategoriaBin;
import java.util.List;

public class main {
    public static void main(String[] args) {
        CategoriaDao Conexion= new CategoriaDao();
        List<CategoriaBin> Categorias=Conexion.Select();
        CategoriaBin categoria=new CategoriaBin("Niños");

        Conexion.insertar(categoria);



    }
}
