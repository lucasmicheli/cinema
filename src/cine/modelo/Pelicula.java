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
public class Pelicula {

    private int id;

    private int anioEstreno;

    private boolean disponible;

    private int duracion;

    private String nombre;

    private String tituloOriginal;

    public Pelicula(int anioEstreno, boolean disponible, int duracion, String nombre, String tituloOriginal) {

        this.anioEstreno = anioEstreno;

        this.disponible = disponible;

        this.duracion = duracion;

        this.nombre = nombre;

        this.tituloOriginal = tituloOriginal;

    }

    public Pelicula() {

    }

    public int getAnioEstreno() {

        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {

        this.anioEstreno = anioEstreno;
    }

    public boolean estaDisponible() {

        return this.disponible;
    }

    public void setDisponible(boolean disponible) {

        this.disponible = disponible;
    }

    public int getDuracion() {

        return duracion;
    }

    public void setDuracion(int duracion) {

        this.duracion = duracion;
    }

    public String getNombre() {

        return nombre;
    }

    public void vista(String nombre) {

        this.nombre = nombre;
    }

    public String getTituloOriginal() {

        return tituloOriginal;

    }

    public void setTituloOriginal(String tituloOriginal) {

        this.tituloOriginal = tituloOriginal;
    }

    @Override
    public String toString() {

        return "Pelicula{" + " Id = " + id + ", Nombre = " + nombre
                + ", Duración = " + duracion
                + ", Titulo original = " + tituloOriginal
                + ", Año estreno : " + anioEstreno
                + ", Disponibilidad = " + disponible + " }\n";
    }

    public void calcularDuracionEnFuncion() {

    }

    public boolean estaEnCartelera() {

        boolean retVal = true;

        return retVal;

    }

    public void mostrarFuncionesHabilitadas() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
