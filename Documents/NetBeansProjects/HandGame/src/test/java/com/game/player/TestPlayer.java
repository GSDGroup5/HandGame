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
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author pc
 */
@RunWith(Parameterized.class)
public class TestPlayer {

    private static final Logger LOG = Logger.getLogger(TestPlayer.class.getName());
    private final static String ROCK = "com.gameproject.handgame.Rock";
    private final static String PAPER = "com.gameproject.handgame.Paper";
    private final static String SCISSOR = "com.gameproject.game.Scissor";

    public TestPlayer() {
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[100][0]);
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

    /**
     * This Method runs the test for: 1- Rock Vs Rock 2- Rock Vs Scissor 3- Rock
     * Vs Paper 100 times
     *
     * @throws Exception
     */
    @Test
    public void runHandGameMultipleTimes() throws Exception {
        testRockAgainstRock();
        testRockAgainstPaper();
        testRockAgainstScissor();
    }

    /**
     * Player1 plays against Player2 using Rock and Paper option
     *
     * @throws Exception create class other then Rock , Scissor ,Paper then
     * exception is thrown
     */
    public void testRockAgainstPaper() throws Exception {
        Player player1 = new Player();
        Player player2 = new Player();
        HandGame rock = player1.invokeHandGame(ROCK);
        HandGame paper = player2.invokeHandGame(PAPER);

        LOG.info("Rock is defeated by Paper");
        assertTrue(((Rock) rock).against((Paper) paper) < 0);
    }

    /**
     * Player1 plays against Player2 using Rock and Scissor option
     *
     * @throws Exception create class other then Rock , Scissor ,Paper then
     * exception is thrown
     */
    public void testRockAgainstScissor() throws Exception {
        Player player1 = new Player();
        Player player2 = new Player();
        HandGame rock = player1.invokeHandGame(ROCK);
        HandGame scissor = player2.invokeHandGame(SCISSOR);

        LOG.info("Rock beats Scissor");
        assertTrue(((Rock) rock).against((Scissor) scissor) > 0);
    }

    /**
     * Player1 plays against Player2 using Rock and Rock option
     *
     * @throws Exception create class other then Rock , Scissor ,Paper then
     * exception is thrown
     */
    public void testRockAgainstRock() throws Exception {
        Player player1 = new Player();
        Player player2 = new Player();
        HandGame rock = player1.invokeHandGame(ROCK);
        HandGame rock2 = player2.invokeHandGame(ROCK);

        LOG.info("Rock ties Rock");
        assertTrue(((Rock) rock).against((Rock) rock2) == 0);
    }
}
