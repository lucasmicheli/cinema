/* Rol */

package cine.modelo;

public class Rol {
    private String nombre;
    public Rol(String nombre) {
        this.nombre = nombre;
    }

    Rol() {
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
        return "Rol{" + "nombre=" + nombre + '}';
    }
}