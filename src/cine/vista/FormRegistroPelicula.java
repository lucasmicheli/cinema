/* Formulario Registro de Película */

package cine.vista;

import cine.controlador.Controlador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.Toolkit.getDefaultToolkit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.*;

@SuppressWarnings("unchecked")
public class FormRegistroPelicula extends javax.swing.JFrame {
    private enum BColor {
        NORMAL, ERROR
    };

    private Map<BColor, Color> bcMap;
    private final Color normal = Color.WHITE;
    private final Color error = Color.RED;

    public FormRegistroPelicula() {

        initComponents();

        bcMap = new EnumMap<>(BColor.class);
        bcMap.put(BColor.NORMAL, normal);
        bcMap.put(BColor.ERROR, error);
        populateCmbAnioEstreno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanelImgForm = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombrePelicula = new javax.swing.JTextField();
        btnVerificarExistenciaPelicula = new javax.swing.JButton();
        btnVerPeliculas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCalificacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbPaisDeOrigen = new javax.swing.JComboBox<>();
        cmbGenero = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTituloOriginal = new javax.swing.JTextField();
        lblAnioEstreno = new javax.swing.JLabel();
        cmbAnioEstreno = new javax.swing.JComboBox();
        txtDuracionMinutos = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbAnioEstreno1 = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        radioBtnDisponibleSi = new javax.swing.JRadioButton();
        radioBtnDisponibleNo = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanelImgForm.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelImgFormLayout = new javax.swing.GroupLayout(jPanelImgForm);
        jPanelImgForm.setLayout(jPanelImgFormLayout);
        jPanelImgFormLayout.setHorizontalGroup(
            jPanelImgFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        jPanelImgFormLayout.setVerticalGroup(
            jPanelImgFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Nombre de Película:");

        txtNombrePelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombrePelicula.setPreferredSize(new java.awt.Dimension(6, 30));
        try
        {
            /* El "patrón" para el editor. Las # representan cifras. En la API puedes ver más. Ojo con el punto decimal, según el idioma puede ser una coma.*/
            MaskFormatter mascara = new MaskFormatter("##.##");
            // Se construye el JFormattedTextField pasándole la máscara
            JFormattedTextField txtNombrePelicula = new JFormattedTextField(mascara);
            // Se da un valor inicial válido para evitar problemas
            txtNombrePelicula.setValue(new Float("12.34"));
        }
        catch (Exception ex){

        }
        txtNombrePelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePeliculaActionPerformed(evt);
            }
        });

