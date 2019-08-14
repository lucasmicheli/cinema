/* País de Origen */

package cine.modelo;

public class PaisDeOrigen {
    private String idioma;
    private String nombre;
    
    public PaisDeOrigen(String idioma, String nombre) {
        this.idioma = idioma;
        this.nombre = nombre;
    }

    PaisDeOrigen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PaisDeOrigen{" + "idioma=" + idioma + ", nombre=" + nombre + '}';
    }
}