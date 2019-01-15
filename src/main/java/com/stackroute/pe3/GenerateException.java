/*Write a program that will generate exceptions of type NegativeArraySizeException,
* IndexOutOfBoundsException, NullPointerException. Record the catching of each exception
* by displaying the message stored in the exception object.
*/
package com.stackroute.pe3;

public class GenerateException {
    public int input = 10;
    /*
    method to generate Negative Array size exception
     */
    public void generateNegativeArraySizeException()
    {
        int arraySize = -1;
        try {
            int[] array = new int[arraySize];
        }
        catch (NegativeArraySizeException e) {
            System.out.println(e);
            System.out.println("Array size cannot be negative");
        }
    }
    /*
    method to generate IndexOutOfBound exception
     */
    public void generateIndexOutOfBoundsException()
    {
        int array[]=new int[5];
        try{
            array[6]=5;
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Array Index out of bound");
        }
    }
    /*
    method to generate NullPointer exception
     */
    private GenerateException nullPointer() {
        return null;
    }
}
