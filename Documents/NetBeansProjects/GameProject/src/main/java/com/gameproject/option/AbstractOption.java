/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameproject.option;

import com.gameproject.game.Paper;
import com.gameproject.game.Rock;
import com.gameproject.game.Scissor;

/**
 *
 * @author pc
 */
public abstract class AbstractOption {
    
    public abstract int against(Paper paper);
    public abstract int against(Scissor scissor);
    public abstract int against(Rock rock);
}
