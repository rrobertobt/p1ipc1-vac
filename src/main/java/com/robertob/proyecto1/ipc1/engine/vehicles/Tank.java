/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.vehicles;

import com.robertob.proyecto1.ipc1.engine.weapons.Rifle;



/**
 *
 * @author robertob
 */
public class Tank extends Vehicle{

    public Tank(String name) {
        super(name, 10, 6, 50, new Rifle(), null);    
    }
   
    public String getImage(){
        return "src/main/resources/com/robertob/proyecto1-ipc1/images/tankSmallBlack.png";
    }
}
