package com.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class CalculateFirstAndLastOfWeek {
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

    public static void main(String[] args){
        CalculateFirstAndLastOfWeek calculateFirstAndLastOfWeek = new CalculateFirstAndLastOfWeek();
        calculateFirstAndLastOfWeek.calculateFirstAndLastOfWeek();
    }
}
