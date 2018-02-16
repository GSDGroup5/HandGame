/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.player;

import com.gameproject.handgame.HandGame;
import com.gameproject.handgame.Rock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestPlayer {
    
    public TestPlayer() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGenerateRock() {
        Player player = new Player();
        HandGame rock = player.createRock();
        assertTrue(rock instanceof Rock);
    }
    
    @Test
    public void testGeneratePaper() {
        Player player = new Player();
        HandGame paper = player.createPaper();
        assertTrue(paper instanceof Paper);
    }

}
