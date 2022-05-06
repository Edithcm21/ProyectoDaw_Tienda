package Modelo;

import java.io.Serializable;

public class ColoresBin implements Serializable {
    private int id_color;
    private String nombre_color;

    public ColoresBin(){

    }

    // metodo para Seleccionar y modificar colores

    public ColoresBin(int id_color, String nombre_color) {
        this.id_color = id_color;
        this.nombre_color = nombre_color;
    }

    // Metodo para Borrar y selecionar
    public ColoresBin(int id_color) {
        this.id_color = id_color;
    }

    // metodo para insertar
    public ColoresBin(String nombre_color) {
        this.nombre_color = nombre_color;
    }

    /*****************Getters and Setters**/

    public int getId_color() {
        return id_color;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

    public String getNombre_color() {
        return nombre_color;
    }

    public void setNombre_color(String nombre_color) {
        this.nombre_color = nombre_color;
    }
}
