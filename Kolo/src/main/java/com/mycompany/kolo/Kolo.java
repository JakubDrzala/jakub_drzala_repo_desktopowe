/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kolo;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author drzalajakub
 */
public class Kolo extends javax.swing.JFrame {
        Icon krzyzyk = new ImageIcon("krzyzyk.png");
        Icon kolo = new ImageIcon("kolko.png");
        int kto = 0;

    /**
     * Creates new form Kolo
     */
    public Kolo() {
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

        jB_1 = new javax.swing.JButton();
        jB_4 = new javax.swing.JButton();
        jB_7 = new javax.swing.JButton();
        jB_2 = new javax.swing.JButton();
        jB_5 = new javax.swing.JButton();
        jB_8 = new javax.swing.JButton();
        jB_3 = new javax.swing.JButton();
        jB_6 = new javax.swing.JButton();
        jB_9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jB_1.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_1.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_1ActionPerformed(evt);
            }
        });

        jB_4.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_4.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_4ActionPerformed(evt);
            }
        });

        jB_7.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_7.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_7ActionPerformed(evt);
            }
        });

        jB_2.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_2.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_2ActionPerformed(evt);
            }
        });

        jB_5.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_5.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_5ActionPerformed(evt);
            }
        });

        jB_8.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_8.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_8ActionPerformed(evt);
            }
        });

        jB_3.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_3.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_3ActionPerformed(evt);
            }
        });

        jB_6.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_6.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_6ActionPerformed(evt);
            }
        });

        jB_9.setMaximumSize(new java.awt.Dimension(80, 80));
        jB_9.setMinimumSize(new java.awt.Dimension(80, 80));
        jB_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_9ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_2ActionPerformed
        if(kto == 0){
            jB_2.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_2.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_2ActionPerformed

    private void jB_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_3ActionPerformed
        if(kto == 0){
            jB_3.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_3.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_3ActionPerformed

    private void jB_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_1ActionPerformed
        if(kto == 0){
            jB_1.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_1.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_1ActionPerformed

    private void jB_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_4ActionPerformed
        if(kto == 0){
            jB_4.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_4.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_4ActionPerformed

    private void jB_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_5ActionPerformed
        if(kto == 0){
            jB_5.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_5.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_5ActionPerformed

    private void jB_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_6ActionPerformed
        if(kto == 0){
            jB_6.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_6.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_6ActionPerformed

    private void jB_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_7ActionPerformed
        if(kto == 0){
            jB_7.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_7.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_7ActionPerformed

    private void jB_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_8ActionPerformed
       if(kto == 0){
            jB_8.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_8.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_8ActionPerformed

    private void jB_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_9ActionPerformed
        if(kto == 0){
            jB_9.setIcon(krzyzyk);
            kto = 1;
        }
        else{
            jB_9.setIcon(kolo);
            kto = 0;
        }
    }//GEN-LAST:event_jB_9ActionPerformed

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
            java.util.logging.Logger.getLogger(Kolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kolo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_1;
    private javax.swing.JButton jB_2;
    private javax.swing.JButton jB_3;
    private javax.swing.JButton jB_4;
    private javax.swing.JButton jB_5;
    private javax.swing.JButton jB_6;
    private javax.swing.JButton jB_7;
    private javax.swing.JButton jB_8;
    private javax.swing.JButton jB_9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
