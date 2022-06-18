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
public class PlayerSection extends Section{
    
    private Player player;
    private Section underSection;

    public PlayerSection(Player player, Section underSection) {
        this.player = player;
        this.underSection = underSection;
    }
    
    public String getImage(int size) {
        
        switch (size) {
            case 6:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/playerSection6.png";
            case 10:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/playerSection10.png";
            case 15:
                return "src/main/resources/com/robertob/proyecto1-ipc1/images/playerSection15.png";
            default:
                return null;
        }
         
    }
    
    public Section getUnderSection(){
        return underSection;
    }

    public Player getPlayer() {
        return player;
    }

    public void setUnderSection(Section underSection) {
        this.underSection = underSection;
    }
    
    
    
}
