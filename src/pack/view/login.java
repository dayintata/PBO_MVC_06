/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayinta-PC
 */
public class login extends javax.swing.JFrame {

    static String useraktif;

    
    

    String user;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtnama = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SignUp = new javax.swing.JButton();
        SignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 50, 110, 20);

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 120, 110, 20);

        jButton3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 250, 90, 31);

        txtnama.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        getContentPane().add(txtnama);
        txtnama.setBounds(120, 80, 140, 30);

        txtpass.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        getContentPane().add(txtpass);
        txtpass.setBounds(120, 150, 140, 30);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        SignUp.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        SignUp.setText("SignUp");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        jPanel1.add(SignUp);
        SignUp.setBounds(90, 210, 95, 31);

        SignIn.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        SignIn.setText("SingIn");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });
        jPanel1.add(SignIn);
        SignIn.setBounds(200, 210, 100, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        // TODO add your handling code here:
        Connection connection = null; 
        PreparedStatement ps; 
        try { 
            ps = connection.prepareStatement("SELECT * FROM `tb_akun` WHERE `username` = ? AND `password` = ?"); 
            ps.setString(1, txtnama.getText()); 
            ps.setString(2, txtpass.getText()); 
            ResultSet result =ps.executeQuery(); 
            if(result.next()){ 
                new home().show(); 
                user = txtnama.getText(); //perlu deklarasi user diclass utama. 
                this.dispose();
            } 
            else{ 
                JOptionPane.showMessageDialog(rootPane, "Salah!"); 
                txtpass.setText(""); 
                txtnama.requestFocus(); 
            } 
        }catch (SQLException ex){ 
            JOptionPane.showMessageDialog(rootPane,"Gagal!");
        }
    }//GEN-LAST:event_SignInActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignIn;
    private javax.swing.JButton SignUp;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
