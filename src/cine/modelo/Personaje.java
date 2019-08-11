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
public class Personaje {

    private String nombreEnPelicula;

    public Personaje(String nombreEnPelicula) {

        this.nombreEnPelicula = nombreEnPelicula;
    }

    Personaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreEnPelicula() {

        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {

        this.nombreEnPelicula = nombreEnPelicula;
    }

    @Override
    public String toString() {

        return "Personaje{" + "nombreEnPelicula=" + nombreEnPelicula + '}';
    }

}
