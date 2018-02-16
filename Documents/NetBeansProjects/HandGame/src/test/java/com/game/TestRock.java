/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game;

import com.gameproject.handgame.Paper;
import com.gameproject.handgame.Rock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestRock {
    
    public TestRock() {
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
     * method validates Rock against the Paper
     * @Rule Rock is defeated by Paper
     */
    @Test
    public void testRockAgainstPaper() {
        Rock rock = new Rock();
        Paper paper = new Paper();
        
        System.out.println("Rock is defeated by Paper");
        Assert.assertTrue("Rock is defeated by Paper", rock.against(paper) < 0);
    }
    
     /**
     * validates Rock against the Scissor
     * @Rule Rock  beats Scissor
     */
    @Test
    public void testRockAgainstScissor() {
        Rock rock = new Rock();
        Scissor scissor = new Scissor();
        
        System.out.println("Rock beats Scissor");
        Assert.assertTrue("Rock beats Scissor", rock.against(scissor) > 0);
    }
}
