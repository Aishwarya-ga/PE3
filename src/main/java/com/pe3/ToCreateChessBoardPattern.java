package com.pe3;

public class ToCreateChessBoardPattern {
    public String[] CreateChessBoardPattern(){
        String[] array = new String[8];
        String string = "";
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        string += "WW";
                        string += "|";
                    }
                    else{
                        string += "BB";
                        string += "|";
                    }
                }
                array[i] = string;
                string = "";
            }
            else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        string += "BB";
                        string += "|";
                    }
                    else {
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
    public static void main(String[] args) {
        ToCreateChessBoardPattern toCreateChessBoardPattern = new ToCreateChessBoardPattern();
        String[] str;
        str = toCreateChessBoardPattern.CreateChessBoardPattern();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
