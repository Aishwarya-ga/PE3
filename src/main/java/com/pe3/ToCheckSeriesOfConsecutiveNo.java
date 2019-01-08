package com.pe3;

import java.util.Arrays;

public class ToCheckSeriesOfConsecutiveNo {
    public boolean toCheckSeriesOfConsecutiveNumbers(String series, int n) {
        if (series.length() != '\0'){

//            if(!((series == "[$&*()^%@!]") || (series == "#") || (series=="%") || (series=="[0-9]") || (series==" ")))
            if(!((series.matches("[$#%^&*()]")) || (series==" ")) || (series.matches("[0-9]")) || (series==null))
            {
                String[] series1 = series.split(",");
                int[] array = new int[series1.length];
                int i = 0;

                for (String str : series1) {
                    array[i] = Integer.parseInt(str);
                    i++;
                }
//                Arrays.sort(array);
                int firstterm = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (array[j] < firstterm)
                        firstterm = array[j];
                }
                int apSum = (n * (2 * firstterm + (n - 1) * 1)) / 2;
                int arrSum = 0;
                for (int j = 0; j < n; j++) {
                    arrSum += array[j];
                }

                // Compare both sums and return
                if (apSum == arrSum) {
//                    for (int k = 0; k < n; k++) {
//                        System.out.print(array[k] + " ");
//                    }
//                    System.out.println(" " + "is a Consecutive series");
                    return true;
                }
                if (apSum != arrSum) {
//                    for (int k = 0; k < n; k++) {
//                        System.out.print(array[k] + " ");
//                    }
//                    System.out.println(" " + "is a not Consecutive series");
                    return false;
                }

            }
        }
        return false;
    }

    public static void main(String[] args){
        ToCheckSeriesOfConsecutiveNo toCheckSeriesOfConsecutiveNo = new ToCheckSeriesOfConsecutiveNo();
        String array = "98,95,97,96";
        boolean check = toCheckSeriesOfConsecutiveNo.toCheckSeriesOfConsecutiveNumbers(array,4);
        System.out.println(check);
    }
}
