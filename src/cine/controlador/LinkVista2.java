package cine.controlador;

import cine.vista.FormPeliculasCargadas;
import cine.vista.FormRegistroPelicula;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Juan
 */
public class LinkVista2 {

    private Controlador controlador;
    private FormRegistroPelicula vistaRegistroPelicula;
    private FormPeliculasCargadas vistaPeliculasCargadas;

    public LinkVista2(FormRegistroPelicula vistaRegistroPelicula, FormPeliculasCargadas formPeliculasCargadas, Controlador controlador) {

        this.vistaRegistroPelicula = vistaRegistroPelicula;

        this.vistaPeliculasCargadas = formPeliculasCargadas;

        this.controlador = controlador;

    }

    void setActionlisteners() {
    }

    void setListeners() {

        this.vistaPeliculasCargadas.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {

                JFrame frame = (JFrame) e.getSource();
                frame.setVisible(false);

            }
        });

        this.vistaPeliculasCargadas.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
                e.getWindow().setLocationRelativeTo(vistaRegistroPelicula);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }

}
