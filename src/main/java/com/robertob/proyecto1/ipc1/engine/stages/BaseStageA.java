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
public class BaseStageA extends Stage {
    
    private Player currentPlayer;
    
    public BaseStageA(Player currentPlayer) {
        map = new Section[][]{
            {new PathSection(), new EnemySection(), new EnemySection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new EnemySection(), new WaterSection()},
            {new MountainSection(), new PathSection(), new MountainSection(), new MountainSection(), new PathSection(), new WaterSection()},
            {new MountainSection(), new PathSection(), new MountainSection(), new MountainSection(), new PathSection(), new WaterSection()},
            {new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection(), new PathSection()},
            {new PathSection(), new PathSection(), new PlayerSection(currentPlayer, new PathSection()), new PathSection(), new PathSection(), new PathSection(),},
        };
        playerPosX = 5;
        playerPosY = 2;
        enemiesPosXY = new int[][]{
            {0,1},
            {0,2},
            {1,4}
        };
    }
    
    
    
}
