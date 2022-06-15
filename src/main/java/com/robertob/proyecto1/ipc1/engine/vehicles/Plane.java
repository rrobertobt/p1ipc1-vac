package com.robertob.proyecto1.ipc1.engine.vehicles;

import com.robertob.proyecto1.ipc1.engine.weapons.Rifle;

public class Plane extends Vehicle{
    
    int speed;

    public Plane(String name) {
        super(name, 7, 3, 70, new Rifle(), null);
        this.speed = 1;
    }

    public String getImage(){
        return "src/main/resources/com/robertob/proyecto1-ipc1/images/planeSmallBlack.png";
    }
    
    
}