        btnVerificarExistenciaPelicula.setText("Cargar Película");
        btnVerificarExistenciaPelicula.setToolTipText("Verifica la existencia de la película en la base de datos");
        btnVerificarExistenciaPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarExistenciaPeliculaActionPerformed(evt);
            }
        });

        btnVerPeliculas.setText("Ver Películas");
        btnVerPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPeliculasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerificarExistenciaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerPeliculas)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarExistenciaPelicula)
                    .addComponent(btnVerPeliculas))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("Película Nombre:");

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione los siguientes datos"));

        jLabel4.setText("Género:");

        jLabel5.setText("Calificación:");

        cmbCalificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excelente", "Buena", "Muy Buena", "Regular", "Mala" }));

        jLabel6.setText("País de Origen:");

        cmbPaisDeOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Italia", "España", "Alemania", "Brasil", "Francia", "Estados Unidos", "India" }));
        cmbPaisDeOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisDeOrigenActionPerformed(evt);
            }
        });

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Comedia", "Drama", "Suspenso", "Terror" }));
        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPaisDeOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cmbCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPaisDeOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese los datos restantes"));
        jPanel7.setPreferredSize(new java.awt.Dimension(12, 147));

        jLabel7.setText("Duración (minutos):");

        jLabel8.setText("Titulo Original:");

        txtTituloOriginal.setPreferredSize(new java.awt.Dimension(6, 25));
        txtTituloOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloOriginalActionPerformed(evt);
            }
        });

        lblAnioEstreno.setText("Año de Estreno:");

        cmbAnioEstreno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbAnioEstreno.setPreferredSize(new java.awt.Dimension(28, 25));
        cmbAnioEstreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioEstrenoActionPerformed(evt);
            }
        });

        txtDuracionMinutos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtDuracionMinutos.setText("120");
        txtDuracionMinutos.setPreferredSize(new java.awt.Dimension(6, 25));

        jLabel9.setText("Calificación (edad):");

        cmbAnioEstreno1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbAnioEstreno1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATP", "+13", "+16", "+18", "C" }));
        cmbAnioEstreno1.setPreferredSize(new java.awt.Dimension(28, 25));
        cmbAnioEstreno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioEstreno1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTituloOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAnioEstreno1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtDuracionMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(lblAnioEstreno)
                                .addGap(18, 18, 18)
                                .addComponent(cmbAnioEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTituloOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDuracionMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnioEstreno)
                    .addComponent(cmbAnioEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbAnioEstreno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Registrar elenco:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Disponible:");

        buttonGroup1.add(radioBtnDisponibleSi);
        radioBtnDisponibleSi.setSelected(true);
        radioBtnDisponibleSi.setText("Si");
        radioBtnDisponibleSi.setToolTipText("Elejir si la pelicula estara disponible");

        buttonGroup1.add(radioBtnDisponibleNo);
        radioBtnDisponibleNo.setText("No");
        radioBtnDisponibleNo.setToolTipText("Elejir si la pelicula estara disponible");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(radioBtnDisponibleSi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnDisponibleNo))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(513, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(29, 29, 29)
                .addComponent(btnCerrar)
                .addGap(18, 18, 18))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioBtnDisponibleSi)
                        .addComponent(jLabel2))
                    .addComponent(radioBtnDisponibleNo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radioBtnDisponibleNo, radioBtnDisponibleSi});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelImgForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelImgForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNombrePeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePeliculaActionPerformed

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGeneroActionPerformed

    private void btnVerificarExistenciaPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarExistenciaPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarExistenciaPeliculaActionPerformed

    private void cmbAnioEstrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioEstrenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAnioEstrenoActionPerformed

    private void txtTituloOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloOriginalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloOriginalActionPerformed

    private void btnVerPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPeliculasActionPerformed
    }//GEN-LAST:event_btnVerPeliculasActionPerformed

    private void cmbPaisDeOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisDeOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaisDeOrigenActionPerformed

    private void cmbAnioEstreno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioEstreno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAnioEstreno1ActionPerformed

    public void setImagen() {
        java.net.URL imgURL = getClass().getResource("imagenes/pelicula.jpg");
        Image formImagen1 = getDefaultToolkit().getImage(imgURL);
        PostImagen postImagen;
        postImagen = new PostImagen(this.jPanelImgForm, formImagen1);
        this.jPanelImgForm.add(postImagen);
    }

    private void populateCmbAnioEstreno() {
        ArrayList<Integer> anios = new ArrayList<>();
        int anioInicio = 1900;
        int anioLimite = this.getAnioActual() + 1;
        for (int i = anioInicio; i < anioLimite; i++) {
            anios.add(i);
        }

        // ComboBox Años
        DefaultComboBoxModel aniosModel = new DefaultComboBoxModel();

        // añado cada elemento del arrayList al modelo del comboBox
        anios.stream().forEach((anio) -> {
            aniosModel.addElement(anio);
        });

        // cargo el comboBox con los valores del DefaultComboBoxModel
        this.cmbAnioEstreno.setModel(aniosModel);
        this.cmbAnioEstreno.setSelectedItem(anioLimite - 1);
    }

    public int getAnioActual() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public JTextField getTxtNombrePelicula() {
        return this.txtNombrePelicula;
    }

    public JButton getBotonVerificarExistenciaPelicula() {
        return this.btnVerificarExistenciaPelicula;
    }

    public JButton getBotonVerPeliculas() {
        return this.btnVerPeliculas;
    }

    public JComboBox getCmbGenero() {
        return this.cmbGenero;
    }

    public JComboBox getCmbCalificacion() {
        return this.cmbCalificacion;
    }

    public JComboBox getCmbPaisDeOrigen() {
        return this.cmbPaisDeOrigen;
    }

    public JComboBox getCmbAnioEstreno() {
        return this.cmbAnioEstreno;
    }

    public JTextField getTxtDuracionMinutos() {
        return (JTextField) this.txtDuracionMinutos;
    }

    public JTextField getTxtTituloOriginal() {
        return this.txtTituloOriginal;
    }

    public JButton getBotonRegistrar() {
        return this.btnRegistrar;
    }

    public JRadioButton getRadioBtnDisponibleSi() {
        return this.radioBtnDisponibleSi;
    }

    public ButtonGroup getRadioButtonGroup() {
        return this.buttonGroup1;
    }

    public JRadioButton getRadioBtnDisponibleNo() {
        return this.radioBtnDisponibleNo;
    }

    public JButton getBotonGuardar() {
        return this.btnGuardar;
    }

    public JButton getBotonCerrar() {
        return this.btnCerrar;
    }

    public void enfocarCampo(JTextField campo) {
        this.setFocoFormPelicula(campo);
    }

    /* Se retorna un objeto ImageIcon, o null si la ruta URL no es válida */
    protected ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Archivo no existe! : " + path);
            return null;
        }
    }

    public int popingUpGuardarPelicula() {
        return JOptionPane.showConfirmDialog(
            this,
            "¿ Desea guardar los datos ingresados ?",
            "Guardar datos",
            JOptionPane.YES_NO_OPTION);
    }

    public void popingUpPeliculaYaExiste(String txtNombrePelicula) {

        ImageIcon icono = createImageIcon("imagenes/warning.png",
            "Película ya existe en nuestra base de datos.");

        JOptionPane.showMessageDialog(this, "Película : " + txtNombrePelicula
            + " , ya existe en nuestra base de datos.", "Aviso Película Registrada",
            JOptionPane.ERROR_MESSAGE, icono);
    }

    public void popingUpPeliculaGuardadaOk() {
        ImageIcon icono = createImageIcon("imagenes/done.png",
            "Película guardada correctamente.");

        JOptionPane.showMessageDialog(this, "Película guardada correctamente!", "Guardar Película",
            JOptionPane.INFORMATION_MESSAGE, icono);
    }

    public void popingUpInconsistenciaDatos(String txtNombrePelicula) {
        ImageIcon icono = createImageIcon("imagenes/error.png",
            "Datos error");

        JOptionPane.showMessageDialog(this, "Película : " + txtNombrePelicula
            + " , tiene incosistencia de datos.\n Por favor revise los datos antes de guardar.", "Error de Datos Película",
            JOptionPane.ERROR_MESSAGE, icono);
    }

    public void habilitarFormRegistroPelicula(boolean valor) {
        this.btnGuardar.setEnabled(valor);
        this.btnRegistrar.setEnabled(valor);
        this.cmbCalificacion.setEnabled(valor);
        this.cmbGenero.setEnabled(valor);
        this.cmbPaisDeOrigen.setEnabled(valor);
        this.cmbAnioEstreno.setEnabled(valor);
        this.radioBtnDisponibleSi.setEnabled(valor);
        this.radioBtnDisponibleNo.setEnabled(valor);
        this.txtDuracionMinutos.setEnabled(valor);
        this.txtTituloOriginal.setEnabled(valor);
    }

    public void limpiarFormRegistroPelicula() {
        this.cmbCalificacion.setSelectedIndex(0);
        this.cmbGenero.setSelectedIndex(0);
        this.cmbPaisDeOrigen.setSelectedIndex(0);
        this.cmbAnioEstreno.setSelectedItem(this.getAnioActual());
        this.radioBtnDisponibleSi.setSelected(true);
        this.radioBtnDisponibleNo.setSelected(false);
        this.txtDuracionMinutos.setText("120");
        this.txtNombrePelicula.setText("");
        this.txtTituloOriginal.setText("");
    }

    public void setFocoFormPelicula(JTextField campo) {
        campo.requestFocusInWindow();
        Color color = bcMap.get(BColor.ERROR);
        this.setBackColor(campo, color);
    }

    public void setBackColor(JTextField textoError, Color backColor) {
        textoError.setBackground(backColor);
    }

    public void setBackColor(JTextField txtField) {
        Color color;
        if (!new Controlador().isTextoVacio(txtField.getText())) {
            color = bcMap.get(BColor.NORMAL);
            this.setBackColor(txtField, color);
        } else {
            color = bcMap.get(BColor.ERROR);
            this.setBackColor(txtField, color);
        }
    }

    /**
     * Postimagen : Clase utilitaria, sirve para generar un componente con una
     * imagen debe recibir como parametros, los objetos: panel e image
     */
    public class PostImagen extends JPanel {
        private Image imagen;
        PostImagen(JPanel jpanel1, Image imagen) {
            this.setSize(jpanel1.getWidth(), jpanel1.getHeight());
            this.imagen = imagen;
        }

        /**
         * se reescribe el metodo paint de la clase JPanel el metodo paint
         * necesita de un objeto tipo Graphics para dibujar un objeto grafico en
         * un JPanel
         *
         * @param grafico
         */
        @Override
        public void paint(Graphics grafico) {

            // es necesario el objeto Dimension para que el objeto imagen se escale al mismo
            // tamaño del JPanel contenedor
            Dimension dimension = this.getSize();

            // se dibuja la imagen que tenemos en el objeto this.imagen dentro de un JPanel
            grafico.drawImage(this.imagen, 0, 0, dimension.width, dimension.height, this);

            // seteo obligatorio del metodo setOpaque, de lo contrario no se muestra la imagen
            // false = 100% opaco
            this.setOpaque(false);

            super.paintComponent(grafico);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistroPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            FormRegistroPelicula formRegistroPelicula = new FormRegistroPelicula();
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerPeliculas;
    private javax.swing.JButton btnVerificarExistenciaPelicula;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbAnioEstreno;
    private javax.swing.JComboBox cmbAnioEstreno1;
    private javax.swing.JComboBox<String> cmbCalificacion;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbPaisDeOrigen;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelImgForm;
    private javax.swing.JLabel lblAnioEstreno;
    private javax.swing.JRadioButton radioBtnDisponibleNo;
    private javax.swing.JRadioButton radioBtnDisponibleSi;
    private javax.swing.JFormattedTextField txtDuracionMinutos;
    public javax.swing.JTextField txtNombrePelicula;
    private javax.swing.JTextField txtTituloOriginal;
    // End of variables declaration//GEN-END:variables
}
