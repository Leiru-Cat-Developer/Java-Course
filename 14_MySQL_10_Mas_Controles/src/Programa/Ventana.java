package Programa;
import Modelo.Clase_Conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        this.setSize(new Dimension(400, 516));
        this.setLocationRelativeTo(null);
        buttonGroupGeneros.add(radioButtonHombre);                              //GRUPO DE RADIOBOTONES
        buttonGroupGeneros.add(radioButtonMujer);                               //GRUPO DE RADIOBOTONES
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGeneros = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        subTexto1 = new javax.swing.JLabel();
        subTexto2 = new javax.swing.JLabel();
        subTexto3 = new javax.swing.JLabel();
        radioButtonHombre = new javax.swing.JRadioButton();
        radioButtonMujer = new javax.swing.JRadioButton();
        spinnerEdad = new javax.swing.JSpinner();
        checkBoxFutbol = new javax.swing.JCheckBox();
        checkBoxBasquet = new javax.swing.JCheckBox();
        checkBoxTennis = new javax.swing.JCheckBox();
        checkBoxNatacion = new javax.swing.JCheckBox();
        checkBoxBeisbol = new javax.swing.JCheckBox();
        botonInsertar = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAS CONTROLES");
        setPreferredSize(new java.awt.Dimension(400, 650));
        setResizable(false);

        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("FORMULARIO");

        subTexto1.setText("Selecciones Género:");

        subTexto2.setText("¿Cuál es tu edad?:");

        subTexto3.setText("Selecciona tus deportes favoritos:");

        radioButtonHombre.setText("Hombre");

        radioButtonMujer.setText("Mujer");

        checkBoxFutbol.setText("Fútbol");

        checkBoxBasquet.setText("Basquet");

        checkBoxTennis.setText("Tennis");

        checkBoxNatacion.setText("Natación");

        checkBoxBeisbol.setText("Beisbol");

        botonInsertar.setText("INSERTAR REGISTRO");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonMostrar.setText("MOSTRAR REGISTROS");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subTexto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subTexto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spinnerEdad)
                    .addComponent(subTexto3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButtonHombre)
                            .addComponent(radioButtonMujer)
                            .addComponent(checkBoxFutbol)
                            .addComponent(checkBoxBasquet)
                            .addComponent(checkBoxTennis)
                            .addComponent(checkBoxNatacion)
                            .addComponent(checkBoxBeisbol))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(botonMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subTexto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonMujer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subTexto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(subTexto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxFutbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxBasquet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxTennis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxNatacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxBeisbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        //VARIABLES PARA ALMACENAR LOS RESULTADOS QUE INSERTAREMOS MÁS TARDE
        String genero = "";
        int edad;
        boolean futbol = false, basquet = false, tennis = false, natacion = false, beisbol = false;
        //RADIO BUTTON - PROCESO
        if(radioButtonHombre.isSelected() == true){
            genero = "Hombre";
        }else if(radioButtonMujer.isSelected() == true){
            genero = "Mujer";
        }
        //SPINNER - PROCESO
        edad = (int) spinnerEdad.getValue();
        //CHECK BOX - PROCESO
        if(checkBoxFutbol.isSelected() == true){
            futbol = true;
        }
        if(checkBoxBasquet.isSelected() == true){
            basquet = true;
        }
        if(checkBoxTennis.isSelected() == true){
            tennis = true;
        }
        if(checkBoxNatacion.isSelected() == true){
            natacion = true;
        }
        if(checkBoxBeisbol.isSelected() == true){
            beisbol = true;
        }
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("insert into gustospersona(genero,edad,futbol,basquet,tennis,natacion,beisbol) values(?,?,?,?,?,?,?)");
            ps.setString(1, genero);
            ps.setInt(2, edad);
            ps.setBoolean(3, futbol);
            ps.setBoolean(4, basquet);
            ps.setBoolean(5, tennis);
            ps.setBoolean(6, natacion);
            ps.setBoolean(7, beisbol);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "REGISTRO INSERTADO CORRECTAMENTE");
            conexion.close();
        } catch (Exception ex) {
            System.err.println("ERROR AL INSERTAR EL REGISTRO, "+ex);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed
    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select genero,edad,futbol,basquet,tennis,natacion,beisbol from gustospersona where id=?");
            ps.setInt(1, 2);                                                    //FORMA MANUAL
            rs = ps.executeQuery();
            while(rs.next()){
                //RADIO BUTTON - VALUES
                if(rs.getString("genero").equals("Hombre")){
                    radioButtonHombre.setSelected(true);
                }else if(rs.getString("genero").equals("Mujer")){
                    radioButtonMujer.setSelected(true);
                }
                //SPINNER - VALUES
                spinnerEdad.setValue(rs.getInt("edad"));
                //CHECK BOX - VALUES
                if(rs.getBoolean("futbol")==true){
                    checkBoxFutbol.setSelected(true);
                }
                if(rs.getBoolean("basquet")==true){
                    checkBoxBasquet.setSelected(true);
                }
                if(rs.getBoolean("tennis")==true){
                    checkBoxTennis.setSelected(true);
                }
                if(rs.getBoolean("natacion")==true){
                    checkBoxNatacion.setSelected(true);
                }
                if(rs.getBoolean("beisbol")==true){
                    checkBoxBeisbol.setSelected(true);
                }
            }
            JOptionPane.showMessageDialog(null, "REGISTRO MOSTRADO CORRECTAMENTE");
            conexion.close();
        } catch (Exception ex) {
            System.err.println("ERROR AL MOSTRAR EL REGISTROs, "+ex);
        }
    }//GEN-LAST:event_botonMostrarActionPerformed
    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.ButtonGroup buttonGroupGeneros;
    private javax.swing.JCheckBox checkBoxBasquet;
    private javax.swing.JCheckBox checkBoxBeisbol;
    private javax.swing.JCheckBox checkBoxFutbol;
    private javax.swing.JCheckBox checkBoxNatacion;
    private javax.swing.JCheckBox checkBoxTennis;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton radioButtonHombre;
    private javax.swing.JRadioButton radioButtonMujer;
    private javax.swing.JSpinner spinnerEdad;
    private javax.swing.JLabel subTexto1;
    private javax.swing.JLabel subTexto2;
    private javax.swing.JLabel subTexto3;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}