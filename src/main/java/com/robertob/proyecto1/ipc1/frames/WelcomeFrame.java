/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.robertob.proyecto1.ipc1.frames;

import com.robertob.proyecto1.ipc1.engine.*;

/**
 *
 * @author robertob
 */
public class WelcomeFrame extends javax.swing.JFrame {

    GameEngine gameEngine = new GameEngine();
    PlayerNickFrame playerNickFrame = new PlayerNickFrame(gameEngine);
    
    public WelcomeFrame() {
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

        welcomeTitle = new javax.swing.JLabel();
        welcomeTitle1 = new javax.swing.JLabel();
        welcomeTitle2 = new javax.swing.JLabel();
        startWelcomeBtn = new javax.swing.JButton();
        exitWelcomeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Bienvenida");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        welcomeTitle.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        welcomeTitle.setText("¡Bienvenid@ al juego!");

        welcomeTitle1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        welcomeTitle1.setText("o presiona \"Salir\" para salir del juego");

        welcomeTitle2.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        welcomeTitle2.setText("Presiona el botón \"Iniciar\" para empezar,");

        startWelcomeBtn.setBackground(new java.awt.Color(0, 255, 204));
        startWelcomeBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        startWelcomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/proyecto1-ipc1/images/playIcon.png"))); // NOI18N
        startWelcomeBtn.setText(" INICIAR");
        startWelcomeBtn.setBorderPainted(false);
        startWelcomeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startWelcomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startWelcomeBtnActionPerformed(evt);
            }
        });

        exitWelcomeBtn.setBackground(new java.awt.Color(255, 204, 204));
        exitWelcomeBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        exitWelcomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/proyecto1-ipc1/images/exitIconSymBlack.png"))); // NOI18N
        exitWelcomeBtn.setText(" SALIR");
        exitWelcomeBtn.setBorderPainted(false);
        exitWelcomeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitWelcomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitWelcomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(welcomeTitle)
                            .addGap(135, 135, 135))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(welcomeTitle2)
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(welcomeTitle1)
                            .addGap(54, 54, 54)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitWelcomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startWelcomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(welcomeTitle)
                .addGap(38, 38, 38)
                .addComponent(welcomeTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeTitle1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitWelcomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startWelcomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startWelcomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startWelcomeBtnActionPerformed
        this.dispose();
        playerNickFrame.setVisible(true);
        
    }//GEN-LAST:event_startWelcomeBtnActionPerformed

    private void exitWelcomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitWelcomeBtnActionPerformed
        System.out.println("Saliendo del juego");
        System.exit(0);
    }//GEN-LAST:event_exitWelcomeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitWelcomeBtn;
    private javax.swing.JButton startWelcomeBtn;
    private javax.swing.JLabel welcomeTitle;
    private javax.swing.JLabel welcomeTitle1;
    private javax.swing.JLabel welcomeTitle2;
    // End of variables declaration//GEN-END:variables
}
