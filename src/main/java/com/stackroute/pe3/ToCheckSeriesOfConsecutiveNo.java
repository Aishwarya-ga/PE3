/*Write a program to find out if a series of 7 digits are consecutive numbers.
*To make this easier, assume the digits are a string and use split()
*        Input: 98,96,95,94,93
*        Output: 98,96,95,94,93 non consecutive numbers
*        Input: 54,53,52,51,50,49,48
*        Output : 54,53,52,51,50,49,48 are consecutive numbers
*        Input: 1,2,3,4,5,6,6
*        Output: 1,2,3,4,5,6,6 non consecutive numbers
*/

package com.stackroute.pe3;

public class ToCheckSeriesOfConsecutiveNo {
    /*
    method to check series of consecutive numbers
     */
    public boolean toCheckSeriesOfConsecutiveNumbers(String series, int n) {
        if (series.length() != '\0'){
            if(!((series.matches("[$#%^&*()]")) || (series==" ")) || (series.matches("[0-9]")) || (series==null))
            {
                String[] series1 = series.split(",");
                int[] array = new int[series1.length];
                int i = 0;

                for (String str : series1) {
                    array[i] = Integer.parseInt(str);
                    i++;
                }
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
                    return true;
                }
                if (apSum != arrSum) {
                    return false;
                }
            }
        }
        return false;
    }
}
