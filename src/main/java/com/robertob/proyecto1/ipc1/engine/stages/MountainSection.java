/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.stages;

/**
 *
 * @author robertob
 */
public class MountainSection extends Section{
    
    int hp = 3;
    
    public String getImage(int size) {
        
        switch (size) {
            case 6:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/mountainSection6.png";
            case 10:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/mountainSection10.png";
            case 15:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/mountainSection15.png";
            default:
                return null;
        }
         
    }
    
}
