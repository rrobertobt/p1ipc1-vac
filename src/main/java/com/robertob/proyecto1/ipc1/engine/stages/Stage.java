/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.stages;
import com.robertob.proyecto1.ipc1.engine.vehicles.*;
import javax.swing.JOptionPane;


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
                
                try {
                    // guardamos la seccion a la que se quiere mover para comprobarla
                    nextSection = map[playerPosX-spaces][playerPosY];
                    // comprobamos si el vehiculo es un avion
                    if (oldPlayerSection.getPlayer().getCurrentVehicle() instanceof Plane){
                        // comprobamos si la seccion a moverse es montaña
                        if (nextSection instanceof MountainSection) {
                            System.out.println("cant move here: mountain");
                            JOptionPane.showMessageDialog(null, "No puedes moverte a esta sección del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX-spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX -= spaces;
                        }
                    } else { // en caso sea un tanque:
                        if (nextSection instanceof MountainSection || nextSection instanceof WaterSection) {
                            System.out.println("cant move here: mountain or water");
                            JOptionPane.showMessageDialog(null, "No puedes moverte a esta sección del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX-spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX -= spaces;
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println("cant move outside map");
                    JOptionPane.showMessageDialog(null, "No puedes fuera del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Abajo":
                try {
                // guardamos la seccion a la que se quiere mover para comprobarla
                nextSection = map[playerPosX+spaces][playerPosY];
                // comprobamos si el vehiculo es un avion
                    if (oldPlayerSection.getPlayer().getCurrentVehicle() instanceof Plane){
                        // comprobamos si la seccion a moverse es montaña
                        if (nextSection instanceof MountainSection) {
                            System.out.println("cant move here: mountain");
                            JOptionPane.showMessageDialog(null, "No puedes moverte a esta sección del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX+spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX += spaces;
                        }
                    } else { // en caso sea un tanque:
                        if (nextSection instanceof MountainSection || nextSection instanceof WaterSection) {
                            System.out.println("cant move here: mountain or water");
                            JOptionPane.showMessageDialog(null, "No puedes moverte a esta sección del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX+spaces][playerPosY] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosX += spaces;
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println("cant move outside map");
                    JOptionPane.showMessageDialog(null, "No puedes moverte fuera del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Derecha":
                try {
                    // guardamos la seccion a la que se quiere mover para comprobarla
                    nextSection = map[playerPosX][playerPosY+spaces];
                    // comprobamos si el vehiculo es un avion
                    if (oldPlayerSection.getPlayer().getCurrentVehicle() instanceof Plane){
                        // comprobamos si la seccion a moverse es montaña
                        if (nextSection instanceof MountainSection) {
                            System.out.println("cant move here: mountain");
                            JOptionPane.showMessageDialog(null, "No puedes moverte a esta sección del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX][playerPosY+spaces] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosY += spaces;
                        }
                    } else { // en caso sea un tanque:
                        if (nextSection instanceof MountainSection || nextSection instanceof WaterSection) {
                            System.out.println("cant move here: mountain or water");
                            JOptionPane.showMessageDialog(null, "No puedes moverte a esta sección del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX][playerPosY+spaces] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosY += spaces;
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println("cant move outside map");
                    JOptionPane.showMessageDialog(null, "No puedes moverte fuera del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Izquierda":
                try {
                    // guardamos la seccion a la que se quiere mover para comprobarla
                    nextSection = map[playerPosX][playerPosY-spaces];
                    // comprobamos si el vehiculo es un avion
                    if (oldPlayerSection.getPlayer().getCurrentVehicle() instanceof Plane){
                        // comprobamos si la seccion a moverse es montaña
                        if (nextSection instanceof MountainSection) {
                            System.out.println("cant move here: mountain");
                            JOptionPane.showMessageDialog(null, "No puedes moverte a esta sección del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX][playerPosY-spaces] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosY -= spaces;
                        }
                    } else { // en caso sea un tanque:
                        if (nextSection instanceof MountainSection || nextSection instanceof WaterSection) {
                            System.out.println("cant move here: mountain or water");
                            JOptionPane.showMessageDialog(null, "No puedes moverte a esta sección del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                        } else {
                            oldPlayerSection.setUnderSection(nextSection); // asignamos la casilla sobre la que se pondra el jugador a el
                            map[playerPosX][playerPosY-spaces] = oldPlayerSection; //movemos al jugador a la nueva posicion
                            map[playerPosX][playerPosY] = oldUnderSection; // en la casilla vieja la regresamos al tipo que era
                            this.playerPosY -= spaces;
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println("cant move outside map");
                    JOptionPane.showMessageDialog(null, "No puedes moverte fuera del mapa!","Movimiento prohibido",JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
                    throw new AssertionError();
        }
    
    }
    
    
}
