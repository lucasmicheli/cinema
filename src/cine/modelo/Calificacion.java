/* Calificación de Película */

package cine.modelo;

public class Calificacion {
    private String nombre;
    public Calificacion(String nombre) {
        this.nombre = nombre;
    }

    Calificacion() {
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
        return "Calificacion{" + "nombre=" + nombre + '}';
    }
}