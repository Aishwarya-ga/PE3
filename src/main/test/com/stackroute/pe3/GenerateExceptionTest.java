package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GenerateExceptionTest {
    GenerateException generateException;
    @Before
    public void setUp() throws Exception {
        generateException = new GenerateException();
    }

    @After
    public void tearDown() throws Exception {
        generateException = null;
    }

    @Test
    public void generateIndexOutOfBoundsException() {
        try {
            new ArrayList<Object>().get(0);
            fail("Expected an IndexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index 0 out of bounds for length 0"));
        }

    }

    @Test
    public void generateNegativeArraySizeException() {
    }

    @Test
    public void generateNullPointerException() {
        generateNegativeArraySizeException();
        generateIndexOutOfBoundsException();
        try {
            int i = generateException.input;
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
            System.out.println("Nullpointer Exception");
        }
    }
}