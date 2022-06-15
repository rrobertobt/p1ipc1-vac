/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.characters;
import com.robertob.proyecto1.ipc1.engine.vehicles.*;

/**
 *
 * @author robertob
 */
public class Player {
    
    private String nickname;
    private Vehicle[] vehicles = new Vehicle[3];
    private Vehicle currentVehicle;
    
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public void addVehicle(Vehicle newVehicle){
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = newVehicle;
                break;
            }
            
        }
    }

    public Vehicle getVehicleIndex(int index){
        return vehicles[index];
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentVehicle(Vehicle currentVehicle) {
        this.currentVehicle = currentVehicle;
    }
    
    
    
    
    // TESTING
    public void showAllVehicles(){
        
        for (int i=0; i < vehicles.length; i++) {
            if (vehicles[i] != null){
                System.out.println("(TEST) "+i+vehicles[i].getClass().getSimpleName()+vehicles[i].getName()); 
                break;
            }
            
        }
    }
    
    
}
