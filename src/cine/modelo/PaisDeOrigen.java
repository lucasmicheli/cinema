/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.modelo;

/**
 *
 * @author Juan
 */
public class PaisDeOrigen {

    private String idioma;

    private String nombre;

    public PaisDeOrigen(String idioma, String nombre) {

        this.idioma = idioma;

        this.nombre = nombre;

    }

    PaisDeOrigen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdioma() {

        return idioma;
    }

    public void setIdioma(String idioma) {

        this.idioma = idioma;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    @Override
    public String toString() {

        return "PaisDeOrigen{" + "idioma=" + idioma + ", nombre=" + nombre + '}';
    }

}
