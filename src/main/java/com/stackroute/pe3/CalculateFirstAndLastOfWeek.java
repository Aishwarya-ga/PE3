/*Write a java program to calculate first and last date of a week.
*        Output:
*        First Date of Week:             Mon 24/07/2017
*        Last date of the week:          Sun 30/07/2017
*/

package com.stackroute.pe3;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class CalculateFirstAndLastOfWeek {
    /*
    method to claculate first and last day of week
     */
    public void calculateFirstAndLastOfWeek() {
        LocalDate today = LocalDate.now();
        // Go backward to get Monday
        LocalDate monday = today;
        while (monday.getDayOfWeek() != DayOfWeek.MONDAY) {
            monday = monday.minusDays(1);
        }
        // Go forward to get Sunday
        LocalDate sunday = today;
        while (sunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
            sunday = sunday.plusDays(1);
        }
        System.out.println("Today: " + today);
        System.out.println("Monday date this week" + monday);
        System.out.println("Sunday date this week" + sunday);
    }
}
