package Modelo;

import java.io.Serializable;
import java.sql.Date;

public class EmpleadosBin implements Serializable {
    private int id_empleado;
    private String nombre;
    private String apellido;
    //Como la direccion es un tipo en la class los pondre separados
    private String colonia;
    private String ciudad;
    private String calle;
    private String avenida;
    private String estado;
    private String Telefono;
    private Date fecha_nac;
    private int tipo_empleado;
    private int sueldo;

    public EmpleadosBin(){}


    //Seleccionar
    public EmpleadosBin(int id_empleado, String nombre, String apellido, String colonia, String ciudad, String calle, String avenida, String estado, String telefono, Date fecha_nac, int tipo_empleado, int sueldo) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        Telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.tipo_empleado = tipo_empleado;
        this.sueldo = sueldo;
    }

    //Modificar

    public EmpleadosBin(int id_empleado, String colonia, String ciudad, String calle, String avenida, String estado, int tipo_empleado,String telefono, int sueldo) {
        this.id_empleado = id_empleado;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        this.Telefono = telefono;
        this.sueldo = sueldo;
        this.tipo_empleado=tipo_empleado;
    }

    // insertar

    public EmpleadosBin(String nombre, String apellido, String colonia, String ciudad, String calle, String avenida, String estado, String telefono, Date fecha_nac, int tipo_empleado, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        Telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.tipo_empleado = tipo_empleado;
        this.sueldo = sueldo;
    }

    // borrar

    public EmpleadosBin(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    ////Getters and Setters

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(int tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
