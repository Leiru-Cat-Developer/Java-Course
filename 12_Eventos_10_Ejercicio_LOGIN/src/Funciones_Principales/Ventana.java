package Funciones_Principales;
import javax.swing.JOptionPane;
public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaNombreUsuario = new javax.swing.JLabel();
        etiquetaContraseña = new javax.swing.JLabel();
        textFieldNombreUsuario = new javax.swing.JTextField();
        botonIniciarSesion = new javax.swing.JButton();
        passwordFiledContraseña = new javax.swing.JPasswordField();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        etiquetaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoUsuario.png"))); // NOI18N
        panelPrincipal.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 100));

        etiquetaNombreUsuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        etiquetaNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombreUsuario.setText("NOMBRE DE USUARIO:");
        panelPrincipal.add(etiquetaNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 20));

        etiquetaContraseña.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        etiquetaContraseña.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaContraseña.setText("CONTRASEÑA:");
        panelPrincipal.add(etiquetaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, -1));

        textFieldNombreUsuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        panelPrincipal.add(textFieldNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, -1));

        botonIniciarSesion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botonIniciarSesion.setText("INICIAR");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, -1));

        passwordFiledContraseña.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        panelPrincipal.add(passwordFiledContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, -1));

        etiquetaFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLogin.jpg"))); // NOI18N
        etiquetaFondo.setToolTipText("");
        panelPrincipal.add(etiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

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
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);                                                         //COMANDO SALIR
    }//GEN-LAST:event_botonSalirActionPerformed
    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        String usuarioCorrecto = "URIEL";
        String contraseñaCorrecta = "programacion";
        if(usuarioCorrecto.equals(textFieldNombreUsuario.getText())){
            String contraseña = "";
            for(int i=0; i < passwordFiledContraseña.getPassword().length; i++){
                contraseña += passwordFiledContraseña.getPassword()[i];         //VARIABLE += ARREGLO[ITERADOR]
            }
            if(contraseñaCorrecta.equals(contraseña)){
                JOptionPane.showMessageDialog(null, "INICIO DE SESIÓN EXITOSO");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR ... CONTRASEÑA INCORRECTA");
            }
        }else{
            JOptionPane.showMessageDialog(null,"ERROR ... USUARIO INCORRECTO");
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed
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
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaNombreUsuario;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField passwordFiledContraseña;
    private javax.swing.JTextField textFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
