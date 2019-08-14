/* Entrada */

package cine.modelo;

public class Entrada {
    private String fechaHoraFuncion;
    private String fechaHoraVenta;
    private double precioCobrado;
    private int ticketNro;
    private boolean anulada;

    public Entrada(String fechaHoraFuncion, String fechaHoraVenta, double precioCobrado, int ticketNro, boolean anulada) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
        this.anulada = anulada;
    }

    Entrada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(String fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public String getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(String fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public double getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(double precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }

    public boolean estaAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }

    @Override
    public String toString() {
        return "Entrada{" + "fechaHoraFuncion=" + fechaHoraFuncion + ", fechaHoraVenta=" + fechaHoraVenta + ", precioCobrado=" + precioCobrado + ", ticketNro=" + ticketNro + ", anulada=" + anulada + '}';
    }
}