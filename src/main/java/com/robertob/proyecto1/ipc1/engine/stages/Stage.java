/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.stages;
import com.robertob.proyecto1.ipc1.engine.vehicles.*;


public class Stage {
    
    Section[][] map;
    int playerPosX;
    int playerPosY;
    int[][] enemiesPosXY;

    public Stage() {
        
    }
    
    public Section getMapOnIndexes(int indexA, int indexB) {
        return map[indexA][indexB];
    }

    public Section[][] getMap(){
        return map; 
    }
    
    public int getPlayerPosX() {
        return playerPosX;
    }

    public int getPlayerPosY() {
        return playerPosY;
    }

    public int[][] getEnemiesPosXY() {
        return enemiesPosXY;
    }
   
    public void moveVehicle(String direction, int spaces){
        // guardando posicion actual del jugador y el tipo de casilla sobre la que esta, la casilla sobre la que esta, y a la que se quiere mover
        PlayerSection oldPlayerSection = (PlayerSection) getMapOnIndexes(playerPosX, playerPosY);
        Section oldUnderSection = oldPlayerSection.getUnderSection();
        Section nextSection;
        
        System.out.println(direction);
        
        switch (direction) {
            case "Arriba":
                // guardamos la seccion a la que se quiere mover para comprobarla
                nextSection = map[playerPosX-spaces][playerPosY];
                // comprobamos si el vehiculo es un avion
                try {
                    if (oldPlayerSection.getPlayer().getCurrentVehicle() instanceof Plane){
                        // comprobamos si la seccion a moverse es montaña
                        if (nextSection instanceof MountainSection) {
                            System.out.println("cant move here: mountain");
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX-spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX -= spaces;
                        }
                    } else { // en caso sea un tanque:
                        if (nextSection instanceof MountainSection || nextSection instanceof WaterSection) {
                            System.out.println("cant move here: mountain or water");
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX-spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX -= spaces;
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println("cant move outside map");
                }
                break;
            case "Abajo":
                
                // guardamos la seccion a la que se quiere mover para comprobarla
                nextSection = map[playerPosX][playerPosY-spaces];
                // comprobamos si el vehiculo es un avion
                try {
                    if (oldPlayerSection.getPlayer().getCurrentVehicle() instanceof Plane){
                        // comprobamos si la seccion a moverse es montaña
                        if (nextSection instanceof MountainSection) {
                            System.out.println("cant move here: mountain");
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX][playerPosY-spaces] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosY -= spaces;
                        }
                    } else { // en caso sea un tanque:
                        if (nextSection instanceof MountainSection || nextSection instanceof WaterSection) {
                            System.out.println("cant move here: mountain or water");
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX][playerPosY-spaces] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosY -= spaces;
                        }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("cant move outside map");
                }
                
            case "Derecha":
                
                // guardamos la seccion a la que se quiere mover para comprobarla
                nextSection = map[playerPosX+spaces][playerPosY];
                // comprobamos si el vehiculo es un avion
                try {
                    if (oldPlayerSection.getPlayer().getCurrentVehicle() instanceof Plane){
                        // comprobamos si la seccion a moverse es montaña
                        if (nextSection instanceof MountainSection) {
                            System.out.println("cant move here: mountain");
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX+spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX += spaces;
                        }
                    } else { // en caso sea un tanque:
                        if (nextSection instanceof MountainSection || nextSection instanceof WaterSection) {
                            System.out.println("cant move here: mountain or water");
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX+spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX += spaces;
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println("cant move outside map");
                }
                break;
            case "Izquierda":
                
                // guardamos la seccion a la que se quiere mover para comprobarla
                nextSection = map[playerPosX-spaces][playerPosY];
                // comprobamos si el vehiculo es un avion
                try {
                    if (oldPlayerSection.getPlayer().getCurrentVehicle() instanceof Plane){
                        // comprobamos si la seccion a moverse es montaña
                        if (nextSection instanceof MountainSection) {
                            System.out.println("cant move here: mountain");
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX-spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX -= spaces;
                        }
                    } else { // en caso sea un tanque:
                        if (nextSection instanceof MountainSection || nextSection instanceof WaterSection) {
                            System.out.println("cant move here: mountain or water");
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX][playerPosY+spaces] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX -= spaces;
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println("cant move outside map");
                }
                break;
            default:
                    throw new AssertionError();
        }
    
    }
    
    
}
