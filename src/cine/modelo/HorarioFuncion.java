/* Horario de Función */

package cine.modelo;

public class HorarioFuncion {
    private String diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private String horaPrimeraFuncion;
    private String horaUltimaFuncion;
    
    public HorarioFuncion(String diaDeSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche, String horaPrimeraFuncion, String horaUltimaFuncion) {
        this.diaDeSemana = diaDeSemana;
        this.duracionIntervalo = duracionIntervalo;
        this.duracionPublicidad = duracionPublicidad;
        this.esTrasnoche = esTrasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    HorarioFuncion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(String diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public int getDuracionIntervalo() {
        return duracionIntervalo;
    }

    public void setDuracionIntervalo(int duracionIntervalo) {
        this.duracionIntervalo = duracionIntervalo;
    }

    public int getDuracionPublicidad() {
        return duracionPublicidad;
    }

    public void setDuracionPublicidad(int duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public boolean isEsTrasnoche() {
        return esTrasnoche;
    }

    public void setEsTrasnoche(boolean esTrasnoche) {
        this.esTrasnoche = esTrasnoche;
    }

    public String getHoraPrimeraFuncion() {
        return horaPrimeraFuncion;
    }

    public void setHoraPrimeraFuncion(String horaPrimeraFuncion) {
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }

    public String getHoraUltimaFuncion() {
        return horaUltimaFuncion;
    }

    public void setHoraUltimaFuncion(String horaUltimaFuncion) {
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    @Override
    public String toString() {
        return "HorarioFuncion{" + "diaDeSemana=" + diaDeSemana + ", duracionIntervalo=" + duracionIntervalo + ", duracionPublicidad=" + duracionPublicidad + ", esTrasnoche=" + esTrasnoche + ", horaPrimeraFuncion=" + horaPrimeraFuncion + ", horaUltimaFuncion=" + horaUltimaFuncion + '}';
    }

    public void mostrarHorarioFuncion() {
        // Pendiente
    }
}