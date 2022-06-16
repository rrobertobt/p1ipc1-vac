/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.weapons;

/**
 *
 * @author robertob
 */
public abstract class Weapon {
    
    private int attackMod;
    private int aimMod;
    private int speedMod;
    private String type;
    
    public Weapon(int attackMod, int aimMod, int speedMod, String type) {
        this.attackMod = attackMod;
        this.aimMod = aimMod;
        this.speedMod = speedMod;
        this.type = type;
    }

    public int getAttackMod() {
        return attackMod;
    }

    public int getAimMod() {
        return aimMod;
    }

    public int getSpeedMod() {
        return speedMod;
    }

    public String getType() {
        return type;
    }
    
    
    
    
}
