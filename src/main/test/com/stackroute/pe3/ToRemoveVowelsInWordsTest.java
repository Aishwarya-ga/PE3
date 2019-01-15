package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToRemoveVowelsInWordsTest {
    ToRemoveVowelsInWords toRemoveVowelsInWords;
    @Before
    public void setUp() throws Exception {
        toRemoveVowelsInWords = new ToRemoveVowelsInWords();
    }

    @After
    public void tearDown() throws Exception {
        toRemoveVowelsInWords = null;
    }
    /* method to test success */
    @Test
    public void removeVowelsInwordsSuccess() {
       String[] expected = {"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
       String[] input = {"India","United States","Germany","Egypt","czechoslovakia"};
       String[] actual = toRemoveVowelsInWords.RemoveVowelsInwords(input);
       assertArrayEquals(expected,actual);
    }
    /* method to test failure */
    @Test
    public void setToRemoveVowelsInWordsFailure(){
        String[] expected = null;
        String[] input = {};
        String[] actual = toRemoveVowelsInWords.RemoveVowelsInwords(input);
        assertArrayEquals(expected,actual);
    }
}