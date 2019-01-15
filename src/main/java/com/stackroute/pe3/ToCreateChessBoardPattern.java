/*Write a program to create a ChessBoard pattern with the help of multidimensional array,
*where WWrepresents white color and BB represents Black color.
*   Output:
*   My Chess Board
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
        WW|BB|WW|BB|WW|BB|WW|BB|
        BB|WW|BB|WW|BB|WW|BB|WW|
*/
package com.stackroute.pe3;

public class ToCreateChessBoardPattern {
    /*
    method to print chessboard pattern
     */
    public String[] CreateChessBoardPattern(int number) {
        String[] arr = new String[0];
        if (number == 8) {
            String[] array = new String[8];
            String string = "";
            for (int i = 0; i < number; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < number; j++) {
                        if (j % 2 == 0) {
                            string += "WW";
                            string += "|";
                        } else {
                            string += "BB";
                            string += "|";
                        }
                    }
                    array[i] = string;
                    string = "";
                } else {
                    for (int j = 0; j < number; j++) {
                        if (j % 2 == 0) {
                            string += "BB";
                            string += "|";
                        } else {
                            string += "WW";
                            string += "|";
                        }
                    }
                    array[i] = string;
                    string = "";
                }
            }
            return array;
        }
        return null;
    }
    public static void main(String[] args) {
        ToCreateChessBoardPattern toCreateChessBoardPattern = new ToCreateChessBoardPattern();
        String[] str;
        str = toCreateChessBoardPattern.CreateChessBoardPattern(8);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
