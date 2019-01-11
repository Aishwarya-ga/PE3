/*Create a class called StudentMarks, which prompts user for the number of students,
* reads it from the keyboard, and saves it in an int variable called numOfStudents.
* It then prompts user for the grades of each of the students and saves them in an
* int array called stuGrades. Your program shall check that the grade is between 0 and 100
* else has to trow an error message.
 */
package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    private int numOfStudents;
    private int stuGrades[] = new int[20];
    /*
    method to get num of studenta and validate their marks
     */
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
    /*
    method to validate grades
     */
    public static boolean gradeValidate(int gradevalue){
        if ((gradevalue >= 0) && (gradevalue <= 100))
            return true;

        return false;
    }
}




