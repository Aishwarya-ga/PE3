package com.pe3;

import java.util.Scanner;

public class StudentMarks {
    private int numOfStudents;
    private int stuGrades[] = new int[20];

    public String getNumOfStudents() {
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        int i = 0, index = 0, gradeValue, flag = 0;
        int[] studentGrades = new int[numOfStudents];
        while (i < numOfStudents) {
            gradeValue = scanner.nextInt();
            boolean val = gradeValidate(gradeValue);
            if (val) {
                studentGrades[index++] = gradeValue;
            }
            else {
                flag = 1;
                break;
            }
            i++;
        }
        if (flag == 1) {
            return "Failure";
        }
        return "Success";
    }

    public static boolean gradeValidate(int gradevalue){
        if ((gradevalue >= 0) && (gradevalue <= 100))
            return true;

        return false;
    }



        public static void main(String[] args){
            StudentMarks studentMarks = new StudentMarks();
            String output = studentMarks.getNumOfStudents();
            System.out.println(output);
        }

}




