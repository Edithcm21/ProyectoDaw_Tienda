package Modelo;

import java.io.Serializable;

public class ProductosColorTallaBin implements Serializable {
    private int id_producto;
    private int id_alterno;
    private int color;
    private int talla;
    private int cantidad;
    private String foto;

    public ProductosColorTallaBin(){ }

    //insertar


    public ProductosColorTallaBin(int id_producto, int color, int talla, int cantidad, String foto) {
        this.id_producto=id_producto;
        this.color = color;
        this.talla = talla;
        this.cantidad = cantidad;
        this.foto=foto;
    }

    //seleccionar

    public ProductosColorTallaBin(int id_producto, int id_alterno, int color, int talla, int cantidad, String foto) {
        this.id_producto = id_producto;
        this.id_alterno = id_alterno;
        this.color = color;
        this.talla = talla;
        this.cantidad = cantidad;
        this.foto = foto;
    }


    // modificar

    public ProductosColorTallaBin(int id_producto, int cantidad, String foto) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.foto = foto;
    }


    // eliminar

    public ProductosColorTallaBin(int id_producto) {
        this.id_producto = id_producto;
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
}
