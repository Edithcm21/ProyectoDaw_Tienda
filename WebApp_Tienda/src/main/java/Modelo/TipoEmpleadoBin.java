package Modelo;

import java.io.Serializable;

public class TipoEmpleadoBin implements Serializable {
    private int id_tipo;
    private String tipo;

    public TipoEmpleadoBin(){ }

    //eliminar y buscar
    public TipoEmpleadoBin(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    // seleccionar y modificar
    public TipoEmpleadoBin(int id_tipo, String tipo) {
        this.id_tipo = id_tipo;
        this.tipo = tipo;
    }
    // insertar
    public TipoEmpleadoBin(String tipo) {
        this.tipo = tipo;
    }

    /******getters and Setters ***********************/

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
