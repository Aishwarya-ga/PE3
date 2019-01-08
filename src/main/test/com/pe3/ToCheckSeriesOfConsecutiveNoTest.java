package com.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToCheckSeriesOfConsecutiveNoTest {
    ToCheckSeriesOfConsecutiveNo toCheckSeriesOfConsecutiveNo;
    @Before
    public void setUp() throws Exception {
        toCheckSeriesOfConsecutiveNo = new ToCheckSeriesOfConsecutiveNo();
    }

    @After
    public void tearDown() throws Exception {
        toCheckSeriesOfConsecutiveNo = null;
    }

    @Test
    public void toCheckSeriesOfConsecutiveNumbersSuccess() {
        boolean expected = true;
        String array = "2,3,4,1";
        boolean actual = toCheckSeriesOfConsecutiveNo.toCheckSeriesOfConsecutiveNumbers(array,4);
        assertEquals(expected,actual);

    }
    @Test
    public void setToCheckSeriesOfConsecutiveNoFailure(){
        boolean expected = false;
        String array = "1,2,3,1";
        boolean actual = toCheckSeriesOfConsecutiveNo.toCheckSeriesOfConsecutiveNumbers(array,4);
        assertEquals(expected,actual);
    }
    @Test
    public void setToCheckSeriesOfConsecutiveNoInputFailure() {
        boolean expected = false;
        String array = "20947";
        boolean actual = toCheckSeriesOfConsecutiveNo.toCheckSeriesOfConsecutiveNumbers(array, 0);
        assertNotEquals(expected, actual);
    }
    @Test
    public void setToCheckSeriesOfConsecutiveNoEmptyInput() {
        boolean expected = false;
        String array = " ";
        boolean actual = toCheckSeriesOfConsecutiveNo.toCheckSeriesOfConsecutiveNumbers(array, 0);
        assertEquals(expected, actual);

    }
    @Test
    public void setToCheckSeriesOfConsecutiveNoSuccessForSameNumbers(){
        boolean expected = true;
        String array = "1,1,1,1";
        boolean actual = toCheckSeriesOfConsecutiveNo.toCheckSeriesOfConsecutiveNumbers(array,4);
        assertNotEquals(expected,actual);
    }
    @Test
    public void setToCheckSeriesOfConsecutiveNoFailureForSpecialCharacter(){
        boolean expected = false;
        String array = "%";
        boolean actual = toCheckSeriesOfConsecutiveNo.toCheckSeriesOfConsecutiveNumbers(array,4);
        assertEquals(expected,actual);
    }
    @Test
    public void setToCheckSeriesOfConsecutiveNoSuccessForTwoSameNumbers(){
        boolean expected = false;
        String array = "0,0,0,0";
        boolean actual = toCheckSeriesOfConsecutiveNo.toCheckSeriesOfConsecutiveNumbers(array,4);
        assertEquals(expected,actual);
    }


}

