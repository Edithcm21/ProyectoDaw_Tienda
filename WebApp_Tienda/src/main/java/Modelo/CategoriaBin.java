package Modelo;

import java.io.Serializable;

public class CategoriaBin implements Serializable {
    private int id_categoria;
    private String nombre_categoria;

   public CategoriaBin()
   {

   }

   // method para consultar todos los dates y modificar
    public CategoriaBin(int id_categoria, String nombre_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
    }

    // Constructor para insertar
    public CategoriaBin(String nombre_categoria)
    {
        this.nombre_categoria = nombre_categoria;
    }

    // Constructor para consultar y borrar un solo registro
    public CategoriaBin(int id_categoria)
    {
        this.id_categoria = id_categoria;
    }

    /*****************    Getters and Setters   ***************************************/

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
}
