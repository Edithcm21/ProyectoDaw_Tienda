package Modelo;

import java.io.Serializable;

public class ProductosColorTallaBin implements Serializable {
    private int id_producto; String nombre;String descripcion;
    private int id_alterno;
    private int color;
    private int talla;
    private int cantidad;
    private String foto;
    private int precio;

    public ProductosColorTallaBin(){ }

    //insertar

    public ProductosColorTallaBin(int id_producto, int color, int talla, int cantidad, String foto, int precio) {
        this.id_producto=id_producto;
        this.color = color;
        this.talla = talla;
        this.cantidad = cantidad;
        this.foto=foto;
        this.precio=precio;
    }

    //seleccionar

    public ProductosColorTallaBin(int id_producto, int id_alterno, int color, int talla, int cantidad, String foto,int precio) {
        this.id_producto = id_producto;
        this.id_alterno = id_alterno;
        this.color = color;
        this.talla = talla;
        this.cantidad = cantidad;
        this.foto = foto;
        this.precio=precio;
    }

    //Seleccionar index

    public ProductosColorTallaBin(int id_producto, String nombre, String descripcion, int id_alterno, String foto, int precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_alterno = id_alterno;
        this.foto = foto;
        this.precio = precio;
    }


    // eliminar

    public ProductosColorTallaBin(int id_producto) {
        this.id_alterno = id_producto;
    }



    public int getId_producto() {
        return id_producto;
    }

    public int getId_alterno() {
        return id_alterno;
    }

    public void setId_alterno(int id_alterno) {
        this.id_alterno = id_alterno;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {return precio;}

    public void setPrecio(int precio) {this.precio = precio;}

    @Override
    public String toString() {
        return "ProductosColorTallaBin{" +
                "id_producto=" + id_producto +
                ", id_alterno=" + id_alterno +
                ", color=" + color +
                ", talla=" + talla +
                ", cantidad=" + cantidad +
                ", foto='" + foto + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
