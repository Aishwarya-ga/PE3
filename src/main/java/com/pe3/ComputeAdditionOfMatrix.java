package com.pe3;

import java.util.Scanner;

public class ComputeAdditionOfMatrix {
    public int[][] additionOfMatrix(int rows,int columns,int[][] array1,int[][] array2) {

        if(!(array1.length <= 0 || array2.length <= 0 || rows<=0 || columns<=0 )){
            if(array1.length == array2.length) {
                int matrixaddition[][] = new int[rows][columns];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrixaddition[i][j] = array1[i][j] + array2[i][j];
                    }
                }
//                for (int i = 0; i < rows; i++) {
//                    for (int j = 0; j < columns; j++) {
//                        System.out.print(matrixaddition[i][j] + " ");
//                    }
//                    System.out.println();
//                }
                return matrixaddition;
            }
        }
        return null;
    }


}
