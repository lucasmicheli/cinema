package cine.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import cine.modelo.Modelo;
import cine.modelo.Pelicula;
import cine.vista.FormPeliculasCargadas;
import cine.vista.FormRegistroPelicula;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan A. Lopez Estuart
 */
@SuppressWarnings("unchecked")
public class Controlador implements ActionListener {

    public static int cnt_Ids = 1;

    public Modelo modelo;

    public FormRegistroPelicula vista;

    public FormPeliculasCargadas vista2;

    private LinkVista linkVista;

    private LinkVista2 linkVista2;

    //public DefaultTableModel peliculasModel = new DefaultTableModel();
    public Controlador(Modelo modelo, FormRegistroPelicula vista, FormPeliculasCargadas formPeliculasCargadas) {

        this.modelo = modelo;

        this.vista = vista;

        this.vista2 = formPeliculasCargadas;

    }

    public Controlador() {
        super();
    }

    public void iniciarVista() {

        this.vista.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        this.vista.setImagen();

        this.vista.setLocationRelativeTo(null);

        this.vista.setTitle("Carga Peliculas");

        this.vista.setVisible(true);

        linkVista = new LinkVista(this.vista, this);

        linkVista.setActionlisteners();

        linkVista.setListeners();

        linkVista.setEstilosFuente();

        this.vista.habilitarFormRegistroPelicula(false);

    }

    public void IniciarVista2() {

        this.vista2.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        this.vista2.setTitle("Peliculas cargadas");

        this.vista2.setVisible(false);

        linkVista2 = new LinkVista2(vista, this.vista2, this);

        linkVista2.setListeners();

        // vista2.jTablePeliculas.setModel(peliculasModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.linkVista.getBotonRegistrar()) {

//            System.out.println("Registrar");
        }

        if (e.getSource() == this.linkVista.getBotonVerificarExistenciaPelicula()) {

            if (!isTextoVacio(this.linkVista.getTxtNombrePelicula().getText())) {

                if (!isPeliculaExiste(this.linkVista.getTxtNombrePelicula().getText())) {

                    this.vista.habilitarFormRegistroPelicula(true);

                } else {

                    // mensajea que la pelicula ya existe y hace cleanUp del form
                    mensajearLimpiar();

                }
            }

        }

        if (e.getSource() == this.linkVista.getBotonVerPeliculas()) {

            this.vista2.mostrarFormPeliculasCargadas(true);
        }

        if (e.getSource() == this.linkVista.getBotonGuardar()) {

            if (this.linkVista.getGuardarDatos() == 0) {

                if (!isPeliculaExiste(this.linkVista.getTxtNombrePelicula().getText())) {

                    if (isConsistenciaFormularioOk()) {

                        guardarPelicula();
                        agregarPeliculaJTablePeliculas();
                        cleanUpFormRegistroPelicula();

                    } else {

                        mensajearInconsistencia();

                    }

                } else {

                    // mensajea que la pelicula ya existe y hace cleanUp del form
                    mensajearLimpiar();

                }

            }

        }

        if (e.getSource() == this.linkVista.getBotonCerrar()) {

            // Cerrar las 2 ventanas abiertas con dispose();
            this.vista.dispose();
            this.vista2.dispose();

        }

        if (e.getSource() == this.linkVista.getRadioBtnDisponibleSi()) {

//            System.out.println("radio button Si");
        }

        if (e.getSource() == this.linkVista.getRadioBtnDisponibleNo()) {

//            System.out.println("radio button No");
        }

        if (e.getSource() == this.linkVista.getCmbgenero()) {

//            System.out.println("cbmGenero  -->  " + this.linkVista.getCmbgenero().getSelectedIndex()
//                    + "  " + this.linkVista.getCmbgenero().getSelectedItem());
        }

        if (e.getSource() == this.linkVista.getCmbCalificacion()) {

//            System.out.println("cmbCalificacion  -->  " + this.linkVista.getCmbCalificacion().getSelectedIndex()
//                    + "  " + this.linkVista.getCmbCalificacion().getSelectedItem());
        }

        if (e.getSource() == this.linkVista.getCmbPaisDeOrigen()) {

//            System.out.println("cmbPaisDeOrigen  -->  " + this.linkVista.getCmbPaisDeOrigen().getSelectedIndex()
//                    + "  " + this.linkVista.getCmbPaisDeOrigen().getSelectedItem());
        }

    }

    private void guardarPelicula() {

        this.modelo.guardarPeliculas(vista, cnt_Ids);

        this.vista.popingUpPeliculaGuardadaOk();

        ++cnt_Ids;

    }

    private boolean isPeliculaExiste(String txtNombrePelicula) {

        Pelicula pelicula;
        boolean retVal = false;

        for (Iterator<Pelicula> i = this.modelo.getPeliculas().iterator(); i.hasNext();) {
            pelicula = i.next();
            if (pelicula.getNombre().equals(txtNombrePelicula)) {
                retVal = true;
                break;
            }
        }
        return retVal;

    }

    private void cleanUpFormRegistroPelicula() {

        this.vista.limpiarFormRegistroPelicula();
        this.vista.habilitarFormRegistroPelicula(false);

    }

    private void enviarMsgPeliculaExiste() {

        this.vista.popingUpPeliculaYaExiste(this.linkVista.getTxtNombrePelicula().getText());

    }

    private void enviarMsgDatosPeliculaInconsistentes() {

        this.vista.popingUpInconsistenciaDatos(this.linkVista.getTxtNombrePelicula().getText());

    }

    private void mensajearLimpiar() {

        enviarMsgPeliculaExiste();
        cleanUpFormRegistroPelicula();

    }

    private void mensajearInconsistencia() {

        enviarMsgDatosPeliculaInconsistentes();

    }

    private boolean isConsistenciaFormularioOk() {

        boolean consistenciaFormulario = true;

        if (isTextoVacio(this.linkVista.getTxtNombrePelicula().getText())) {

            this.linkVista.enfocarCampo(linkVista.getTxtNombrePelicula());
            consistenciaFormulario = false;
        }

        if (isTextoVacio(this.linkVista.getTxtDuracionMinutos().getText())) {

            this.linkVista.enfocarCampo(this.linkVista.getTxtDuracionMinutos());
            consistenciaFormulario = false;
        }

        if (isTextoVacio(this.linkVista.getTxtTituloOriginal().getText())) {

            this.linkVista.enfocarCampo(this.linkVista.getTxtTituloOriginal());
            consistenciaFormulario = false;
        }

        return consistenciaFormulario;
    }

    public boolean isTextoVacio(String txtTexto) {

        boolean retVal = true;

        if (txtTexto.trim().length() > 0) {

            retVal = false;
        }

        return retVal;

    }

    private void agregarPeliculaJTablePeliculas() {

        try {

            int idxUltimoIngreso = modelo.getPeliculas().size() - 1;

            Object[] data = {modelo.getPeliculas().get(idxUltimoIngreso).getNombre()};

            DefaultTableModel dm = (DefaultTableModel) vista2.getjTablePeliculas().getModel();

            dm.addRow(data);

            vista2.getjTablePeliculas().setModel(dm);

        } catch (Exception e) {
        }

    }

}
