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
public class Programacion {

    private String fechaFin;

    private String fechaHoraCreada;

    private String fechaInicio;

    public Programacion(String fechaFin, String fechaHoraCreada, String fechaInicio) {

        this.fechaFin = fechaFin;

        this.fechaHoraCreada = fechaHoraCreada;

        this.fechaInicio = fechaInicio;

    }

    Programacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFechaFin() {

        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {

        this.fechaFin = fechaFin;
    }

    public String getFechaHoraCreada() {

        return fechaHoraCreada;
    }

    public void setFechaHoraCreada(String fechaHoraCreada) {

        this.fechaHoraCreada = fechaHoraCreada;
    }

    public String getFechaInicio() {

        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {

        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {

        return "Programacion{" + "fechaFin=" + fechaFin + ", fechaHoraCreada=" + fechaHoraCreada + ", fechaInicio=" + fechaInicio + '}';
    }

    public boolean estaCompleta() {

        boolean retVal = true;

        return retVal;
    }

    public boolean estaIniciadaFuncion() {

        boolean retVal = true;

        return retVal;
    }

    public boolean estaVigente() {

        boolean retVal = true;

        return retVal;
    }

    public void mostrarProgramacion() {

    }

}
