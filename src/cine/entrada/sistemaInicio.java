/* Sistema de reserva de entradas de cine */

package cine.entrada;

import cine.controlador.Controlador;
import cine.modelo.Modelo;
import cine.vista.FormPeliculasCargadas;
import cine.vista.FormRegistroPelicula;

public class sistemaInicio {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo, new FormRegistroPelicula(), new FormPeliculasCargadas());
        controlador.iniciarVista();
        controlador.IniciarVista2();
    }
}