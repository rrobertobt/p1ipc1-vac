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
    
    int attackMod;
    int aimMod;
    int speedMod;
    int ammo;
    
    public Weapon(int attackMod, int aimMod, int speedMod) {
        this.attackMod = attackMod;
        this.aimMod = aimMod;
        this.speedMod = speedMod;
    }
    
    
    
}
