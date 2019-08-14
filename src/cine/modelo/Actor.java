/* Actor */

package cine.modelo;

public class Actor {
    private boolean animado;
    private String apellido;
    private String nombre;
    public Actor(boolean animado, String apellido, String nombre) {
        this.animado = animado;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    Actor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isAnimado() {
        return animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "animado=" + animado + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }
}