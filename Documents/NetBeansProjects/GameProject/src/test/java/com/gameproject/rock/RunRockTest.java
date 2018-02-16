/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameproject.rock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author pc
 */
public class RunRockTest {

    public RunRockTest() {
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
    public void testRockBeatsPaper() {
        Rock rock = new Rock();
        Paper paper = new Paper();

        Assert.assertTrue("Rock is defeated by Paper", rock.beats(paper) < -1);
    }
}
