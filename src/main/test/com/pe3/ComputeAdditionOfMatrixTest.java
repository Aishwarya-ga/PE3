package com.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeAdditionOfMatrixTest {
    ComputeAdditionOfMatrix computeAdditionOfMatrix;
    @Before
    public void setUp() throws Exception {
        computeAdditionOfMatrix = new ComputeAdditionOfMatrix();
    }

    @After
    public void tearDown() throws Exception {
        computeAdditionOfMatrix = null;
    }

    @Test
    public void testAdditionOfMatrixSuccess3X2() {
        int[][] input1 = {{1,2},
                          {3,4},
                          {5,6},
                          };
        int[][] input2 = {{9,8},
                          {7,6},
                          {5,4}
                          };
        int[][] expectedValue = {{10,10},
                                 {10,10},
                                 {10,10}
                                };
        int rows = 3;
        int columns = 2;
        //Act
        int[][] actaualValue = computeAdditionOfMatrix.additionOfMatrix(rows,columns,input1,input2);
        //assert
        assertArrayEquals(expectedValue,actaualValue);


    }
    @Test
    public void testAdditionOfMatrixSuccess4X2() {
        int[][] input1 = {{1, 2},
                          {3, 4},
                          {5, 6},
                          {5, 5}
                         };
        int[][] input2 = {{9, 8},
                          {7, 6},
                          {5, 4},
                          {5, 5}
                         };
        int[][] expectedValue2 = {{10, 10}, {10, 10}, {10, 10}, {10, 10}};
        int rows2 = 4;
        int columns2 = 2;
        //Act
        int[][] actaualValue2 = computeAdditionOfMatrix.additionOfMatrix(rows2, columns2, input1, input2);
        //assert
        assertArrayEquals(expectedValue2, actaualValue2);
    }

    @Test
    public void testAdditionOfMatrixFailureForRowColum(){
        int[][] input1 = {{1,2},
                {3,4},
                {5,6},
        };
        int[][] input2 = {{9,8},
                {7,6},
                {5,4}
        };
        int[][] expectedValue = null;

        int rows = 0;
        int columns = 0;
        //Act
        int[][] actaualValue = computeAdditionOfMatrix.additionOfMatrix(rows,columns,input1,input2);
        //assert
        assertArrayEquals(expectedValue,actaualValue);

    }
    @Test
    public void testAdditionOfMatrixFailureForInputEmpty(){
        int[][] input1 = {};
        int[][] input2 = {};
        int[][] expectedValue = null;
        int rows = 3;
        int columns = 2;
        //Act
        int[][] actualValue = computeAdditionOfMatrix.additionOfMatrix(rows,columns,input1,input2);
        //Assert
        assertArrayEquals(expectedValue,actualValue);

    }
    @Test
    public void testAdditionOfMatrixFailureForInputNotEqual(){
        int[][] input1 = {{1,1},{2,3}};
        int[][] input2 = {{1,1,}};
        int[][] expectedValue = null;
        int rows = 3;
        int columns = 2;
        //Act
        int[][] actualValue = computeAdditionOfMatrix.additionOfMatrix(rows,columns,input1,input2);
        //Assert
        assertArrayEquals(expectedValue,actualValue);
    }

}