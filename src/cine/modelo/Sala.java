/* Sala de Cine */

package cine.modelo;

public class Sala {
    private int capacidad;
    private int numero;

    public Sala(int capacidad, int numero) {
        this.capacidad = capacidad;
        this.numero = numero;
    }

    Sala() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Sala{" + "capacidad=" + capacidad + ", numero=" + numero + '}';
    }
}