/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yessy
 */
public class CekSaldo extends javax.swing.JFrame {

    /**
     * Creates new form CekSaldo
     */
    public CekSaldo(String q) {
        initComponents();
        jhasil.setText(q);
    }

    private CekSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBKembali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jhasil = new javax.swing.JTextField();
        jBKembali1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jBKembali.setText("KELUAR");
        jBKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(jBKembali);
        jBKembali.setBounds(400, 460, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("SALDO ANDA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 200, 180, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Selamat Datang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 30, 440, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("ATM MANDIRI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 90, 190, 29);

        jhasil.setEditable(false);
        getContentPane().add(jhasil);
        jhasil.setBounds(100, 280, 360, 60);

        jBKembali1.setText("KEMBALI");
        jBKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKembali1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBKembali1);
        jBKembali1.setBounds(30, 460, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fdfds.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKembaliActionPerformed
      dispose();
    }//GEN-LAST:event_jBKembaliActionPerformed

    private void jBKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKembali1ActionPerformed
        Menu b = new Menu();
            b.show(); 
            dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jBKembali1ActionPerformed

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
            java.util.logging.Logger.getLogger(CekSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBKembali;
    private javax.swing.JButton jBKembali1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jhasil;
    // End of variables declaration//GEN-END:variables
}
