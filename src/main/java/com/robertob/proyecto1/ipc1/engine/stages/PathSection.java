/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.stages;

/**
 *
 * @author robertob
 */
public class PathSection extends Section{
    
    public String getImage(int size) {
        
        switch (size) {
            case 6:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/pathSection6.png";
            case 10:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/pathSection10.png";
            case 15:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/pathSection15.png";
            default:
                return null;
        }
         
    }
}
