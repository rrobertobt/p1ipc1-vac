/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.stages;
import com.robertob.proyecto1.ipc1.engine.characters.*;

/**
 *
 * @author robertob
 */
public class EnemySection extends Section{
    
    private Enemy enemy;
    
    public String getImage(int size) {
        
        switch (size) {
            case 6:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/enemySection6.png";
            case 10:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/enemySection10.png";
            case 15:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/enemySection15.png";
            default:
                return null;
        }
         
    }
    
}
