package Modelo;

import java.io.Serializable;
import java.sql.Date;

public class EnviosBin implements Serializable {
    private int id_venta;
    private int id_empleado;
    private Date fecha_envio;
    private Date fecha_entrega;
    private String recibio;

    public EnviosBin(){ }

    // Seleccionar
    public EnviosBin(int id_venta, int id_empleado, Date fecha_envio, Date fecha_entrega, String recibio) {
        this.id_venta = id_venta;
        this.id_empleado = id_empleado;
        this.fecha_envio = fecha_envio;
        this.fecha_entrega = fecha_entrega;
        this.recibio = recibio;
    }
    // Insertar
    //el mismo que seleccionar

    // Modificar


    public EnviosBin(int id_venta, Date fecha_entrega, String recibio) {
        this.id_venta = id_venta;
        this.fecha_entrega = fecha_entrega;
        this.recibio = recibio;
    }


    ///Getters and Setters


    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getRecibio() {
        return recibio;
    }

    public void setRecibio(String recibio) {
        this.recibio = recibio;
    }
}
