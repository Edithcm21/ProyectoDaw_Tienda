package Modelo;

import java.io.Serializable;

public class ProductosBin implements Serializable {
    private int id_producto;
    private String nombre;
    private int categoria;
    private String descripcion;

    public ProductosBin()
    {

    }

    // Constructor para buscar  // modificar

    public ProductosBin(int id_producto, String nombre, int categoria, String descripcion) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
    // Eliminar


    public ProductosBin(int id_producto) {
        this.id_producto = id_producto;
    }

    // insertar
    public ProductosBin(String nombre, int categoria, String descripcion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }


    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
