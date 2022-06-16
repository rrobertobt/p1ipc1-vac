/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.vehicles;

import com.robertob.proyecto1.ipc1.engine.weapons.Weapon;

/**
 *
 * @author robertob
 */
public abstract class Vehicle {
    
    private String name;
    private int hp;
    private int pp;
    private int level;
    private int attack;
    private int defense;
    private int aim;
    private int xp;
    private Weapon weapon1;
    private Weapon weapon2;
    private boolean isDestroyed;

    public Vehicle(String name, int attack, int defense, int aim, Weapon weapon1, Weapon weapon2) {
        this.name = name;
        this.hp = 50;
        this.pp = 5;
        this.level = 1;
        this.xp = 0;
        this.attack = attack;
        this.defense = defense;
        this.aim = aim;
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;
        this.isDestroyed = false;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPp() {
        return pp;
    }

    public int getLevel() {
        return level;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getAim() {
        return aim;
    }

    public int getXp() {
        return xp;
    }

    public Weapon getWeapon1() {
        return weapon1;
    }

    public Weapon getWeapon2() {
        return weapon2;
    }

    public void setWeapon1(Weapon weapon1) {
        this.weapon1 = weapon1;
    }

    public void setWeapon2(Weapon weapon2) {
        this.weapon2 = weapon2;
    }
    
    public boolean isDestroyed(){
        return isDestroyed;
    }
    
    public void setDestroyed(){
        isDestroyed = true;
    }
    
    public abstract String getImage();
    
}
