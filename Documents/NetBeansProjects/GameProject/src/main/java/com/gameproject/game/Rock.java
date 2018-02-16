/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameproject.game;

/**
 *
 * @author pc
 */
public class Rock {

    /**
     * Rock against the paper
     *
     * @param paper Paper
     * @return -1 because Rock Loses to Paper
     */
    public int against(Paper paper) {
        return -1;
    }

    /**
     * Rock against the Scissor
     * @param scissor Scissor
     * @return 1 because Rock beats Scissor
     */
    public int against(Scissor scissor) {
        return 1;
    }
    
    /**
     * Rock against the Rock
     * @param rock Rock
     * @return 0 because Rock ties Rock
     */
    public int against(Rock rock) {
        return 0;
    }
}
