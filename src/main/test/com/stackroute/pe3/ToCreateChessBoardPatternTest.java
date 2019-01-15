package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToCreateChessBoardPatternTest {
    ToCreateChessBoardPattern toCreateChessBoardPattern;
    @Before
    public void setUp() throws Exception {
        toCreateChessBoardPattern = new ToCreateChessBoardPattern();
    }

    @After
    public void tearDown() throws Exception {
        toCreateChessBoardPattern = null;
    }
    /* method to test success*/
    @Test
    public void createChessBoardPatternSuccess() {
        String[] expected = {"WW|BB|WW|BB|WW|BB|WW|BB|","BB|WW|BB|WW|BB|WW|BB|WW|","WW|BB|WW|BB|WW|BB|WW|BB|","BB|WW|BB|WW|BB|WW|BB|WW|","WW|BB|WW|BB|WW|BB|WW|BB|","BB|WW|BB|WW|BB|WW|BB|WW|","WW|BB|WW|BB|WW|BB|WW|BB|","BB|WW|BB|WW|BB|WW|BB|WW|"};
        assertArrayEquals(expected,toCreateChessBoardPattern.CreateChessBoardPattern(8));
    }
    /* method to test failure*/
    @Test
    public void createChessBoardPatternFailure(){
        assertNull(toCreateChessBoardPattern.CreateChessBoardPattern('\0'));

    }
}