/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.player;

import com.game.factory.HandGameFactory;
import com.gameproject.handgame.HandGame;
import com.gameproject.handgame.Paper;
import com.gameproject.handgame.Rock;
import com.gameproject.handgame.Scissor;

/**
 *
 * @author pc
 */
public class Player {

    private final static HandGameFactory HANDGAME = new HandGameFactory();

    public HandGame createRock() {
        return new Rock();
    }

    public HandGame createPaper() {
        return new Paper();
    }

    public HandGame createScissor() {
        return new Scissor();
    }

    /**
     * Create one of the options i.e Rock , Scissor ,Paper
     *
     * @param handGame i.e Rock , Scissor ,Paper
     * @return return object i.e Rock , Scissor ,Paper
     * @throws Exception class not found other then Rock , Scissor ,Paper
     */
    public HandGame invokeHandGame(String handGame) throws Exception {
        return HANDGAME.newHandGame(handGame);
    }
}
