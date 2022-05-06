package Modelo;

import java.io.Serializable;

public class VentaFinalBin implements Serializable {
    private int id_venta;
    private int id_producto;
    private int cantidad;
    private int total;

    public VentaFinalBin() {}

    //Seleccionar  // Modificar

    public VentaFinalBin(int id_venta, int id_producto, int cantidad, int total) {
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.total = total;
    }



    // insertar
    public VentaFinalBin(int id_venta, int cantidad, int total) {
        this.id_venta = id_venta;
        this.cantidad = cantidad;
        this.total = total;
    }

    // eliminar


    public VentaFinalBin(int id_venta) {
        this.id_venta = id_venta;
    }





    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
