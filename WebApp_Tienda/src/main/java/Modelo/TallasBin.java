package Modelo;

import java.io.Serializable;

public class TallasBin implements Serializable {
    private int id_talla;
    private String nombretalla;

    public TallasBin()
    {

    }
    // Seleccionar y modificar
    public TallasBin(int id_talla, String nombretalla) {
        this.id_talla = id_talla;
        this.nombretalla = nombretalla;
    }
    //eliminar y buscar
    public TallasBin(int id_talla) {
        this.id_talla = id_talla;
    }

    //Insertar
    public TallasBin(String nombretalla) {
        this.nombretalla = nombretalla;
    }

    /***** Getters and Setters*****************/

    public int getId_talla() {
        return id_talla;
    }

    public void setId_talla(int id_talla) {
        this.id_talla = id_talla;
    }

    public String getNombretalla() {
        return nombretalla;
    }

    public void setNombretalla(String nombretalla) {
        this.nombretalla = nombretalla;
    }
}
