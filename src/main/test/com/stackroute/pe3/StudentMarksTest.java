package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;
    private ByteArrayInputStream inputStream;
    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        inputStream.close();
    }
    /* method to test success */
    @Test
    public void getNumOfStudentSuccesss() {
        String INPUT = "4 11 12 13 14";
        inputStream = new ByteArrayInputStream(INPUT.getBytes());
        System.setIn(inputStream);
        assertEquals("Success",studentMarks.getNumOfStudents());
    }
    /* method to test failure */
    @Test
    public void  getNumOfStudentFailure(){
        String INPUT = "4 11 120 13 14";
        inputStream = new ByteArrayInputStream(INPUT.getBytes());
        System.setIn(inputStream);

        assertEquals("Failure",studentMarks.getNumOfStudents());
    }
}