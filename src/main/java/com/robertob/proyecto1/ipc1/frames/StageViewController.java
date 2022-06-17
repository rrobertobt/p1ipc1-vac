/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.frames;
import com.robertob.proyecto1.ipc1.engine.stages.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author robertob
 */
public class StageViewController {
    
    Section[][] stageToShow;
    JPanel displayPanel;
    JLabel[][] iconMatrix;
    int size;

    public StageViewController(Section[][] stageToShow, JPanel displayPanel) {
        this.stageToShow = stageToShow;
        this.displayPanel = displayPanel;
        this.size = stageToShow.length;
    }
    
    public void paintPanel(){
        iconMatrix = null;
        iconMatrix = new JLabel[size][size];
        displayPanel.removeAll();
        int width = displayPanel.getWidth()/size;
        int height = displayPanel.getHeight()/size;
        for (int i = 0; i < iconMatrix.length; i++) {
            for (int j = 0; j < iconMatrix[0].length; j++) {
                JLabel newIcon = new JLabel(new ImageIcon(stageToShow[j][i].getImage(size)));
                newIcon.setBounds(width*i, height*j, width, height);
                newIcon.setBorder(BorderFactory.createLineBorder(Color.gray, 1, false));
                iconMatrix[i][j] = newIcon;
            }
        }
        for (int i = 0; i < iconMatrix.length; i++) {
            for (int j = 0; j < iconMatrix[0].length; j++) {
                displayPanel.add(iconMatrix[j][i]);
                displayPanel.repaint();
                System.out.println("Pintndo mapa");
            }
            
        }
        System.out.println("(TEST) width: "+width);
        System.out.println("(TEST) height: "+height);
        
    }
    
}
