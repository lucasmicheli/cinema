/* Personaje */

package cine.modelo;

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