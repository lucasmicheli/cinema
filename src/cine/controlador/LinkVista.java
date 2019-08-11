/*
 * LinkVista
 * Linkea la vistaRegistroPelicula con el controlador
 * Todos los aspectos referidos a la vistaRegistroPelicula son gestionados en esta clase
 */
package cine.controlador;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import cine.vista.FormRegistroPelicula;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Juan A Lopez Estuart
 */
@SuppressWarnings("unchecked")
public class LinkVista {

    private Controlador controlador;
    private FormRegistroPelicula vistaRegistroPelicula;

    private enum Fuente {

        NORMAL, RESALTADO
    };

    private Map<Fuente, Font> estiloFuenteMap;

    private final Font fontNormal = new JTextField().getFont();

    private final Font fontResaltado = fontNormal.deriveFont(Font.BOLD, fontNormal.getSize() + 2);

    public LinkVista(FormRegistroPelicula vista, Controlador controlador) {

        this.vistaRegistroPelicula = vista;

        this.controlador = controlador;

    }

    public void setEstilosFuente() {

        this.estiloFuenteMap = new HashMap<>();

        estiloFuenteMap.put(Fuente.NORMAL, fontNormal);

        estiloFuenteMap.put(Fuente.RESALTADO, fontResaltado);

    }
//
//

    /*
     Inicio de metodos para retornar los objetos de la vistaRegistroPelicula
     */
//
//
    public JTextField getTxtNombrePelicula() {

        return this.vistaRegistroPelicula.getTxtNombrePelicula();

    }

    public JButton getBotonVerificarExistenciaPelicula() {

        return this.vistaRegistroPelicula.getBotonVerificarExistenciaPelicula();

    }

    public JButton getBotonVerPeliculas() {

        return this.vistaRegistroPelicula.getBotonVerPeliculas();

    }

    public JTextField getTxtDuracionMinutos() {

        return this.vistaRegistroPelicula.getTxtDuracionMinutos();

    }

    public JTextField getTxtTituloOriginal() {

        return this.vistaRegistroPelicula.getTxtTituloOriginal();

    }

    public JButton getBotonRegistrar() {

        return this.vistaRegistroPelicula.getBotonRegistrar();

    }

    public JButton getBotonGuardar() {

        return this.vistaRegistroPelicula.getBotonGuardar();

    }

    public JButton getBotonCerrar() {

        return this.vistaRegistroPelicula.getBotonCerrar();

    }

    public JComboBox getCmbgenero() {

        return this.vistaRegistroPelicula.getCmbGenero();

    }

    public JComboBox getCmbCalificacion() {

        return this.vistaRegistroPelicula.getCmbCalificacion();

    }

    public JComboBox getCmbPaisDeOrigen() {

        return this.vistaRegistroPelicula.getCmbPaisDeOrigen();

    }

    public JComboBox getCmbAnioEstreno() {

        return this.vistaRegistroPelicula.getCmbAnioEstreno();

    }

    public ButtonGroup getRadioButtonGroup() {

        return this.vistaRegistroPelicula.getRadioButtonGroup();

    }

    public JRadioButton getRadioBtnDisponibleSi() {

        return this.vistaRegistroPelicula.getRadioBtnDisponibleSi();

    }

    public JRadioButton getRadioBtnDisponibleNo() {

        return this.vistaRegistroPelicula.getRadioBtnDisponibleNo();

    }

    public void enfocarCampo(JTextField campo) {

        vistaRegistroPelicula.setFocoFormPelicula(campo);

    }

    public int getGuardarDatos() {

        return this.vistaRegistroPelicula.popingUpGuardarPelicula();

    }

//
//

    /*
     Fin de metodos para retornar los objetos de la vistaRegistroPelicula
     */
//
//
    public void setActionlisteners() {

        this.vistaRegistroPelicula.getBotonVerificarExistenciaPelicula().addActionListener(controlador);

        this.vistaRegistroPelicula.getBotonVerPeliculas().addActionListener(controlador);

        this.vistaRegistroPelicula.getCmbGenero().addActionListener(controlador);

        this.vistaRegistroPelicula.getCmbCalificacion().addActionListener(controlador);

        this.vistaRegistroPelicula.getCmbPaisDeOrigen().addActionListener(controlador);

        this.vistaRegistroPelicula.getCmbAnioEstreno().addActionListener(controlador);

        this.vistaRegistroPelicula.getRadioBtnDisponibleSi().addActionListener(controlador);

        this.vistaRegistroPelicula.getRadioBtnDisponibleNo().addActionListener(controlador);

        this.vistaRegistroPelicula.getBotonRegistrar().addActionListener(controlador);

        this.vistaRegistroPelicula.getBotonGuardar().addActionListener(controlador);

        this.vistaRegistroPelicula.getBotonCerrar().addActionListener(controlador);

    }

    public void setListeners() {

        this.vistaRegistroPelicula.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                // Cierra la ventana con dispose()
                e.getWindow().dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // Cierra cualquier otra ventana abierta
                System.exit(0);
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

        this.vistaRegistroPelicula.getTxtNombrePelicula().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                resaltarFuenteCampoTexto(vistaRegistroPelicula.getTxtNombrePelicula());

            }

            @Override
            public void focusLost(FocusEvent e) {

                normalizarFuenteCampoTexto(vistaRegistroPelicula.getTxtNombrePelicula());
                vistaRegistroPelicula.setBackColor(vistaRegistroPelicula.getTxtNombrePelicula());

            }

        });
//
        this.vistaRegistroPelicula.getTxtDuracionMinutos().addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {

                try {
                    Robot robot = new Robot();

                    // Simula presionar la tecla [ Fin ]
                    robot.keyPress(KeyEvent.VK_END);
                    robot.keyRelease(KeyEvent.VK_END);

                } catch (AWTException ex) {
                }

                resaltarFuenteCampoTexto(vistaRegistroPelicula.getTxtDuracionMinutos());

            }

            @Override
            public void focusLost(FocusEvent e) {

                normalizarFuenteCampoTexto(vistaRegistroPelicula.getTxtDuracionMinutos());
                vistaRegistroPelicula.setBackColor(vistaRegistroPelicula.getTxtDuracionMinutos());

            }
        });

        this.vistaRegistroPelicula.getTxtTituloOriginal().addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {

                resaltarFuenteCampoTexto(vistaRegistroPelicula.getTxtTituloOriginal());

            }

            @Override
            public void focusLost(FocusEvent e) {

                normalizarFuenteCampoTexto(vistaRegistroPelicula.getTxtTituloOriginal());
                vistaRegistroPelicula.setBackColor(vistaRegistroPelicula.getTxtTituloOriginal());

            }
        });

    }

    private void resaltarFuenteCampoTexto(JTextField txtCampoTexto) {

        Font font = estiloFuenteMap.get(Fuente.RESALTADO);
        txtCampoTexto.setFont(font);

    }

    private void normalizarFuenteCampoTexto(JTextField txtCampoTexto) {

        Font font = estiloFuenteMap.get(Fuente.NORMAL);
        txtCampoTexto.setFont(font);

    }

}
