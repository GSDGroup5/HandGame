/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.factory;

import com.gameproject.handgame.HandGame;

/**
 *
 * @author pc
 */
public class HandGameFactory {

    /**
     * Create the HandGame options i.e Rock , Scissor ,Paper
     *
     * @param className Rock , Scissor ,Paper
     * @return new object of Type Rock , Scissor ,Paper
     * @throws Exception class not found other then Rock , Scissor ,Paper
     */
    public static HandGame newHandGame(String className) throws Exception {
        try {
            Class baseClass = Class.forName(className);

            // check that HandGame is a super class of base class
            if (HandGame.class.isAssignableFrom(baseClass)) {
                Object newObject = baseClass.newInstance();
                return (HandGame) newObject;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new Exception("Not a valid base class name", e);
        }
        throw new Exception("Not a valid base class name");
    }
}
