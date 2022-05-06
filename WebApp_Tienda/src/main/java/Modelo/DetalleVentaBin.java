package Modelo;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;

public class DetalleVentaBin implements Serializable {
    private int id_venta;
    private int id_cliente;
    private int id_empleado;
    private Date fecha;
    private Time hora;
    private String colonia;
    private String ciudad;
    private String calle;
    private String avenida;
    private String estado;
    private int total;
    private Boolean estatus_pago;

    public DetalleVentaBin(){}
    /***** Seleccionar todos ******/
    public DetalleVentaBin(int id_venta, int id_cliente, int id_empleado, Date fecha, Time hora, String colonia, String ciudad, String calle, String avenida, String estado, int total, Boolean estatus_pago) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.hora = hora;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        this.total = total;
        this.estatus_pago = estatus_pago;
    }

    /**** Eliminar*****/
    public DetalleVentaBin(int id_venta) {
        this.id_venta = id_venta;
    }

    /** Insertar ***/

    public DetalleVentaBin(int id_cliente, int id_empleado, Date fecha, Time hora, String colonia, String ciudad, String calle, String avenida, String estado, int total, Boolean estatus_pago) {
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.hora = hora;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        this.total = total;
        this.estatus_pago = estatus_pago;
    }

    //Modificar pago


    public DetalleVentaBin(int id_venta, Boolean estatus_pago) {
        this.id_venta = id_venta;
        this.estatus_pago = estatus_pago;
    }

    // Modificar Total


    public DetalleVentaBin(int id_venta, int total) {
        this.id_venta = id_venta;
        this.total = total;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Boolean getEstatus_pago() {
        return estatus_pago;
    }

    public void setEstatus_pago(Boolean estatus_pago) {
        this.estatus_pago = estatus_pago;
    }
}
