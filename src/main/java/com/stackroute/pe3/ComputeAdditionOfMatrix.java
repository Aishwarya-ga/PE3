/*Write a program to compute the addition of two matrix, Read the number of rows and columns as input,
* also the values of each matrix
*        Output:
*        Input number of rows of matrix: 3
*        Input number of columns of matrix: 2
*        Input elements of first matrix: 1 2 3 4 5 6
*        Input the elements of second matrix: 9 8 7 6 5 4
*        Sum of the matrices:-
*        10        10
*        10        10
*        10        10
*/
package com.stackroute.pe3;

public class ComputeAdditionOfMatrix {
    /*
    method to addition of two matrix
     */
    public int[][] additionOfMatrix(int rows,int columns,int[][] array1,int[][] array2) {
        if(!(array1.length <= 0 || array2.length <= 0 || rows<=0 || columns<=0 )){
            if(array1.length == array2.length) {
                int matrixaddition[][] = new int[rows][columns];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrixaddition[i][j] = array1[i][j] + array2[i][j];
                    }
                }
                return matrixaddition;
            }
        }
        return null;
    }
}
