/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rejestracja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author drzalajakub
 */
public class Rejestracja extends javax.swing.JFrame {

    /**
     * Creates new form Rejestracja
     */
    public Rejestracja() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOP_logowanie = new javax.swing.JOptionPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTF_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jB_rejestracja = new javax.swing.JButton();
        jTF_password = new javax.swing.JPasswordField();
        jTF_c_password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTF_log_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jB_logowanie = new javax.swing.JButton();
        jTF_log_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("Rejestracja");

        jLabel2.setText("Username");

        jTF_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_usernameKeyTyped(evt);
            }
        });

        jLabel3.setText("Email");

        jTF_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_emailActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel5.setText("Confirm password");

        jB_rejestracja.setText("Rejestracja");
        jB_rejestracja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_rejestracjaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_username)
                    .addComponent(jTF_email)
                    .addComponent(jTF_password)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jB_rejestracja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 258, Short.MAX_VALUE))
                    .addComponent(jTF_c_password))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_c_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_rejestracja)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rejestracja", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 250));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel6.setText("Logowanie");

        jLabel7.setText("Email");

        jLabel8.setText("Password");

        jB_logowanie.setText("Zaloguj");
        jB_logowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_logowanieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_log_email)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jB_logowanie))
                        .addGap(0, 305, Short.MAX_VALUE))
                    .addComponent(jTF_log_password))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_log_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_log_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_logowanie)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Logowanie", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_emailActionPerformed

    private void jB_rejestracjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_rejestracjaActionPerformed
        String username = jTF_username.getText();
        String email = jTF_email.getText();
        String password = jTF_password.getText();
        String c_password = jTF_c_password.getText();
        boolean dobreUsername = false, dobrePassword = false;
        
        if(username.isEmpty() || username.length()<2 || username.length()>20){
            jTF_username.setForeground(new java.awt.Color(255, 0, 0));
            dobreUsername = false;
        }
        else{
            jTF_username.setForeground(new java.awt.Color(0, 0, 0));
            dobreUsername = true;
            for(int i = 0; i<username.length();i++){
                char a = username.charAt(i);
                if(Character.isDigit(a)){
                    jTF_username.setForeground(new java.awt.Color(255, 0, 0));
                    dobreUsername = false;
                }
            }
        }
        
        
        if(password.equals(c_password)){
            for(int i = 0; i<password.length();i++){
                char a = password.charAt(i);
                if(Character.isDigit(a)){}
                else{
                    jTF_password.setForeground(new java.awt.Color(255, 0, 0));
                    jTF_c_password.setForeground(new java.awt.Color(255, 0, 0));
                    dobrePassword = false;

                }
                jTF_password.setForeground(new java.awt.Color(0, 0, 0));
                jTF_c_password.setForeground(new java.awt.Color(0, 0, 0));
                dobrePassword = true;
            }
        }
        else{
            jTF_password.setForeground(new java.awt.Color(255, 0, 0));
            jTF_c_password.setForeground(new java.awt.Color(255, 0, 0));
            dobrePassword = false;
        }
        
        if(dobrePassword==true && dobreUsername==true){
            File file = new File("sekretnehasla.csv");
            try {
                FileWriter fw = new FileWriter(file, true);
                fw.write("\n"+username + ":" + email + ":" + password);
                fw.close();
            } catch (IOException ex) {
                System.out.println("Nie działa");
            }
        }
    }//GEN-LAST:event_jB_rejestracjaActionPerformed

    private void jTF_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_usernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_usernameKeyTyped

    private void jB_logowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_logowanieActionPerformed
        String log_email = jTF_log_email.getText();
        String haslo = jTF_log_password.getText();
        String username = "imie";
        boolean dziala = false;
        File file = new File("sekretnehasla.csv");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                String[] log  = sc.next().split(":");
                if(log[1].equals(log_email) && log[2].equals(haslo)){
                    username = log[0];
                    dziala = true;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Nie działa");
        }
        if(dziala==true){
            jOP_logowanie.showMessageDialog(rootPane, "Witaj : "+username);
        }
        
    }//GEN-LAST:event_jB_logowanieActionPerformed

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
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rejestracja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_logowanie;
    private javax.swing.JButton jB_rejestracja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JOptionPane jOP_logowanie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTF_c_password;
    private javax.swing.JTextField jTF_email;
    private javax.swing.JTextField jTF_log_email;
    private javax.swing.JPasswordField jTF_log_password;
    private javax.swing.JPasswordField jTF_password;
    private javax.swing.JTextField jTF_username;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
