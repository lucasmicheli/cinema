/* Sexo */

package cine.modelo;

public class Sexo {    
    private String nombre;

    public Sexo(String nombre) {
        this.nombre = nombre;
    }

    Sexo() {
        //
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sexo{" + "nombre=" + nombre + '}';
    }
}