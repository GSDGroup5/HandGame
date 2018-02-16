/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.player;

import com.gameproject.handgame.HandGame;
import com.gameproject.handgame.Paper;
import com.gameproject.handgame.Rock;
import com.gameproject.handgame.Scissor;

/**
 *
 * @author pc
 */
public class Player {

    public HandGame createRock() {
        return new Rock();
    }

    public HandGame createPaper() {
        return new Paper();
    }
    
    public HandGame createScissor() {
        return new Scissor();
    }
}