/* Género */

package cine.modelo;

public class Genero {
    private String nombre;
    public Genero(String nombre) {
        this.nombre = nombre;
    }

    Genero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Género{" + "nombre=" + nombre + '}';
    }
}