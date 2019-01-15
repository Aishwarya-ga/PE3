package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFirstAndLastOfWeekTest {
    CalculateFirstAndLastOfWeek calculateFirstAndLastOfWeek;
    @Before
    public void setUp() throws Exception {
        calculateFirstAndLastOfWeek = new CalculateFirstAndLastOfWeek();
    }
    @After
    public void tearDown() throws Exception {
        calculateFirstAndLastOfWeek = null;
    }
    /* method to test success*/
    @Test
    public void calculateFirstAndLastOfWeekSuccess() {

        calculateFirstAndLastOfWeek.calculateFirstAndLastOfWeek();
    }
    /*method to test failure*/
    @Test
    public void calculateFirstAndLastOfWeekFailure() {

        assertNotNull(calculateFirstAndLastOfWeek);
    }
}


