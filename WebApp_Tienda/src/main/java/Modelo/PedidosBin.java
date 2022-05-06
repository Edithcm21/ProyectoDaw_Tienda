package Modelo;

import java.io.Serializable;
import java.sql.Date;

public class PedidosBin implements Serializable {
    private int id_pedido;
    private int id_cliente;
    private String imagen;
    private int precio;
    private Date fecha_pedido;
    private Date fecha_entrega;
    private String comentarios;

    public PedidosBin(){}

    //Seleccionar
    public PedidosBin(int id_pedido, int id_cliente, String imagen, int precio, Date fecha_pedido, Date fecha_entrega, String comentarios) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.imagen = imagen;
        this.precio = precio;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.comentarios = comentarios;
    }

    //Insertar

    public PedidosBin(int id_cliente, String imagen, Date fecha_pedido) {
        this.id_cliente = id_cliente;
        this.imagen = imagen;
        this.fecha_pedido = fecha_pedido;
    }
    // Modificar

    public PedidosBin(int precio, Date fecha_entrega, String comentarios) {
        this.precio = precio;
        this.fecha_entrega = fecha_entrega;
        this.comentarios = comentarios;
    }

    // Eliminar

    public PedidosBin(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
