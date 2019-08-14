/* Cine */

package cine.modelo;

public class Cine {
    private String direccion;
    private String fechaIgnauguracion;
    private String nombre;
    private double precioEntrada;

    public Cine(String direccion, String fechaIgnauguracion, String nombre, double precioEntrada) {
        this.direccion = direccion;
        this.fechaIgnauguracion = fechaIgnauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
    }

    Cine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaIgnauguracion() {
        return fechaIgnauguracion;
    }

    public void setFechaIgnauguracion(String fechaIgnauguracion) {
        this.fechaIgnauguracion = fechaIgnauguracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "direccion=" + direccion + ", fechaIgnauguracion=" + fechaIgnauguracion + ", nombre=" + nombre + ", precioEntrada=" + precioEntrada + '}';
    }

    public void mostrarCine() {
        // Pendiente
    }

    public void mostrarInfoHorariosFuncion() {
        // Pendiente
    }
}