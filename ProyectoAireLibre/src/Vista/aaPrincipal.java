/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author jamt_
 */
public class aaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form aaPrincipal
     */
    public aaPrincipal() {
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

        btnRutaTren = new javax.swing.JButton();
        btnRutasVerdes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(732, 700));
        setMinimumSize(new java.awt.Dimension(732, 700));
        getContentPane().setLayout(null);

        btnRutaTren.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        btnRutaTren.setText("RUTA TREN");
        btnRutaTren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaTrenActionPerformed(evt);
            }
        });
        getContentPane().add(btnRutaTren);
        btnRutaTren.setBounds(200, 470, 150, 40);

        btnRutasVerdes.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        btnRutasVerdes.setText("RUTAS VERDES");
        btnRutasVerdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutasVerdesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRutasVerdes);
        btnRutasVerdes.setBounds(380, 470, 170, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenidos a PeruRail");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 310, 560, 60);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("VER BOLETOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 530, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMachuPicchu (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRutaTrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaTrenActionPerformed
        // TODO add your handling code here:
        abRutasTren RT = new abRutasTren();
        RT.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRutaTrenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adBoletos bol = new adBoletos();
        bol.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRutasVerdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutasVerdesActionPerformed
        // TODO add your handling code here:
        aeRutasVerdes rutver = new aeRutasVerdes();
        rutver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRutasVerdesActionPerformed

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
            java.util.logging.Logger.getLogger(aaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRutaTren;
    private javax.swing.JButton btnRutasVerdes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
