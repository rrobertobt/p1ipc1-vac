/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.robertob.proyecto1.ipc1.frames;

import com.robertob.proyecto1.ipc1.engine.GameEngine;

/**
 *
 * @author robertob
 */
public class PlayerNickFrame extends javax.swing.JFrame {

    GameEngine gameEngine;
    
    public PlayerNickFrame(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
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

        createCharacterTitle1 = new javax.swing.JLabel();
        createCharacterTitle2 = new javax.swing.JLabel();
        nicknameTextField = new javax.swing.JTextField();
        continueNicknameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creando personaje");
        setResizable(false);

        createCharacterTitle1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        createCharacterTitle1.setText("¡Creemos tu personaje!");

        createCharacterTitle2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        createCharacterTitle2.setText("Dale un nickname a tu personaje:");

        nicknameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicknameTextFieldKeyTyped(evt);
            }
        });

        continueNicknameBtn.setBackground(new java.awt.Color(0, 255, 204));
        continueNicknameBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        continueNicknameBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/robertob/proyecto1-ipc1/images/playIcon.png"))); // NOI18N
        continueNicknameBtn.setText(" CONTINUAR");
        continueNicknameBtn.setBorderPainted(false);
        continueNicknameBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continueNicknameBtn.setEnabled(false);
        continueNicknameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueNicknameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(nicknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createCharacterTitle2)
                            .addComponent(createCharacterTitle1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(continueNicknameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(createCharacterTitle1)
                .addGap(18, 18, 18)
                .addComponent(createCharacterTitle2)
                .addGap(31, 31, 31)
                .addComponent(nicknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(continueNicknameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueNicknameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueNicknameBtnActionPerformed
        gameEngine.getPlayer().setNickname(nicknameTextField.getText());
        new ChooseInitialVehicleFrame(gameEngine).setVisible(true);
        this.dispose();
        System.out.println("(TEST) PLAYERNICKNAME= "+gameEngine.getPlayer().getNickname());
        
    }//GEN-LAST:event_continueNicknameBtnActionPerformed

    private void nicknameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicknameTextFieldKeyTyped
        if (nicknameTextField.getText().equals("")){
            continueNicknameBtn.setEnabled(false);
        } else {
            continueNicknameBtn.setEnabled(true);
        }
    }//GEN-LAST:event_nicknameTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueNicknameBtn;
    private javax.swing.JLabel createCharacterTitle1;
    private javax.swing.JLabel createCharacterTitle2;
    private javax.swing.JTextField nicknameTextField;
    // End of variables declaration//GEN-END:variables
}
