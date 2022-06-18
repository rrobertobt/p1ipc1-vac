/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertob.proyecto1.ipc1.engine.stages;

import com.robertob.proyecto1.ipc1.engine.characters.Player;

/**
 *
 * @author robertob
 */
public class BaseStageC extends Stage {
       
    Player currentPlayer;
    
    public BaseStageC(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
        map = new Section[][]{
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new EnemySection(), new EnemySection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new EnemySection(), new EnemySection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new WaterSection(), new MountainSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new EnemySection(), new EnemySection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PlayerSection(currentPlayer, new PathSection()), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},


        };
        playerPosX = 10;
        playerPosY = 5;
        enemiesPosXY = new int[][]{
            {4,1},
            {2,4},
            {2,5},
            {2,6},
            {4,10},
        };
    }
    
    
    
}
