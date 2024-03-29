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
        Icon brak = new ImageIcon("brak.png");
        int kto = 0;
        int g1 = 0;
        int g2 = 0;
        String gracz1;
        String gracz2;

    /**
     * Creates new form Kolo
     */
    public Kolo() {
        initComponents();
        jB_1.setEnabled(false);
        jB_2.setEnabled(false);
        jB_3.setEnabled(false);
        jB_4.setEnabled(false);
        jB_5.setEnabled(false);
        jB_6.setEnabled(false);
        jB_7.setEnabled(false);
        jB_8.setEnabled(false);
        jB_9.setEnabled(false);
        jB_1.setIcon(brak);
        jB_2.setIcon(brak);
        jB_3.setIcon(brak);
        jB_4.setIcon(brak);
        jB_5.setIcon(brak);
        jB_6.setIcon(brak);
        jB_7.setIcon(brak);
        jB_8.setIcon(brak);
        jB_9.setIcon(brak);
    }
    
    public void Winner(){
        if(jB_1.getIcon()==krzyzyk && jB_2.getIcon()==krzyzyk && jB_3.getIcon()==krzyzyk || 
           jB_1.getIcon()==krzyzyk && jB_4.getIcon()==krzyzyk && jB_7.getIcon()==krzyzyk ||
           jB_1.getIcon()==krzyzyk && jB_5.getIcon()==krzyzyk && jB_9.getIcon()==krzyzyk ||
           jB_2.getIcon()==krzyzyk && jB_5.getIcon()==krzyzyk && jB_8.getIcon()==krzyzyk ||
           jB_4.getIcon()==krzyzyk && jB_5.getIcon()==krzyzyk && jB_6.getIcon()==krzyzyk ||
           jB_7.getIcon()==krzyzyk && jB_8.getIcon()==krzyzyk && jB_9.getIcon()==krzyzyk ||
           jB_3.getIcon()==krzyzyk && jB_6.getIcon()==krzyzyk && jB_9.getIcon()==krzyzyk ||
           jB_3.getIcon()==krzyzyk && jB_5.getIcon()==krzyzyk && jB_7.getIcon()==krzyzyk){
            System.out.println("wygrywa krzyżyk");
            g1++;
            jB_1.setEnabled(false);
            jB_2.setEnabled(false);
            jB_3.setEnabled(false);
            jB_4.setEnabled(false);
            jB_5.setEnabled(false);
            jB_6.setEnabled(false);
            jB_7.setEnabled(false);
            jB_8.setEnabled(false);
            jB_9.setEnabled(false);
        }
        else if(jB_1.getIcon()==kolo && jB_2.getIcon()==kolo && jB_3.getIcon()==kolo || 
                jB_1.getIcon()==kolo && jB_4.getIcon()==kolo && jB_7.getIcon()==kolo ||
                jB_1.getIcon()==kolo && jB_5.getIcon()==kolo && jB_9.getIcon()==kolo ||
                jB_2.getIcon()==kolo && jB_5.getIcon()==kolo && jB_8.getIcon()==kolo ||
                jB_4.getIcon()==kolo && jB_5.getIcon()==kolo && jB_6.getIcon()==kolo ||
                jB_7.getIcon()==kolo && jB_8.getIcon()==kolo && jB_9.getIcon()==kolo ||
                jB_3.getIcon()==kolo && jB_6.getIcon()==kolo && jB_9.getIcon()==kolo ||
                jB_3.getIcon()==kolo && jB_5.getIcon()==kolo && jB_7.getIcon()==kolo){
            System.out.println("wygrywa kółko");
            jB_1.setEnabled(false);
            jB_2.setEnabled(false);
            jB_3.setEnabled(false);
            jB_4.setEnabled(false);
            jB_5.setEnabled(false);
            jB_6.setEnabled(false);
            jB_7.setEnabled(false);
            jB_8.setEnabled(false);
            jB_9.setEnabled(false);
            g2++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jF_Start = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTF_g1 = new javax.swing.JTextField();
        jTF_g2 = new javax.swing.JTextField();
        jB_start = new javax.swing.JButton();
        jF_wyniki = new javax.swing.JFrame();
        jL_gracz1 = new javax.swing.JLabel();
        jL_gracz2 = new javax.swing.JLabel();
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
        jM_nowagra = new javax.swing.JMenuItem();
        jM_rewanz = new javax.swing.JMenuItem();
        jM_wyniki = new javax.swing.JMenuItem();

        jF_Start.setTitle("Podaj nazwę graczy");
        jF_Start.setResizable(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Gracz 1:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Gracz 2:");

        jB_start.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jB_start.setText("Start");
        jB_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jF_StartLayout = new javax.swing.GroupLayout(jF_Start.getContentPane());
        jF_Start.getContentPane().setLayout(jF_StartLayout);
        jF_StartLayout.setHorizontalGroup(
            jF_StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_StartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jF_StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jF_StartLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_g1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jF_StartLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_g2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jB_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jF_StartLayout.setVerticalGroup(
            jF_StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_StartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jF_StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jF_StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jB_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jF_wyniki.setMaximumSize(new java.awt.Dimension(300, 174));
        jF_wyniki.setMinimumSize(new java.awt.Dimension(300, 174));

        jL_gracz1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jL_gracz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jL_gracz2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jL_gracz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jF_wynikiLayout = new javax.swing.GroupLayout(jF_wyniki.getContentPane());
        jF_wyniki.getContentPane().setLayout(jF_wynikiLayout);
        jF_wynikiLayout.setHorizontalGroup(
            jF_wynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_wynikiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jF_wynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_gracz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jL_gracz2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );
        jF_wynikiLayout.setVerticalGroup(
            jF_wynikiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_wynikiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_gracz1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_gracz2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kółko i Krzyżyk");
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

        jMenu1.setText("Gra");

        jM_nowagra.setText("Nowa gra");
        jM_nowagra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_nowagraActionPerformed(evt);
            }
        });
        jMenu1.add(jM_nowagra);

        jM_rewanz.setText("Rewanż");
        jM_rewanz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_rewanzActionPerformed(evt);
            }
        });
        jMenu1.add(jM_rewanz);

        jM_wyniki.setText("Wyniki");
        jM_wyniki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_wynikiActionPerformed(evt);
            }
        });
        jMenu1.add(jM_wyniki);

        jMenuBar1.add(jMenu1);

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
        jB_2.setEnabled(false);
        Winner();
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
        jB_3.setEnabled(false);
        Winner();
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
        jB_1.setEnabled(false);
        Winner();
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
        jB_4.setEnabled(false);
        Winner();
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
        jB_5.setEnabled(false);
        Winner();
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
        jB_6.setEnabled(false);
        Winner();
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
        jB_7.setEnabled(false);
        Winner();
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
       jB_8.setEnabled(false);
       Winner();
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
        jB_9.setEnabled(false);
        Winner();
    }//GEN-LAST:event_jB_9ActionPerformed

    private void jM_nowagraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_nowagraActionPerformed
        jF_Start.setVisible(true);
        jF_Start.setSize(300, 250);
    }//GEN-LAST:event_jM_nowagraActionPerformed

    private void jB_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_startActionPerformed
       jB_1.setEnabled(true);
       jB_2.setEnabled(true);
       jB_3.setEnabled(true);
       jB_4.setEnabled(true);
       jB_5.setEnabled(true);
       jB_6.setEnabled(true);
       jB_7.setEnabled(true);
       jB_8.setEnabled(true);
       jB_9.setEnabled(true);
       
       jB_1.setIcon(brak);
       jB_2.setIcon(brak);
       jB_3.setIcon(brak);
       jB_4.setIcon(brak);
       jB_5.setIcon(brak);
       jB_6.setIcon(brak);
       jB_7.setIcon(brak);
       jB_8.setIcon(brak);
       jB_9.setIcon(brak);
       
       jF_Start.setVisible(false);
       kto = 0;
       
       gracz1 = jTF_g1.getText();
       gracz2 = jTF_g2.getText();
       g1 = 0;
       g2 = 0;
    }//GEN-LAST:event_jB_startActionPerformed

    private void jM_rewanzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_rewanzActionPerformed
        jB_1.setEnabled(true);
       jB_2.setEnabled(true);
       jB_3.setEnabled(true);
       jB_4.setEnabled(true);
       jB_5.setEnabled(true);
       jB_6.setEnabled(true);
       jB_7.setEnabled(true);
       jB_8.setEnabled(true);
       jB_9.setEnabled(true);
       
       jB_1.setIcon(brak);
       jB_2.setIcon(brak);
       jB_3.setIcon(brak);
       jB_4.setIcon(brak);
       jB_5.setIcon(brak);
       jB_6.setIcon(brak);
       jB_7.setIcon(brak);
       jB_8.setIcon(brak);
       jB_9.setIcon(brak);
       kto = 0;
    }//GEN-LAST:event_jM_rewanzActionPerformed
    
    public void Wyniki(){
        jL_gracz1.setText("Nazwa: "+gracz1+" | "+"Wynik: "+g1);
        jL_gracz2.setText("Nazwa: "+gracz2+" | "+"Wynik: "+g2);
    }
    
    private void jM_wynikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_wynikiActionPerformed
        jF_wyniki.setVisible(true);
        jF_wyniki.setSize(300, 250);
        Wyniki();
    }//GEN-LAST:event_jM_wynikiActionPerformed

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
    private javax.swing.JButton jB_start;
    private javax.swing.JFrame jF_Start;
    private javax.swing.JFrame jF_wyniki;
    private javax.swing.JLabel jL_gracz1;
    private javax.swing.JLabel jL_gracz2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jM_nowagra;
    private javax.swing.JMenuItem jM_rewanz;
    private javax.swing.JMenuItem jM_wyniki;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTF_g1;
    private javax.swing.JTextField jTF_g2;
    // End of variables declaration//GEN-END:variables
}
